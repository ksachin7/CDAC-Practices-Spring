package hibernate.mappings.manytoone;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Questions {
	@Id
	@Column(name = "question_id")
	private int qid;
	private String question;

	@OneToMany(mappedBy = "question")
	private List<Answers> answer;

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

	public List<Answers> getAnswers() {
		return answer;
	}

	public void setAnswers(List<Answers> answers) {
		this.answer = answers;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questions(int qid, String question, List<Answers> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answer = answers;
	}

}
