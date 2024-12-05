import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true){
            String str = br.readLine();
            if(str.equals("0 0 0")){
                break;
            }
            String[] strs = str.split(" ");
            int [] ints = new int[3];
            for(int i = 0; i < strs.length; i++){
                ints[i] = Integer.parseInt(strs[i]);
            }
            if(ints[2]-ints[1] == ints[1]-ints[0]){
                System.out.println("AP " + (ints[2]+ints[1]-ints[0]));
            }else{
                System.out.println("GP " + (ints[2]*ints[1]/ints[0]));
            }
            
        }
        } catch (Exception e) {
        }
    }
}