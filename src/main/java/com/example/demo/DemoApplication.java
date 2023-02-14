package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
        exclude = DataSourceAutoConfiguration.class
)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

//        if(args != null){
//            for (String agr:args) {
//                System.out.println(agr);
//            }
//        }

//        IHello iHello=new HelloImpl();
//        iHello.sayHello();

//        //简单spi
//        Service service=new Service();
//        service.invoke();






    }

}
