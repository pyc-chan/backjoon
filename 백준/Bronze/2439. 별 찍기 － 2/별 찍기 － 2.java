import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        for(int i = 1; i <= a; i++){
            for(int j = a; j>0; j--){
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        scan.close();
    }
}
