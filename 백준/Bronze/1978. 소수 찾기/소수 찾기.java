import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            boolean result = true;
            if(num >2){
                for(int j = 2; j < num; j++){
                    if(num%j ==0){
                        result = false;
                    }
                }
                if(result == true){
                    count++;
                }
            }else if(num == 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
