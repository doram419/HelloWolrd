package himedia.filter;

import java.io.IOException;
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
		logger.info("[Encoding Filter] doFilter");
		
	}

	@Override
	public void destroy() {
		Filter.super.destroy();
		logger.info("[Encoding Filter] destroy");
	}



}
