package com.in28minutes.srpingboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

/**
 * The authentication business service.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 27 May 2023 - 19:22:55
 *
 */
@Service
public class AuthenticationService {

    public boolean authenticate(final String username, final String password) {
        boolean isValidUsername = username.equalsIgnoreCase("in28minutes");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidUsername && isValidPassword;
    }

}
