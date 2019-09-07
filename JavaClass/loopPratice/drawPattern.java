import java.util.Scanner;

public class drawPattern{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of lines");
		int numLines = input.nextInt();
		for(int i = 0; i < numLines; i++){         //print the number of lines
			if(i == 0){
				for(int j = 0; j < 2 * numLines - 1; j++)
				System.out.print("*");
			}else{
				for(int j = 0; j < numLines - i; j++){
					//code
					System.out.print("*");
				}
				for(int j = 0; j < 2*i-1; j++){
					//code
					System.out.print(" ");
				}
				for(int j = 0; j < numLines - i; j++){
					//code
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}