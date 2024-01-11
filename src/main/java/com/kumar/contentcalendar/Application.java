package com.kumar.contentcalendar;

import com.kumar.contentcalendar.example.MyFirstClass;
import com.kumar.contentcalendar.example.MyFirstService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        var app =new SpringApplication(Application.class);
        app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "test"));
        var context = app.run(args);

//        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
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
        System.out.println(myFirstService.getJavaVersion());
        System.out.println(myFirstService.getOsName());
        System.out.println(myFirstService.readProp());
        System.out.println(myFirstService.getCustomProperty());
        System.out.println(myFirstService.getName());
    }

    //	@Bean
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("First Bean");
    }
}
