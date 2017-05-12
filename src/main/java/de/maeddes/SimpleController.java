package de.maeddes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {
	
	@Value("${CF_INSTANCE_INDEX:0}")
	int instance;
	
    @RequestMapping("/")
    public String index() {
        return "Howdy, bootiful World! Instance: "+instance;
    }
    	
    @RequestMapping("/crash")
    public String crash() {
    	System.exit(0); 
        return "Hello, bootiful World!";
    }

}
