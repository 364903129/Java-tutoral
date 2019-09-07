import java.util.Scanner;

public class mutiTable{
	public static void main(String[] args){
		System.out.println("Please enter the number of lines ");
		Scanner input = new Scanner(System.in);
		int lineNum = input.nextInt();
		for(int i = 1; i <=lineNum; i++){  //print number of lines
			for(int j = 1; j <= i; j++){
				int result = i * j;
				System.out.print(j+"*"+i+"="+result+"\t");
			}
			System.out.println("");
		}
	}
}