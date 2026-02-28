package org.raoamigos.springboot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    @GetMapping("/user/{id}/{name}")
//    public String sendData(@PathVariable String id, @PathVariable String name) {
//        System.out.println(id + " " + name);
//        return "Success";
//    }

    @GetMapping("/user")
    public String sendData(@RequestParam String id, @RequestParam String name) {
        System.out.println(id + " " + name);
        return "Success";
    }

}
