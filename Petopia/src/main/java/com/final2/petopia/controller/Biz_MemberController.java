package com.final2.petopia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Biz_MemberController {
	
	@RequestMapping(value="/joinBizMember.pet", method={RequestMethod.GET})
	public String joinBizMember() {
		
		return "join/joinBizMember.tiles1";
	} // end of public String joinBizMember()
	
	@RequestMapping(value="/editBizMember.pet", method={RequestMethod.GET})
	public String editBizMember() {
		
		return "join/editBizMember.tiles1";
	} // end of public String editBizMember()
	
	@RequestMapping(value="/bizDetail.pet", method={RequestMethod.GET})
	public String bizDetail() {
		
		return "join/bizDetail.tiles1";
	} // end of public String bizDetail()

}
