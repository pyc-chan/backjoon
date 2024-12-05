import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] str = br.readLine().split(" ");
            br.close();
            int hour = Integer.parseInt(str[0]);
            int minute = Integer.parseInt(str[1]);
            hour = hour*12%360;
            if(hour == minute){
                System.out.println("O");
            }else{
                System.out.println("X");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}