package org.irri.iric.portal;



import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class PortalController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Welcome to IRIC Portal!";
    }

    /*
    public static void main(String[] args) throws Exception {
        SpringApplication.run(PortalController.class, args);
    }*/
}