public class javabasics{
    public static void main(String args[]){
        int row=5;
        int colm=10;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=colm;j++){
                if(i==1||i==row||j==1||j==colm){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}