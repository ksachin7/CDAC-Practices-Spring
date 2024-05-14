package hibernate.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		System.out.println("Student details: ");
//		fetchin the data(will work when using update command)
		Student stud = session.get(Student.class, 10);
//		Student stud = session.load(Student.class, 10);
		System.out.println(stud);

		System.out.println("\nAddress details: ");
		Address addr = session.get(Address.class, 1);
//		Address addr = session.load(Address.class, 1);
		System.out.println(addr);

		session.close();
		factory.close();
	}
}
