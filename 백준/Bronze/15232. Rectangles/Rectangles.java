import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int R = Integer.parseInt(br.readLine());
            int C = Integer.parseInt(br.readLine());
            for(int i = 0; i< R; i++){
                for(int j = 0; j< C; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
        }
    }
}