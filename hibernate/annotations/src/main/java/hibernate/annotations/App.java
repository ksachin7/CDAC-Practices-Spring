package hibernate.annotations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {

		System.out.println("Project is running fine!");

//		Configuration cfg = new Configuration();
//		cfg.configure();
//		SessionFactory factory = cfg.buildSessionFactory();

//		In short we can write above lines as:
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();

//		System.out.println(factory);
//		System.out.println(factory.isClosed());

		Student stud1 = new Student();
		stud1.setId(01);
		stud1.setName("xyz");
		stud1.setCity("Gaya");

		Student stud2 = new Student();
		stud2.setId(10);
		stud2.setName("unknown");
		stud2.setCity("Pune");

		Address addr = new Address();
		addr.setStreet("strret-1");
		addr.setCity("Patna");
		addr.setOpen(true);
		addr.setAddDate(new Date());
		addr.setX(13114.1342);

//		FileInputStream fs = new FileInputStream("src/main/java/sticker.png");
		FileInputStream fs = new FileInputStream("src/main/java/hacker.jpg");
		byte[] data = new byte[fs.available()];
		fs.read(data);
		addr.setImg(data);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(stud1);
		session.save(stud2);
		session.save(addr);
		tx.commit();

//		fetchin the data(will work when using create command)
		System.out.println("\nFetching data...");
		Student stud = session.get(Student.class, 10);
		System.out.println(stud);

		fs.close();
		session.close();
		System.out.println("Done!");

	}
}
