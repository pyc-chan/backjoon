import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            switch (str) {
                case "SONGDO":
                    System.out.println("HIGHSCHOOL");
                    break;
                case "CODE":
                    System.out.println("MASTER");
                    break;
                case "2023":
                    System.out.println("0611");
                    break;
                case "ALGORITHM":
                    System.out.println("CONTEST");
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
        }
    }
}