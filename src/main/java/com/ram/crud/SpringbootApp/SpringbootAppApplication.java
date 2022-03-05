package com.ram.crud.SpringbootApp;

import com.ram.crud.SpringbootApp.entity.Student;
import com.ram.crud.SpringbootApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student student1=	new Student("firstName1","lastName1","firstName-1@email.id");
//		studentRepository.save(student1);
//
//		Student student2=	new Student("firstName2","lastName2","firstName-2@email.id");
//		studentRepository.save(student2);
//
//		Student student3=	new Student("firstName3","lastName3","firstName-3@email.id");
//		studentRepository.save(student3);
//
//		Student student4=	new Student("firstName4","lastName4","firstName-4@email.id");
//		studentRepository.save(student4);

	}
}
