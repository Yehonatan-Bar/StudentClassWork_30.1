package test_pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class test
 */
@WebServlet("/ServletStudent_30")
public class ServletStudent_30 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletStudent_30() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		JSONArray jsonArray = new JSONArray();
		ArrayList<Student> studentsRes =  StudentList.students;
		if ( request.getParameter("minAge") !=null) {
			 studentsRes = StudentList.filterMinAge(Integer.parseInt(request.getParameter("minAge")), studentsRes);
		 }
		
		
		if ( request.getParameter("maxAge") !=null) {
			studentsRes = StudentList.filterMaxAge(Integer.parseInt(request.getParameter("maxAge")), studentsRes);
		}
		
		
		if ( request.getParameter("minGrade") !=null) {
			studentsRes = StudentList.filterMinGrade(Integer.parseInt(request.getParameter("minGrade")), studentsRes);
		}
		
		
		if ( request.getParameter("maxGrade") !=null) {
			studentsRes = StudentList.filterMaxGrade(Integer.parseInt(request.getParameter("maxGrade")), studentsRes);
		}
		if ( request.getParameter("sortBy") !=null) {
			switch(  request.getParameter("sortBy") ) {
			case "age":	Collections.sort(studentsRes, new AgeSorter()); break;
			case "grade":	Collections.sort(studentsRes, new GradeSorter()); break;
			case "name":Collections.sort(studentsRes); break;
			}
		}
		
		
		JSONArray jsoa = new JSONArray();
 		for (Student s : studentsRes) {
			JSONObject jsob = new JSONObject();
			jsob.put("Name:", s.getName());
			jsob.put("Age:", s.getAge());
			jsob.put("Grade:", s.getGrade());
			jsoa.add(jsob);
		}
 		

 		
 		String jsonSingle = jsoa.toString();
		response.getWriter().append(jsonSingle+"\n");

	}


}
