package com.kumar.contentcalendar.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;

//    @Autowired
//    public MyFirstService(@Qualifier("bean2") MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }

    // constructor
    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory(){
        return "the dependency is saying : " + myFirstClass.sayHello();
    }
}
