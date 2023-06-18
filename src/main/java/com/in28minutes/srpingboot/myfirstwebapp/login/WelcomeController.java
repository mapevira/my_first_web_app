package com.in28minutes.srpingboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
@SessionAttributes("name")
@Controller
public class WelcomeController {

    @GetMapping(value = "/")
    public String goToWelcomePage(ModelMap model) {
        if (log.isInfoEnabled()) {
            log.info("goToWelcomePage method was called");
        }
        model.put("name", this.getLoggedInUsername());
        return "welcome";
    }

    private String getLoggedInUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return authentication.getName();
    }

}
