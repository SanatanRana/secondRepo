import java.util.*;
public class bijlibill {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter unit that you used");
    int unit = sc.nextInt();
    double rate;
    if (unit <=100){
         rate = unit *1.5;
    }
    else{
        rate =  100*1.5+(unit-100)*3;
    }
    System.out.println("the total Rs "+rate+" you have to paid.");

   } 
}
