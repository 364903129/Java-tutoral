import java.util.Scanner;

public class numPyramid{
	public static void main(String[] args){
		System.out.println("Please enter the number of lines ");
		Scanner input = new Scanner(System.in);
		int lineNum = input.nextInt();
		for(int i = 0; i < lineNum; i++){        //prints out the line
			for(int j = 0; j < lineNum - 1 - i; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++){
				System.out.print(j + 1);
			}
			for(int j = i ; j > 0; j--){
				System.out.print(j);
			}
			for(int j = 0; j < lineNum - 1 - i; j++){
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
