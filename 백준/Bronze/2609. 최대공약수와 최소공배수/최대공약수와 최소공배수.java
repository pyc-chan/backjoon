import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        int divisor = 1;
        int multiple = 1;
        if(num1<num2){
            for(int i = 2; i<= num1; i++){
                if(num1%i==0&&num2%i==0){
                    divisor = i;
                }
            }
        }else if(num1 == num2){
            divisor = num1;
        }else{
            for (int i = 2; i<= num2; i++){
                if(num1%i==0&&num2%i==0){
                    divisor = i;
                }
            }
        }
        multiple = num1*num2/divisor;
        System.out.println(divisor);
        System.out.println(multiple);
        
    }
}