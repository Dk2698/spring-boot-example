package com.kumar.contentcalendar.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//@PropertySource("classpath:custom.properties")
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-file2.properties")

})
public class MyFirstService {

//    @Autowired
//    @Qualifier("bean1")
//    @Qualifier("mySecondBean")
//    private  MyFirstClass myFirstClass;

//    @Autowired
//    public MyFirstService(@Qualifier("bean2") MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }

    // constructor
//    public MyFirstService(MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }

    private  MyFirstClass myFirstClass;

    private Environment environment;

    @Value("${my.prop}")
    private String customProperty;

    @Value("${my.name}")
    private String name;

//    @Autowired
//    public void injectDependencies(
//           @Qualifier("bean1") MyFirstClass myFirstClass
//    ){
//        this.myFirstClass = myFirstClass;
//    }

    public String tellAStory(){
        return "the dependency is saying : " + myFirstClass.sayHello();
    }

    public String getJavaVersion() {
        return environment.getProperty("java.version");
    }

    public String getOsName() {
        return environment.getProperty("os.name");
    }

    public String readProp() {
        return environment.getProperty("my.custom.property");
    }
    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public String getCustomProperty() {
        return customProperty;
    }

    @Autowired
    public void setMyFirstClass(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String getName() {
        return name;
    }
}
