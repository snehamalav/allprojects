package hibernate.Project1.app;

import hibernate.Project1.dao.ServiceDao;
import hibernate.Project1.model.Employee;

public class TestApplication1 {

	public static void main(String[] args) {

		
		Employee employee=new Employee();
		 employee.setEno(100);
		 employee.setEname("sneha");
		 employee.setSalary(20000);
		 System.out.println("employee name is"+" "+employee.getEname());
		 System.out.println(new ServiceDao().editEmp(employee));
		}

}
