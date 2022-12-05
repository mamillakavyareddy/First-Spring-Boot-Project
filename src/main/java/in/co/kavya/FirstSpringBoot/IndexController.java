package in.co.kavya.FirstSpringBoot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IndexController {

	@RequestMapping(value = "/index")
	public String index(Model model) {
		List<Employee> emp=new ArrayList<>();

		Connection con= DatabaseConnection.getConnection();

		String query = "select * from employee";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Employee temp=new Employee();
				temp.setAge(resultSet.getInt(1));
				temp.setFname(resultSet.getString(2));
				temp.setLname(resultSet.getString(3));
				emp.add(temp);
			}

		}
		catch (SQLException e) {

			e.printStackTrace();


		}
		Employee e1=new Employee();
		e1.setAge(42);
		e1.setFname("sreevani");
		e1.setLname("arvala");
		//emp.add(e1);

		model.addAttribute("fname", "sajjith");
		model.addAttribute("lname", "arvala");
		model.addAttribute("emps", emp);
		return "index";

	}


}
