package com.theironyard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alhanger on 11/9/15.
 */
@RestController
public class HelloSpringJsonController {

    @RequestMapping("/person.json")
    public Person person(
            @RequestParam(defaultValue = "Alex") String name,
            @RequestParam(defaultValue = "Atlanta") String city,
            @RequestParam(defaultValue = "25") Integer age
    ) {
        return new Person(name, city, age);
    }
}
