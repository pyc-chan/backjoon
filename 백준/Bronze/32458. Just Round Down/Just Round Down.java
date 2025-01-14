import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            double str = Double.parseDouble(br.readLine());
            wr.write(String.valueOf((int)str));
            wr.flush();
        } catch (Exception e) {
        }
    }
}