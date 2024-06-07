package himedia.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class EncodingFilter implements Filter{
	private static Logger logger = Logger.getLogger(EncodingFilter.class.getSimpleName());	//로거 선언
	private static String encoding = "UTF-8";
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("[Encoding Filter] init");
		Filter.super.init(filterConfig);
	}
	
	@Override
	public void doFilter(ServletRequest req, 
			ServletResponse resp, 
			FilterChain chain)
			throws IOException, ServletException {
		
		// 출력을 위한 객체 얻어오기
		PrintWriter out = resp.getWriter();
		out.println("<h6>Encoding Filter 작동 전</h6>");
		
		// 실제 필터가 처리하는 내용
		logger.info("[Encoding Filter] doFilter");
		req.setCharacterEncoding(encoding);	// 요청 정보의 인코딩 설정 : 요즘은 많이 좋아져서 깨지는 경우는 적지만 해주기
		resp.setContentType("text/html");		// 응답 정보의 타입
		resp.setCharacterEncoding(encoding);	// 응답 정보의 인코딩
		
		chain.doFilter(req, resp);	// 요청 처리 종료 후 다음 필터로 전달해준다. 이게 핵심
		
		out.println("<h6>Encoding Filter 작동 후</h6>");
	}

	@Override
	public void destroy() {
//		Filter.super.destroy();
		logger.info("[Encoding Filter] destroy");
	}



}
