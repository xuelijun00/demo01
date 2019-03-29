package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

@Configuration
public class LogCostFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Execute cost="+(System.currentTimeMillis()-start));
        System.out.println("过滤器启动成功");
    }

    @Override
    public void destroy() {

    }
}
