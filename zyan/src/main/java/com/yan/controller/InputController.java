package com.yan.controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.yan.model.*;

//import com.pb.entity.Account;
public class InputController {
	private String successView;
	private String failView;
	
	public String getSuccessView() {
		return successView;
	}
	public void setSuccessView(String successView) {
		this.successView = successView;
	}
	public String getFailView() {
		return failView;
	}
	public void setFailView(String failView) {
		this.failView = failView;
	}
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String guestname=request.getParameter("guestname");
		Map<String ,Object> model=new HashMap<String,Object>();
		if(guestname !=null){
			model.put("guestname", guestname);
			return new ModelAndView(getSuccessView(),model);
		}else{
			model.put("error", "您未输入用户名，请重新输入");
			return new ModelAndView(getFailView(),model);
		}		
	}
//	public Account getAccount(String cardNo,String password){
//		if(cardNo.equals("123")&&password.equals("123")){
//			Account account =new Account();
//			account.setCardNo(cardNo);
//			account.setBalance(88.8f);
//			return account;
//		}else{
//			return null;
//		}
//	}

}
