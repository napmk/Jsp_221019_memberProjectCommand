
package com.napmkmk.front;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.gyojincompany.member.MDeleteCommand;
import com.gyojincompany.member.MIdCheckCommand;
import com.gyojincompany.member.MJoinCommand;
import com.gyojincompany.member.MLoginCommand;

/**
 * Servlet implementation class FrontControler
 */
@WebServlet("*.do")/* @ 골뱅이 붙은거 ammo 어노테이션*/
public class FrontControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /* form 에서 GET방식 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get 방식으로 요청왔음.");
		actionDo(request, response);
//		String uri = request.getRequestURI(); //
//		System.out.println("uri :" + uri); // :/jsp_221019/test.do 컨텍스트 패스라고한다.
//		String conPath =request.getContextPath();
//		System.out.println("context Path :" + conPath);
//		String command = uri.substring(conPath.length()); // uri에서 conPath 길이 만큼 빼준다
//		System.out.println("command :" + command);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Post 방식으로 요청왔음.");
		actionDo(request, response);
//		String uri = request.getRequestURI(); //
//		System.out.println("uri :" + uri); // :/jsp_221019/test.do 컨텍스트 패스라고한다.
//		String conPath =request.getContextPath();
//		System.out.println("context Path :" + conPath);
//		String command = uri.substring(conPath.length()); // uri에서 conPath 길이 만큼 빼준다
//		System.out.println("command :" + command);
		
		
	}
	/* get 이냐 post */
	protected void actionDo(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		String uri = request.getRequestURI(); //
		System.out.println("uri :" + uri); // :/jsp_221019/test.do 컨텍스트 패스라고한다.
		String conPath =request.getContextPath();
		System.out.println("context Path :" + conPath);
		String command = uri.substring(conPath.length()); // uri에서 conPath 길이 만큼 빼준다
		System.out.println("command :" + command);
		
		if(command.equals("/deleteMember.co")) {
			System.out.println("deleteMember.co 요청왔음!");
	//		String did = request.getParameter(d_id);
			
			 MDeleteCommand command1 = new MDeleteCommand();
			 command1.execute(request, response);
			 
		
		} else if (command.equals("/joinOk.do")) {
				System.out.println("joinOk.do 요청왔음!");
				
				MJoinCommand command1 = new MJoinCommand();
				command1.execute(request, response);
		} else if(command.equals("/loginOk.do")) {
				System.out.println("loginOk.do 요청왔음!");

				MLoginCommand command1 = new MLoginCommand();
				command1.execute(request, response);
		
		} else if(command.equals("/idCheck.do")) {
				System.out.println("idCheck.do 요청왔음!");
	
				MIdCheckCommand command1 = new MIdCheckCommand();
				command1.execute(request, response);
		} else if(command.equals("/logout.do")) {
			System.out.println("logout.do 요청왔음!");
			
			
			
	}
		
		
		
	}

}

