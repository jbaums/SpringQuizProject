package quiz.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String text;

	@ManyToMany(mappedBy="questions")
	private List<Quiz> quizzes;

	@OneToMany(mappedBy="question")
	private List<Answer> answers;
	
    @OneToMany(mappedBy="question")
	private List<SubmissionAnswer> submissionAnswers;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getId() {
		return id;
	}
	public List<Quiz> getQuizzes() {
		return quizzes;
	}
	public void setQuizzes(List<Quiz> quizzes) {
		this.quizzes = quizzes;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public List<SubmissionAnswer> getSubmissionAnswers() {
		return submissionAnswers;
	}
	public void setSubmissionAnswers(List<SubmissionAnswer> submissionAnswers) {
		this.submissionAnswers = submissionAnswers;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
