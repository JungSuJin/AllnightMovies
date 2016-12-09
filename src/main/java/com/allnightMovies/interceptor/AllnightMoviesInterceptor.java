package com.allnightMovies.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
// preHandle() : 컨트롤러가 호출되기 전에 실행됨. 
//		boolean 을 반환하는데 true 반환시 다음 단계가 진행되며 false 반환시 다음 컨트롤러도 인터셉터도 실행되지 않는다.
// postHandle() : 컨트롤러 실행 뒤에 호출됨.
//		컨트롤러가 돌려준 ModelAndView 타입 정보를 참조하거나 조작할 수 있다.
// afterCompletion() : 모든 작업이 종료된 후 실행된다.
public class AllnightMoviesInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return true;
	}
}
