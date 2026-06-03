import java.util.Scanner;
public class javabasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number:");
        
        int n=sc.nextInt();
        int rev=0;
        int original=n;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        if(original==rev){
            System.out.print("number is palindrome");
        }else{
            System.out.print("number is not palindrome");
        }
    }
}