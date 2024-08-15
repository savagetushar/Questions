
import java.util.*;

public class Findfactorial {
    private static long Calculatefactorial(int n){
        long factorial=1;
        for(int i=1;i<=n;i++){
            factorial *= i;

        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a non-negative number");
        int number=sc.nextInt();
        if(number<0){
            System.out.println("enter a non negative number");
        }
        else{
            long facorial=Calculatefactorial(Number);
            System.out.println("Factorial of"+number+"is:"+factorial);
        }
    }
}
