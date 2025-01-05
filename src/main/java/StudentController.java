
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saithanmayeebukkittu
 */
@WebServlet("/student")
public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Simulating fetching data from a database
        Student student = new Student();
        student.setName("Alice");
        student.setAge(22);

        // Set the student object in the request
        request.setAttribute("student", student);

        // Forward the request to the View (JSP page)
        RequestDispatcher dispatcher = request.getRequestDispatcher("studentDetails.jsp");
        dispatcher.forward(request, response);
    }
}
