import java.util.*;
public class positive_or_neg_num{

    public static void main(String[]args){
        int num;
        //taking input in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        num  = sc.nextInt();

        if(num>0){
            System.out.println("the number is positive");
        }
        else if(num<0){
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("The number is Zero");
        }
        
    }


}