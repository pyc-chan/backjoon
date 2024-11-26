import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(num-j>(i+1)){
                    System.out.print(" ");
                }else{
                    if(num-j==1){
                        System.out.println("*");
                    }else{
                        System.out.print("**");
                    }
                }
            }
        }

        for(int i=1; i<num; i++){
            for(int j = 0; j<num; j++){
                if(j<i){
                    System.out.print(" ");
                }else if(num-j==1){
                    System.out.println("*");
                }else{
                    System.out.print("**");
                }

            }
        }

        sc.close();
    }
}
