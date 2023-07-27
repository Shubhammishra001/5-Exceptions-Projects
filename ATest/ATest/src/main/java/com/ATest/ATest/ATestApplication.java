package com.ATest.ATest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ATestApplication  implements CommandLineRunner {
    @Autowired UserRepo ob;

	public static void main(String[] args) {
		SpringApplication.run(ATestApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception
    {
        // Inserting the data in the mysql table.
        User first = new User(1, "Aayush");
        // ob.save() method
        ob.save(first);
        System.out.println("inserted");
    }
}
