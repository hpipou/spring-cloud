package io.server.two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/products")
    public Map<String,String> welcomeUser(){
        Map<String,String> products=new HashMap<>();
        products.put("iphone","1500 euros");
        products.put("samsung","800 euros");
        products.put("LG","950 euros");
        products.put("XAOMI","110 euros");
        products.put("REDME","1000 euros");
        products.put("TOSHIBA","380 euros");
        return products;
    }

    @GetMapping("/products/{id}")
    public Map<String,String> welcomeUser(@PathVariable String id){
        Map<String,String> products=new HashMap<>();
        products.put(id,"1500 euros");
        return products;
    }
}
