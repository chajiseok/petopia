package com.final2.petopia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@RequestMapping(value="/join.pet", method={RequestMethod.GET})
	public String join() {
		
		return "join/join.tiles1";
	} // end of public String join()
	
	@RequestMapping(value="/joinMember.pet", method= {RequestMethod.GET})
	public String joinMember() {
		
		return "join/joinMember.tiles1";
	} // end of public String join()
	
}