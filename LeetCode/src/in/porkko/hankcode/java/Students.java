package in.porkko.hankcode.java;

import java.util.Comparator;

import in.sample.porkko.test.Employee;

public class Students {
	
	   private int token;
	   private String fname;
	   private double cgpa;
	   public Students(int id, String fname, double cgpa) {
	      super();
	      this.token = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	public int getToken() {
		return token;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}

	   
	public static final Comparator<Students> myComparator = new Comparator<Students>(){
		@Override
		public int compare(Students e1, Students e2) {
			if(e1.getCgpa() == e2.getCgpa() && (e1.getFname().compareTo(e2.getFname())==0)){
				return e1.getToken()- e2.getToken();
			}else if(e1.getCgpa() == e2.getCgpa()){
				return e1.getFname().compareTo(e2.getFname());
			}else{
				return (int)(e2.getCgpa()*100 - e1.getCgpa()*100);
			}
	    }
	};
}

