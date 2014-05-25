package org.irri.iric.portal;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


import org.irri.iric.biomodels.*;

@Controller
@EnableAutoConfiguration
public class PortalController {
	
	private Query q = new Query();

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Welcome to IRIC Portal!";
    }

    @RequestMapping("/snp")
    @ResponseBody
    String snp() {
    	
    	return "1";
        //return q.getSNP("1").toString() ;
    }
    
    
    
    /*public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
    */
}