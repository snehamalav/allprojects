package hibernate.Project1.app;



import java.util.List;

import hibernate.Project1.dao.ServiceDao;
import hibernate.Project1.model.Employee;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> elist=new ServiceDao().searchAll();
for(Employee e:elist)
	System.out.printf("\n%-20s %-20s %-20s",e.getEno(),e.getEname(),e.getSalary());
	}

}
