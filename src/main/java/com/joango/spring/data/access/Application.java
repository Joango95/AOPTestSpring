package com.joango.spring.data.access;

import com.joango.spring.data.access.dao.ClientDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(exclude = {
	DataSourceAutoConfiguration.class,
	DataSourceTransactionManagerAutoConfiguration.class,
	HibernateJpaAutoConfiguration.class
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		ClientDAO myClient = context.getBean("clientDAO", ClientDAO.class);
		myClient.insertClient();
		context.close();
	}

}
