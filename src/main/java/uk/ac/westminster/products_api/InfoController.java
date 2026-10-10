package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Stretch task (Activity 5): a second controller.
 */
@RestController
public class InfoController {

    @GetMapping("/info")
    public String info(){
        return "Products API - 5COSC019W Tutorial 1, built with Spring Boot";
    }
}
