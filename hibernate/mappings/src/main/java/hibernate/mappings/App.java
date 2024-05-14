package hibernate.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
//	@SuppressWarnings("deprecation")

	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();

		// creating a question
		Question q1 = new Question();
		q1.setQid(1);
		q1.setQuestion("What is java?");

		// setting the answer
		Answer ans1 = new Answer();
		ans1.setAns_id(01);
		ans1.setAnswer("Java is a programming language.");
		ans1.setQuestion(q1);

		q1.setAnswer(ans1);

		// creating another question
		Question q2 = new Question();
		q2.setQid(2);
		q2.setQuestion("What is HTML?");

		// setting the answer
		Answer ans2 = new Answer();
		ans2.setAns_id(02);
		ans2.setAnswer("HTML is a Scripting language.");
		ans2.setQuestion(q2);

		q2.setAnswer(ans2);

		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		ses.save(q1);
		ses.save(ans1);

		ses.save(q2);
		ses.save(ans2);

		tx.commit();

		// fetching data
		Question newQ = ses.get(Question.class, 1);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());

		ses.close();
		sf.close();
	}
}
