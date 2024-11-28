import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int[] result = new int[26];
            String str = br.readLine();
            for(int i =str.length(); i>=1; i--){
                result[str.charAt(i-1)-'a']= i;
            }
            for(int i =0; i<result.length; i++){
                System.out.print(result[i]-1+" ");
            }
            br.close();
        } catch (Exception e) {
        }
    }
}
