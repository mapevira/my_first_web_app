package com.in28minutes.srpingboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The say hello controller.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 24 May 2023 - 13:17:39
 *
 */
@Controller
public class SayHelloController {

    @ResponseBody
    @RequestMapping("say-hello")
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

}
