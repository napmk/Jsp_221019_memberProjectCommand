package com.gyojincompany.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MCommand {
	//인터페이스는 추상메소드만 가질 수 있다.
	public void execute(HttpServletRequest request, HttpServletResponse response );
	//추상메소드

}
