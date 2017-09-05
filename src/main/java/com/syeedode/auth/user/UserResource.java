package com.syeedode.auth.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Authentication Services
 * <p>
 * Author: syeedode
 * Date: 9/2/17
 */
@RestController
public class UserResource {

    @Autowired
    private UserCreateService createService;

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        if(createService.createNeeded(principal)){
            return new OAuth2Authentication(null,(Authentication) principal);
        }
        return principal;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void createUser() {

    }
}
