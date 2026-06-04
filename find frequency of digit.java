import java.util.Scanner;
public class javabasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        System.out.print("enter target:");
        int target=sc.nextInt();
        int count=0;
        
       while(n>0){
           int lastdigit=n%10;
           
           if(lastdigit==target){
            count++;   
           }
           n=n/10;
       }
       System.out.print("frequency:"+count);
    }
}