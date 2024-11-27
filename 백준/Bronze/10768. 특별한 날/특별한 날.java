import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>2){
            System.out.println("After");
        }else if(num1<2){
            System.out.println("Before");
        }else{
            if(num2>18){
                System.out.println("After");
            }else if(num2<18){
                System.out.println("Before");
            }else{
                System.out.println("Special");
            }
        }
    }
}
