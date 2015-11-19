package quiz.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author josephbaumberger
 *
 */
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String text;
    
    private boolean isCorrect;
    
    @ManyToOne
    @JoinColumn(name="question_id")
    private Question question;
    
    @OneToMany(mappedBy="answer")
	private List<SubmissionAnswer> submissionAnswers;
    
    
    public Answer(){} //no arg constructor
    
    public Answer(Question question, String text, boolean isCorrect) {
        super();
        this.question = question;
        this.text = text;
        this.isCorrect = isCorrect;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Question getQuestionId() {
        return question;
    }
    public void setQuestionId(Question questionId) {
        this.question = questionId;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public boolean getIsCorrect() {
        return isCorrect;
    }
    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public List<SubmissionAnswer> getSubmissionAnswers() {
		return submissionAnswers;
	}

	public void setSubmissionAnswers(List<SubmissionAnswer> submissionAnswers) {
		this.submissionAnswers = submissionAnswers;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
    
	
  //CREATE TABLE answer
  //(
  //  id              INTEGER NOT NULL AUTO_INCREMENT,
  //  question_id     INTEGER NOT NULL,
  //  text            VARCHAR(50) NOT NULL,
  //  isCorrect       CHAR(1),
  //  PRIMARY KEY (id),
  //  FOREIGN KEY (question_id) REFERENCES question(id)
  //);

}
