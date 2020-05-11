import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        int discount_percent = Integer.parseInt(request.getParameter("discount"));
        float discount = (float) (price * discount_percent * 0.01);
        float total = price - discount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h3> Product Description: " + description);
        writer.println("<h3> Product price: " + price);
        writer.println("<h3> discount percent: " + discount_percent);
        writer.println("<h3> product discount: " + discount);
        writer.println("<h3> product total: " + total);
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
