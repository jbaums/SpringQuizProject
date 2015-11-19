//package quiz.entities;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
//import javax.persistence.Table;
//
//import quiz.entities.QuizQuestion.QuizQuestionPK;
//
//@Entity
//@Table(name="quiz_question")
//@IdClass(QuizQuestionPK.class)
//public class QuizQuestion {
//    
//    @Id
//    @Column(name="quiz_id")
//    private int quizId;
//    
//    @Id 
//    @Column(name="question_id")
//    private int questionId;
//    
//    //the Embedded Class
//    
//    @SuppressWarnings("serial")
//	class QuizQuestionPK implements Serializable{
//        //--------------------------PK CLASS--------------------------
//        //Class Required for Composite Primary Key. Rules: 
//        // 1. It must have a default constructor without arguments.
//        // 2. It must implement the java.io.Serializable interface.
//        // 3. It must override the methods equals and hashCode.
//        private int quizId;
//        private int questionId;        //google how fields are handled within embedded classes/annotations
//        
//        public QuizQuestionPK(){}
//
//        public QuizQuestionPK(int quizId, int questionId) {
//            super();
//            this.quizId = quizId;
//            this.questionId = questionId;
//        }
//
//        @Override
//        public int hashCode() {
//            final int prime = 31;
//            int result = 1;
//            result = prime * result + getOuterType().hashCode();
//            result = prime * result + questionId;
//            result = prime * result + quizId;
//            return result;
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            if (this == obj)
//                return true;
//            if (obj == null)
//                return false;
//            if (getClass() != obj.getClass())
//                return false;
//            QuizQuestionPK other = (QuizQuestionPK) obj;
//            if (!getOuterType().equals(other.getOuterType()))
//                return false;
//            if (questionId != other.questionId)
//                return false;
//            if (quizId != other.quizId)
//                return false;
//            return true;
//        }
//
//        private QuizQuestion getOuterType() {
//            return QuizQuestion.this;
//        }
//
//		public int getQuizId() {
//			return quizId;
//		}
//
//		public void setQuizId(int quizId) {
//			this.quizId = quizId;
//		}
//
//		public int getQuestionId() {
//			return questionId;
//		}
//
//		public void setQuestionId(int questionId) {
//			this.questionId = questionId;
//		}
//    }
//}

//CREATE TABLE quiz_question
//(
//  quiz_id        INTEGER NOT NULL,
//  question_id    INTEGER NOT NULL,
//  PRIMARY KEY (quiz_id, question_id),
//  FOREIGN KEY (quiz_id) REFERENCES quiz(id),
//  FOREIGN KEY (question_id) REFERENCES question(id)
//);