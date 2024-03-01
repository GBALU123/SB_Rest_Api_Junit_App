package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.MsgService;

@RestController
public class MsgRestController {

	@Autowired
	private MsgService service;
	
	@GetMapping("/welcome")
	public String welcomMsg() {
		
		System.out.println(service.getClass().getName());
      
		String welcomeMsg = service.getWelcomeMsg();
		
		welcomeMsg = welcomeMsg.toUpperCase();
	
      return welcomeMsg;
	}
	@GetMapping("/greet")
	public String greetMsg() {
		
	System.out.println(service.getClass().getName());
    
	String greetMsg = service.getGreetMsg();
	
	greetMsg = greetMsg.toUpperCase();

  return greetMsg;
	}
}
