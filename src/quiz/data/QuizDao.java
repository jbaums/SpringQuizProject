package quiz.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import quiz.entities.Quiz;

@Component
@Transactional
public class QuizDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public String getQuizName(int id) {
		Quiz q = em.find(Quiz.class, id);
		return q.getName();
	}
	
	public void changeName(int id, String name) {
		Quiz q = em.find(Quiz.class, id);
		q.setName(name);
	}
}
