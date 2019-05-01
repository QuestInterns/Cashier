package me.salisuwy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "me.salisuwy", "qis.Cashier","qis.Items","qis.Transaction"} )
@EntityScan({ "me.salisuwy", "qis.Cashier","qis.Items","qis.Transaction"} )
@EnableJpaRepositories({ "me.salisuwy", "qis.Cashier","qis.Items","qis.Transaction"} )
@EnableAutoConfiguration
public class MainApplicationClass {

    public static void main(String[] args) {
        SpringApplication.run(MainApplicationClass.class, args);
    }

}
