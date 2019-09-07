import java.util.Scanner;

public class findPrime{
	public static void main(String[] args){
		System.out.println("please enter the range ");
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
        int end = input.nextInt();

        //check input
        while(start > end || start < 2){
        	System.out.println("no such range exist, start much be greater or equal to end, please enter the range again");
        	start = input.nextInt();
        	end = input.nextInt();
        }
        System.out.println("the range is "+ start +" to "+ end);

        //start coding
        for(int i = start; i <= end; i ++){
        	boolean isPrime = true;
        	if(i == 2){
        		System.out.println("2"+"\t"+"is prime number");
        	}else{
        		for(int j = 2; j < i/2+1; j++){ //i/2+1 make it faster
        			if(i%j == 0){
        				System.out.println(i+"\t"+ "is not prime number");
        				isPrime = false;
        				break;
        			}
        		}
        		if(isPrime)
				System.out.println(i+"\t"+"is prime number");
        	}
        }
	}
}