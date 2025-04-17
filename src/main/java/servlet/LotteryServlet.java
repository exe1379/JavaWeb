package servlet;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Lottery")
public class LotteryServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1.生成樂透號碼
		Random rand = new Random();
		Set<Integer> numbers = new LinkedHashSet<>();
		while(numbers.size()<5) {
			int number = rand.nextInt(39)+1;
			numbers.add(number);
		}
		// 2.生成調度器(分派器)
		RequestDispatcher rd = req.getRequestDispatcher("/lottery.jsp"); // "/"可以讓程式先從webapp開始找
		// 3. 傳遞樂透號碼
		req.setAttribute("pickupnums", numbers); //裝配要傳遞的內容
		rd.forward(req, resp); //將資料傳遞到lottery.jsp
	}
}
