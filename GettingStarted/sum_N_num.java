import java.util.*;
public class sum_N_num {
    public static void main(String[] args){
        //sum of first N natural numbers full code
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        num = sc.nextInt();
        for(int i = 1; i<=num;i++){
            sum = sum+i;
        }
        System.out.println("The sum of first "+num+" natural numbers is "+ sum);


    }

}
