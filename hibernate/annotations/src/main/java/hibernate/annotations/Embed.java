package hibernate.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embed {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Full-stack-developement");
		certificate1.setDuration("6-month");

		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Spoken-English");
		certificate2.setDuration("3-month");

		Student stud1 = new Student();
		stud1.setId(8);
		stud1.setName("john");
		stud1.setCity("las vegas");
		stud1.setCert(certificate1);

		Student stud2 = new Student();
		stud2.setId(9);
		stud2.setName("Lucy");
		stud2.setCity("UK");
		stud2.setCert(certificate2);

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(stud1);
		session.save(stud2);

		tx.commit();
		session.close();
		sf.close();

	}
}
