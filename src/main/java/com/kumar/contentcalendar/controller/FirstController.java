package com.kumar.contentcalendar.controller;

import com.kumar.contentcalendar.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello from my first controller";
//    }

    @GetMapping("/hello-2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello2() {
        return "Hello 2from my first controller";
    }

    @PostMapping("/post")
    public String sayHello(String message) {
        return "Request accepted and message is: " + message;
    }

    @PostMapping("/post-order")
    public String sayHello(@RequestBody Order order) {
        return "Request accepted and message is: " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String sayHello(@RequestBody OrderRecord order) {
        return "Request accepted and message is: " + order.toString();
    }

    // http://localhost:8080/hello/kumar
    @GetMapping("/hello/{user-name}")
    public String pathVar(@PathVariable("user-name") String userName) {
        return "my value = " + userName;
    }

    // http://localhost:8080/hello/?param_name1=paramvalue&param_name2=paramv2
    @GetMapping("/hello")
    public String paramVar(
            @RequestParam("user-name") String userName,
            @RequestParam("user-lastname") String userLastname
            ) {
        return "my value = " + userName + " "+ userLastname;
    }
}
