import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            if(num%2 == 0){
                System.out.println("SciComLove");
            }else{
                System.out.println("evoLmoCicS");
            }
        } catch (Exception e) {
        }
    }
}