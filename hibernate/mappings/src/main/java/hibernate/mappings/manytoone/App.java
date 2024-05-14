package hibernate.mappings.manytoone;

import java.util.ArrayList;
import java.util.List;

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
		Questions q1 = new Questions();
		q1.setQid(1);
		q1.setQuestion("What is java?");

		// setting the answer
		Answers ans1 = new Answers();
		ans1.setAns_id(01);
		ans1.setAnswer("Java is a programming language.");
		ans1.setQuestion(q1);

		// setting the answer2
		Answers ans2 = new Answers();
		ans2.setAns_id(02);
		ans2.setAnswer("Java is an OOPL");
		ans2.setQuestion(q1);

		// setting the answer3
		Answers ans3 = new Answers();
		ans3.setAns_id(03);
		ans3.setAnswer("Java is platform indipendent.");
		ans3.setQuestion(q1);

		List<Answers> list = new ArrayList<Answers>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);

		q1.setAnswers(list);

		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		ses.save(q1);
//		ses.save(ans1);

		tx.commit();
//
//		// fetching data
//		Question newQ = ses.get(Question.class, 1);
//		for(Answer a: newQ.getAnswers()) {
//			System.out.println(a.getAnswer());
//		}
//		
		ses.close();
		sf.close();
	}
}
