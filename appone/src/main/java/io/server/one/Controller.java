package io.server.one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/welcomeUser")
    public String welcomeUser(){
        return "Welcome User";
    }

    @GetMapping("/welcomeUser/{id}")
    public String welcomeUser(@PathVariable String id){
        return "Welcome User : " + id;
    }
}
