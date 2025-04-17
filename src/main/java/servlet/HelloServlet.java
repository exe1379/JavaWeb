package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//表示瀏覽器可以透過 http://localhost:8080/JavaWeb/Hello 執行此 Servlet 程式
@WebServlet(urlPatterns = "/Hello") //標準配置寫法
//@WebServLet("testing") 精簡配置寫法
public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("Hello Servlet");  // 將字串回應給瀏覽器...
	}
	
}
