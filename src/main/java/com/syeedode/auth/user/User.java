package com.syeedode.auth.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Authentication Services
 * <p>
 * Author: syeedode
 * Date: 9/2/17
 */
@RestController
public class User {

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
