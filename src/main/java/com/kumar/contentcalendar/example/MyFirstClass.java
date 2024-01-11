package com.kumar.contentcalendar.example;

//@Component
public class MyFirstClass {

    private String myvar;

    public MyFirstClass(String myvar) {
        this.myvar = myvar;
    }

    public String sayHello(){
        return "Hello from the MyFirstClass ==> myVar = " + myvar;
    }
}
