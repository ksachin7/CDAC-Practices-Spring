package hibernate.mappings.manytoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answers {
	@Id
	@Column(name = "answer_id")
	private int ans_id;
	private String answer;

	@ManyToOne
	private Questions question;

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questions getQuestion() {
		return question;
	}

	public void setQuestion(Questions question) {
		this.question = question;
	}

	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answers(int ans_id, String answer) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", answer=" + answer + "]";
	}

}
