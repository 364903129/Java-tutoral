import java.util.Scanner;

public class testscore{
   public static void main(String[] args){
      System.out.println("please enter your score ");
      Scanner sc = new Scanner(System.in);
      int score = sc.nextInt();
      switch(score/10){
      	 case 0:
      	 case 1:
      	 case 2:
      	 case 3:
      	 case 4:
      	 case 5:
      	    System.out.println("you score is F");
         case 6:
            System.out.println("your score is D");
            break;
         case 7:
            System.out.println("your score is C");
            break;
         case 8:
            System.out.println("your score is B");
            break;
         case 9:
            System.out.println("your score is A");
            break;
         case 10:
            if(score == 100){
            System.out.println("your score is A");
            break;
            }
         default:
            System.out.println("this is not a possible socre");
      }
      
   }
}
