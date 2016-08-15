package in.sample.porkko.test;

import java.util.Comparator;

public class Employee {
	
	String name;
	long id;
	
	public Employee(String name,long id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public static final Comparator<Employee> myComparator = new Comparator<Employee>(){
		@Override
		public int compare(Employee e1, Employee e2) {
		      String name1 = e1.getName();
		      String name2 = e2.getName();
		      if(name1.compareTo(name2)==0){
		    	  return Long.compare(e1.id, e2.id);
		      }else{
		           return name1.compareTo(name2);
		      }
		      //descending order
		      //return fruitName2.compareTo(fruitName1);
		    }
	};
}
