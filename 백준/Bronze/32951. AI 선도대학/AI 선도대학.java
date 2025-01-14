import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print(Integer.parseInt(br.readLine())-2024);
        } catch (Exception e) {
        }
    }
}