package in.porkko.hankcode.java;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriQueuExample {

	public static void main(String[] args) {
		Queue<Students> customerPriorityQueue = new PriorityQueue<>(7, Students.myComparator);
		//customerPriorityQueue.to
		Students stu = new Students(1, "Porkko", 1.1);
		Students stu1 = new Students(2, "Porkko1", 1.1);
		Students stu2 = new Students(3, "Porkko2", 1.3);
		Students stu3 = new Students(4, "Porkko3", 5.1);
		Students stu4 = new Students(5, "Porkko4", 0.1);
		customerPriorityQueue.add(stu);
		customerPriorityQueue.add(stu1);
		customerPriorityQueue.add(stu2);
		customerPriorityQueue.add(stu3);
		customerPriorityQueue.add(stu4);
		System.out.println(customerPriorityQueue.toString());
		Students stud = new Students(5, "Porkko", 0.1);
		while(customerPriorityQueue.size()>0){
			 stud = customerPriorityQueue.poll();
			 System.out.println(stud.getFname());
		}
		
	}
	
}
