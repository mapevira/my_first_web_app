package com.in28minutes.srpingboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

/**
 * The login controller class.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 25 May 2023 - 21:30:13
 *
 */
@Slf4j
@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @GetMapping(value = "login")
    public String goToLoginJsp() {
        if (log.isInfoEnabled()) {
            log.info("goToLoginJsp method was called");
        }
        return "login";
    }

    @PostMapping(value = "login")
    public String goToWelcomeJsp(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (log.isInfoEnabled()) {
            log.info("goToWelcomeJsp method was called");
        }

        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);

            return "welcome";
        }

        model.put("errorMessage", "Invalid Credentials! Please try again");

        return "login";
    }

}
