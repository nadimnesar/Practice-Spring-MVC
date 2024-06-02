package com.nadimnesar;

//import com.nadimnesar.main.inversion.of.control.component.Computer;
//import com.nadimnesar.main.inversion.of.control.bean.Computer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticeSpringMvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(PracticeSpringMvcApplication.class, args);
//        ApplicationContext applicationContext = SpringApplication.run(PracticeSpringBootApplication.class, args);

        /*
         * Inversion of Control using @Bean
         */
//        Computer computer1 = applicationContext.getBean(Computer.class);
//        Computer computer1 = (Computer) applicationContext.getBean("hpBook");
//        Computer computer2 = (Computer) applicationContext.getBean("dclBook");
//
//        User user1 = new User("X", "Y", computer1);
//        User user2 = new User("P", "Q", computer2);
//
//        System.out.println(user1);
//        System.out.println(user2);

        /*
         * Inversion of Control using @Component
         */
//        Computer computer = applicationContext.getBean(Computer.class);
//        System.out.println(computer);
    }
}