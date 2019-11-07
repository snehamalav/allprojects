package hibernate.Project1.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.Project1.model.Employee;
import hibernate.Project1.model.SessionModel;

public class ServiceDao {
public boolean addEmp(Employee e)
{
	boolean flag=false;
	try
	{
		Session session=new SessionModel().getSession();
		Transaction t=session.beginTransaction();
		session.save(e);
		t.commit();
		session.close();
		flag=true;
		
	}
	catch(Exception ee){
		ee.getStackTrace();
	}
	return flag;
}
public boolean editEmp(Employee e)
{
	boolean flag=false;
	try
	{
		Session session=new SessionModel().getSession();
		Transaction t=session.beginTransaction();
		session.update(e);
		t.commit();
		session.close();
		flag=true;
		
	}
	catch(Exception ee){
		ee.getStackTrace();
	}
	return flag;
}
public boolean removeEmp(Employee e)
{
	boolean flag=false;
	try
	{
		Session session=new SessionModel().getSession();
		Transaction t=session.beginTransaction();
		session.delete(e);
		t.commit();
		session.close();
		flag=true;
		
	}
	catch(Exception ee){
		ee.getStackTrace();
	}
	return flag;
}
public Employee getEmp(Employee employee)
{
	Employee e1=null;
	try
	{
		Session session=new SessionModel().getSession();
		e1=(Employee)session.get(Employee.class,employee.getEno());
		
		session.close();
	}
	catch(Exception ee){
		ee.getStackTrace();
	}
	return e1;
}

public List<Employee> searchAll(){
    List<Employee> emplist =null;
	Session session=new SessionModel().getSession();
   
    Query query = (Query) session.createQuery("from Employee");//hql--->in this query is in terms of objects
    emplist=query.list();
    return emplist;
     
     
}
}
