package quiz.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Account {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	private String password;
	private String email;
	
	@Column(name = "registration_date")
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	
	@OneToMany(mappedBy = "account")
	private List<QuizSubmission> quizSubmissions;
	
	public Account(){
		
	}
	
	public Account(String username, String password, String email, Date releaseDate) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.releaseDate = releaseDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", email=" + email + ", releaseDate=" + releaseDate
				+ "]";
		
		
	}

	public List<QuizSubmission> getQuizSubmissions() {
		return quizSubmissions;
	}

	public void setQuizSubmissions(List<QuizSubmission> quizSubmissions) {
		this.quizSubmissions = quizSubmissions;
	}

	public void setId(int id) {
		this.id = id;
	}
	
//	CREATE TABLE account
//	(
//	  id                 INTEGER NOT NULL AUTO_INCREMENT,
//	  username           VARCHAR(30) NOT NULL,
//	  password           VARCHAR(30) NOT NULL,
//	  email              VARCHAR(30),
//	  registration_date  DATE,
//	  PRIMARY KEY (id), 
//	  UNIQUE (username)
//	);
}
