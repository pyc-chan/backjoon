import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] result = br.readLine().split(" ");
        int[] test = new int[2];
        for(int i = 0; i < test.length; i++){
            test[i] = Integer.parseInt(result[i]);
        }
        if(test[0]*2 >= test[1]){
            System.out.println("E");
        }else{
            System.out.println("H");
        }
    }
}