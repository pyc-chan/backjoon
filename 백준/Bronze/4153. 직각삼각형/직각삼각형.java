import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==0&&b==0&&c==0){
                break;
            }
        if(a>b && a>c){
            if(a*a == b*b + c*c){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }else if(b>c && b>a){
            if(b*b == a*a + c*c){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }else if(c>a && c>b){
            if(c*c == a*a + b*b){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }else{
            System.out.println("wrong");
        }
    }
        sc.close();
    }
}
