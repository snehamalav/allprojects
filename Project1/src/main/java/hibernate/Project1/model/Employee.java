package hibernate.Project1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee123")
public class Employee {
	
@Id
private int eno;
private String ename;
@Column(name="esal")
private int salary;
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(int eno, String ename, int salary) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.salary = salary;
}
public Employee() {
	super();
}

}
