import java.util.*;
public class CheckLeapyear {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);

         n=sc.nextInt();
         if(n%4 ==0 && n%100!=0 || n%400==0){
             System.out.println("This year is a leap year");
         }
         else{
             System.out.println("This year is not a leap year");
         }


    }
}
