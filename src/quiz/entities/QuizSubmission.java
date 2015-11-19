package quiz.entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class QuizSubmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column (name="submission_time")
    private Date submissionTime;
    
    @OneToMany(mappedBy="quizSubmission")
	private List<SubmissionAnswer> submissionAnswers;
    
    @ManyToOne
    @JoinColumn(name="quiz_id")
    private Quiz quiz;
    
    @ManyToOne
    @JoinColumn(name="user_id")
    private Account account;

    
    QuizSubmission(){
    	
    }


	public int getId() {
		return id;
	}



	public Date getSubmissionTime() {
		return submissionTime;
	}


	public void setSubmissionTime(Time submissionTime) {
		this.submissionTime = submissionTime;
	}


	public List<SubmissionAnswer> getSubmissionAnswers() {
		return submissionAnswers;
	}


	public void setSubmissionAnswers(List<SubmissionAnswer> submissionAnswers) {
		this.submissionAnswers = submissionAnswers;
	}


	public Quiz getQuiz() {
		return quiz;
	}


	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "QuizSubmission [id=" + id + ", submissionTime=" + submissionTime + ", submissionAnswers="
				+ submissionAnswers + ", quiz=" + quiz + ", account=" + account + "]";
	}

    
}
