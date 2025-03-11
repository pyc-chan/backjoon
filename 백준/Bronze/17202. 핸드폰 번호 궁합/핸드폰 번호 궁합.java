import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String num2 = br.readLine();
        int[] result = new int[16];
        for(int i = 0; i < result.length; i++){
            if(i % 2 == 0){
                result[i] = num1.charAt(i/2)-48;
            }else{
                result[i] = num2.charAt(i/2)-48;
            }
        }
        for(int i = 0; i< result.length-2; i++){
            for(int j = 0; j < result.length-1-i; j++){
                result[j] = (result[j]+result[j+1])%10;
            }
        }
        System.out.println(result[0]+""+result[1]);
    }
}