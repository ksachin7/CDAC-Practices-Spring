package com.example.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.jpa.dao.UserRepository;
import com.example.jpa.entities.User;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);

		// creating user
		User usr1 = new User();
		usr1.setName("xyz");
		usr1.setCity("Gaya");
		usr1.setStatus("I'm a java programmer!");

//		User usr1 = userRepo.save(usr);
//		System.out.println(usr1 );

		User usr2 = new User();
		usr2.setName("abc");
		usr2.setCity("Patna");
		usr2.setStatus("I'm a python programmer!");

		// saving multiple users
		List<User> usrs = List.of(usr1, usr2);
		Iterable<User> result = userRepo.saveAll(usrs);

		result.forEach(usr -> System.out.println(usr));
		System.out.println("Done saved!");

		// updating user
		Optional<User> optional = userRepo.findById(1);
		User usr = optional.get();
		usr.setName("newname");
		userRepo.save(usr);

		System.out.println("\ndone updated!");
		System.out.println(usr);
		System.out.println();

		// getting user data
		Iterable<User> itr = userRepo.findAll();
//
//		// old way
//		Iterator<User> iterator = itr.iterator();
//		while (iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
//
//		// the new way
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});

		// the better way
		System.out.println("Printing all users: ");
		itr.forEach(user -> System.out.println(user));

		// deleting user
		userRepo.deleteById(2);
		System.out.println("\ndeleted user: " + usr.getName());

		// deleting all user
//		userRepo.deleteAll(itr);

		// using derived query method
		List<User> users = userRepo.findByName("abc");
		users.forEach(e -> System.out.println(e));
	}

}
