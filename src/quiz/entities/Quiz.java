package quiz.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Quiz {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany
	@JoinTable(name="QUIZ_QUESTION",
	  joinColumns= @JoinColumn(name="QUIZ_ID"),
	  inverseJoinColumns = @JoinColumn(name="QUESTION_ID"))
	private List<Question> questions;
	
	@OneToMany(mappedBy = "quiz")
	private List<QuizSubmission> quizSubmissions;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public List<QuizSubmission> getQuizSubmissions() {
		return quizSubmissions;
	}
	public void setQuizSubmissions(List<QuizSubmission> quizSubmissions) {
		this.quizSubmissions = quizSubmissions;
	}
	
}
