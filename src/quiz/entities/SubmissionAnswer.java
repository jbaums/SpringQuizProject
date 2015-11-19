package quiz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "submission_answer")
public class SubmissionAnswer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @ManyToOne
    @JoinColumn(name="submission_id")
    private QuizSubmission quizSubmission;
    
    @ManyToOne
    @JoinColumn(name="question_id")
    private Question question;
    
    @ManyToOne
    @JoinColumn(name="answer_id")
    private Answer answer;

    
    public SubmissionAnswer(){
    }
    
    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public QuizSubmission getQuizSubmission() {
		return quizSubmission;
	}

	public void setQuizSubmission(QuizSubmission quizSubmission) {
		this.quizSubmission = quizSubmission;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	
	@Override
	public String toString() {
		return "SubmissionAnswer [id=" + id + ", quizSubmission=" + quizSubmission + ", question=" + question
				+ ", answer=" + answer + "]";
	}
    
}
