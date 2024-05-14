package hibernate.mappings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "answer_id")
	private int ans_id;
	private String answer;

	@OneToOne(mappedBy = "answer")
	private Question question;

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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int ans_id, String answer) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", answer=" + answer + "]";
	}

}
