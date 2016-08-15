package in.sample.porkko.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Alex",20);
		Employee emp2 = new Employee("Alex",10);
		Employee emp3 = new Employee("Alex",30);
		List<Employee> mylist = new ArrayList<Employee>();
		mylist.add(emp1);
		mylist.add(emp2);
		mylist.add(emp3);
		for(int i=0;i<mylist.size();i++){
			System.out.println(mylist.get(i).getName()+ "-------"+ mylist.get(i).getId());
		}
		System.out.println("");
		System.out.println("");
		Collections.sort(mylist,Employee.myComparator);
		for(int i=0;i<mylist.size();i++){
			System.out.println(mylist.get(i).getName()+ "-------"+ mylist.get(i).getId());
		}
	}
}
