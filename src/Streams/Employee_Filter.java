package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee_Filter {

	String name,gender;
	int age,salary;

	Employee_Filter(String name,int age,String gender, int salary)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
	}

	public static void main(String[] args) {

		List<Employee_Filter>  empTermination = new ArrayList<Employee_Filter>();

		List<Employee_Filter>  empHighestSalary = new ArrayList<Employee_Filter>();
		List<Employee_Filter>  emp = new ArrayList<Employee_Filter>();
		emp.add(new Employee_Filter("Dhanapal",26,"Male",70000));
		emp.add(new Employee_Filter("Karthik",30,"Male",80000));
		emp.add(new Employee_Filter("Priya",45,"Female",85000));
		emp.add(new Employee_Filter("Harini",22,"Female",25000));
		emp.add(new Employee_Filter("Karthiga",40,"Female",90000));

		Predicate<Integer> predicate = salary->salary>50000;

		empHighestSalary= emp.stream().filter(e->predicate.test(e.salary)).collect(Collectors.toList());

		empTermination=empHighestSalary.stream().filter(e->e.age>30).collect(Collectors.toList());

		for(Employee_Filter e:empTermination) {
			System.out.println("Name is:"+e.name);
			System.out.println("Age is:"+e.age);
			System.out.println("Salary is:"+e.salary);
		}

		System.out.println("Using Consumer:Foreach Above same Functionality");
		empHighestSalary.stream().filter(e->e.age>30).forEach(e->{
			System.out.println("Name is:"+e.name);
			System.out.println("Age is:"+e.age);
			System.out.println("Salary is:"+e.salary);
		}
				);
	
	}
}
