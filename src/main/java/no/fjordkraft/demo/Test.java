package no.fjordkraft.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "demo")
public class Test {


    @RequestMapping(value = "list", method = GET)
    public String test () {
        return "eeeelo";
    }

}
