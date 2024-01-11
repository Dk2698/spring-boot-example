package com.kumar.contentcalendar;

import com.kumar.contentcalendar.example.MyFirstClass;
import com.kumar.contentcalendar.example.MyFirstService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        RestTemplate restTemplate = (RestTemplate) context.getBean("restTemplate");
//		System.out.println(restTemplate);
        log.info("rest bean -> {}", restTemplate);
        // create object in java
//		MyFirstClass myFirstClass = new MyFirstClass();
//		System.out.println(myFirstClass.sayHello());

        // spring create object or bean
//        final MyFirstClass myFirstClass = context.getBean("wrongMyFirstClass",MyFirstClass.class);
//        final MyFirstClass myFirstClass = context.getBean("myBean",MyFirstClass.class);
//        System.out.println(myFirstClass.sayHello());

        MyFirstService myFirstService = context.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
    }

    //	@Bean
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("First Bean");
    }
}
