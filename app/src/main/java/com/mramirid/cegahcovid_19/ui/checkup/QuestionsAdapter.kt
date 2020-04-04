package com.mramirid.cegahcovid_19.ui.checkup

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mramirid.cegahcovid_19.R
import com.mramirid.cegahcovid_19.model.CheckupQuestion
import kotlinx.android.synthetic.main.question_item.view.*

class QuestionsAdapter(
    private val questions: List<CheckupQuestion>
) : RecyclerView.Adapter<QuestionsAdapter.QuestionViewHolder>() {

    fun getAdapterQuestions(): List<CheckupQuestion> {
        return questions
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): QuestionViewHolder {
        return QuestionViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.question_item, parent, false)
        )
    }

    override fun getItemCount() = questions.size

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        holder.bindView(questions[position], position)
    }

    inner class QuestionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(checkupQuestion: CheckupQuestion, position: Int) {
            with(itemView) {
                tv_question.text = checkupQuestion.question

                rg_answers.setOnCheckedChangeListener { _, checkedId ->
                    when (checkedId) {
                        R.id.rb_yes -> {
                            questions[position].answer = true
                        }
                        R.id.rb_no -> {
                            questions[position].answer = false
                        }
                    }
                    questions[position].hasAnswered = true
                }
            }
        }
    }
}