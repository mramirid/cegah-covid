package com.mramirid.cegahcovid_19.ui.checkup

import androidx.lifecycle.ViewModel
import com.mramirid.cegahcovid_19.helper.CheckupQuestions
import com.mramirid.cegahcovid_19.model.CheckupQuestion

class CheckupViewModel : ViewModel() {

    private lateinit var questions: List<CheckupQuestion>

    fun getQuestions(): List<CheckupQuestion> {
        if (!this::questions.isInitialized) {
            questions = CheckupQuestions.getCheckupQuestions()
        }
        return questions
    }

    fun checkQuestionAnswers(questions: List<CheckupQuestion>): Boolean {
        questions.forEach { question ->
            if (!question.hasAnswered) {
                return false
            }
        }
        return true
    }

    fun getResultCheckup(questions: List<CheckupQuestion>): String {
        var totalAnswerYes = 0

        questions.forEach { question ->
            if (question.answer) {
                ++totalAnswerYes
            }
        }

        return when (totalAnswerYes) {
            in 0..7 -> "Tingkat resiko anda terinfeksi COVID-19 adalah rendah"
            in 8..14 -> "Tingkat resiko anda terinfeksi COVID-19 adalah sedang"
            in 15..21 -> "Tingkat resiko anda terinfeksi COVID-19 adalah tinggi"
            else -> "Oops! Terjadi kesalahan"
        }
    }
}