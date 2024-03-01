package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String getWelcomeMsg() {
		String str = "welcome to ashok it";
		return str;
		
	}

	

	public String getGreetMsg() {
		String msg = "Good Evening..!!";
		return msg;
	}
}
