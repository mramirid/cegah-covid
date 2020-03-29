package com.mramirid.cegahcovid_19.ui.statistics

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import com.mramirid.cegahcovid_19.model.StatusCovid
import cz.msebera.android.httpclient.Header
import org.json.JSONArray

class StatisticsViewModel : ViewModel() {

    companion object {
        private const val URL_API = "https://api.kawalcorona.com/indonesia/"
    }

    private val statusCovidId = MutableLiveData<StatusCovid>()
    private val hasReceived = MutableLiveData<Boolean>()

    fun fetchStatus() {
        AsyncHttpClient().get(URL_API, object : AsyncHttpResponseHandler() {
            override fun onSuccess(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?
            ) {
                val result = String(responseBody!!)
                val responseArray = JSONArray(result)

                for (i in 0 until responseArray.length()) {
                    val responseObject = responseArray.getJSONObject(i)
                    val statusCovid = StatusCovid(
                        responseObject.getString("name"),
                        responseObject.getString("positif"),
                        responseObject.getString("sembuh"),
                        responseObject.getString("meninggal")
                    )
                    statusCovidId.postValue(statusCovid)
                }

                hasReceived.postValue(true)
            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?,
                error: Throwable?
            ) {
                hasReceived.postValue(false)
            }

        })
    }

    fun getStatusCovidId(): MutableLiveData<StatusCovid> {
        return statusCovidId
    }

    fun getStatusRequest(): MutableLiveData<Boolean> {
        return hasReceived
    }
}