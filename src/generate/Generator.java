package generate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Sebastian Morkisch
 *
 */
public class Generator extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private int anzahl = 1;
	private int rangeMin = 0;
	private int rangeMax = 0;

	private ArrayList<String> stringList = new ArrayList<String>();

	public Generator() {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Set a cookie for the user, so that the counter does not increate
		// every time the user press refresh
		HttpSession session = req.getSession(true);
		// Set the session valid for 1 hour
		session.setMaxInactiveInterval(3600);
		resp.setContentType("text/plain");

		try {

		} catch (Exception e) {
			getServletContext().log("An exception occurred: ", e);
			throw new ServletException("An exception occurred: "
					+ e.getMessage());
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
			this.rangeMin = Integer.parseInt(req.getParameter("rangeMin"));
			this.rangeMax = Integer.parseInt(req.getParameter("rangeMax"));
			this.anzahl = Integer.parseInt(req.getParameter("anzahl"));
			// do stuff with parameter

		} catch (Exception e) {
			getServletContext().log("An exception occurred: ", e);
			throw new ServletException("An exception occurred: "
					+ e.getMessage());
		}
	}

	private static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	private String haveOneAufgabe() {
		int i = 0;
		int j = 0;
		i = randInt(rangeMin, rangeMax);
		j = randInt(1, 10);
		if ((i + j) > 10) {
			this.haveOneAufgabe();
		}
		String s = Integer.toString(i);
		String t = Integer.toString(j);
		return s + " + " + t + " =";
	}

	public ArrayList<String> generateList() {
		for (int z = 0; z <= anzahl - 1; z++) {
			stringList.add(haveOneAufgabe());
		}
		return stringList;
	}
}
