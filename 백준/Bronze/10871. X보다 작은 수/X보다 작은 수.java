import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] nx = br.readLine().split(" ");
            int n = Integer.parseInt(nx[0]);
            int x = Integer.parseInt(nx[1]);
            String[] str = br.readLine().split(" ");
            int tmp = 0;
            for(int i =0; i<n; i++){
                tmp = Integer.parseInt(str[i]);
                if(tmp<x){
                    System.out.print(tmp+" ");
                }
            }
            br.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}