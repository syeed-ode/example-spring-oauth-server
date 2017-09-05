package com.syeedode.auth.user;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * Authentication Services
 * <p>
 * Author: syeedode
 * Date: 9/2/17
 */
@Service
public class UserCreateService {
    public boolean createNeeded(Principal principal){
        if(principal instanceof OAuth2Authentication) {
            OAuth2Authentication authentication = (OAuth2Authentication) principal;
            String name = authentication.getUserAuthentication().getName();
            Object details = authentication.getUserAuthentication().getDetails();
            Map<String,String> detailsMap = (HashMap<String,String>)details;
            String id = String.valueOf(detailsMap.get("id"));
            System.out.println("Name: " + name
                    + " " + "id" + id);
            return false;
        }
        return true;
    }
}
