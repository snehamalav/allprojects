package hibernate.Project1.app;

import hibernate.Project1.dao.ServiceDao;
import hibernate.Project1.model.Employee;

public class Test1 {
	public static void main(String args[]){
	
	Employee employee= new Employee();
	employee.setEno(100);
	Employee e= new ServiceDao().getEmp(employee);
	if(e!=null)
	{
		System.out.println(e.getEname());
		System.out.println(e.getSalary());
	}
		else
		{

			System.out.println("not found");
		}

}
}
