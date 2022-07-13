package com.example.bhaswitha;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@SpringBootApplication
public class BhaswithaApplication {
	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BhaswithaApplication.class, args);


	}

	@Bean
    static
    CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate) {
        return args -> {
            Student student = new Student(
                5 , 
                "Marry", 
                "", 
                "marry@okay.com", 
                "FEMALE", 
                10, 
                88.2
            );

			//repository.insert(student);

			Query query = new Query();
			query.addCriteria(Criteria.where("email").is("jenden@okay.com"));

			List<Student> students = mongoTemplate.find(query, Student.class);

			for (Student s : students) {
				System.out.println(s);
			}
			
			
        };

    }

}
