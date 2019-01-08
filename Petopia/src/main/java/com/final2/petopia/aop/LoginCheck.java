package com.final2.petopia.aop;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// import com.final2.petopia.common.MyUtil;
import com.final2.petopia.model.MemberVO;

//===== #52. ������ɻ�(Aspect)Ŭ����; �α��� üũ =====
@Aspect
@Component
public class LoginCheck {

//	#����Ʈ�� �����ϱ�; execution(public(��������) *(����Ÿ�� ���) com.spring..(com.spring���� ��Ű�� ���� �������)*Controller(controller��ü).requireLogin_*(..)) 
	@Pointcut("execution(public * com.spring..*Controller.requireLogin_*(..))")
	public void requireLogin() {}	// ����Ʈ���� �ĺ��ڴ� �޼ҵ������ ����
	
//	#Advice �����(��������); BeforeAdvice ���� �� ���� ���� �����ϱ�
	@Before("requireLogin()")
	public void before(JoinPoint joinpoint) {
//		>> ����Ʈ���� �־����� �޼ҵ带 JoinPoint ��ü�� ������
		
//		1) Controller���� �Ķ���ͷ� ���� request��ü�� ���Ͽ� session��ü�� ��������
		HttpServletRequest req = (HttpServletRequest)joinpoint.getArgs()[0]; // �Ķ���� �迭�� ù��° ���ȣ [0]
		HttpServletResponse res = (HttpServletResponse)joinpoint.getArgs()[1];
		HttpSession session = req.getSession();
		MemberVO loginuser = (MemberVO)session.getAttribute("loginuser");
		String msg = "";
		String loc = "";
		if(loginuser==null) {
			try {
//			2) �α��� ���� ���� ��� �α��� �������� �̵�
				msg="�α��� �� �̿� ���� �մϴ�.";
				loc=req.getContextPath()+"/login.action";
				
				req.setAttribute("msg", msg);
				req.setAttribute("loc", loc);
//			3) �α��� ���� �� �α��� �� �������� ���ư��� �۾�; req�� ����ִ� add.action URL �����ͼ� ���ǿ� ����
			//	String url = MyUtil.getCurrentURL(req);
			//	session.setAttribute("goBackURL", url);
				
//			4) �޽����� �Բ� �����ķ� �� �������� ������
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/msg.jsp");
				dispatcher.forward(req, res);
				
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}	// end of before()
	
	
}
