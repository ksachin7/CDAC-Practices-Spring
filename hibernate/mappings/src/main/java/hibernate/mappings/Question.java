package hibernate.mappings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@Column(name = "question_id")
	private int qid;
	private String question;

	@OneToOne
//	@JoinColumn(name = "a_id")	// used to rename fk
	private Answer answer;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int qid, String question, Answer answer) {
		super();
		this.qid = qid;
		this.question = question;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", answer=" + answer + "]";
	}

}
