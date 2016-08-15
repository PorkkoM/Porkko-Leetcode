package in.porkko.sample.ggeks;

public class NthUglyNumber {
	
	int i=0;
	
	public static void main(String[] args) {
		NthUglyNumber nth = new NthUglyNumber();
		int n=nth.findNthugly(15);
		System.out.println("It Ends Here"+n);
		
	}
    int findNthugly(int s){
    	int i=1,count=1;
        while(s>count){
        	i++;
        	if(isUgly(i)==1){
        		count++;
        	}
        }
		return i;
    }
    int isUgly(int i){
    	i = maxDivde(i, 2);
    	i = maxDivde(i, 3);
    	i = maxDivde(i, 5);
    	return ((i==0)?1:0);
    }
    
    int maxDivde(int numa,int numb){
    	while(numa%numb==0)
    		numa = numa/numb;
    	
    	return numa;
    }
	
}
