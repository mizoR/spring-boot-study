package sample.springboot.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method=RequestMethod.POST)
    public void getMethod(@RequestBody String body) {
        System.out.println("body=" + body);
    }
}
