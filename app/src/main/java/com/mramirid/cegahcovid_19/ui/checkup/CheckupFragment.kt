package com.mramirid.cegahcovid_19.ui.checkup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.mramirid.cegahcovid_19.R
import kotlinx.android.synthetic.main.fragment_checkup.*

class CheckupFragment : Fragment() {

    private val checkupViewModel by viewModels<CheckupViewModel>()
    private lateinit var questionsAdapter: QuestionsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_checkup, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        questionsAdapter = QuestionsAdapter(checkupViewModel.getQuestions())

        rv_questions.layoutManager = LinearLayoutManager(context)
        rv_questions.setHasFixedSize(true)
        rv_questions.adapter = questionsAdapter

        btn_submit.setOnClickListener {
            val answeredQuestions = questionsAdapter.getAdapterQuestions()

            if (!checkupViewModel.checkQuestionAnswers(answeredQuestions)) {
                Toast.makeText(context, "Semua pertanyaan belum anda jawab", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            val resultMessage = checkupViewModel.getResultCheckup(answeredQuestions)

            val alertDialogBuilder = AlertDialog.Builder(context!!)
            alertDialogBuilder
                .setTitle("Hasil Checkup")
                .setMessage(resultMessage)
                .setCancelable(true)
                .setPositiveButton("Ulangi") { _, _ ->
                    // Recreate adapter
                    questionsAdapter = QuestionsAdapter(checkupViewModel.getQuestions())
                    rv_questions.adapter = questionsAdapter
                }
                .setNegativeButton("Tutup") { dialog, _ ->
                    dialog.cancel()
                }

            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }
    }
}
