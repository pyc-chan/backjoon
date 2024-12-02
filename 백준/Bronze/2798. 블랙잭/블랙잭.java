import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str1 = br.readLine();
            String str2 = br.readLine();
            br.close();
            String[] nm = str1.split(" ");
            String[] strs = str2.split(" ");
            int [] su = new int[Integer.parseInt(nm[0])];
            int limit = Integer.parseInt(nm[1]);
            for (int i = 0; i < su.length; i++) {
                su[i] = Integer.parseInt(strs[i]);
            }
            int max = 0;
            for(int i = 0; i< su.length-2; i++){
                for(int j = i+1 ; j<su.length-1; j++){
                    for(int k = j+1; k<su.length; k++){
                        if(su[i]+su[j]+su[k]<=limit && su[i]+su[j]+su[k]>max){
                            max = su[i]+su[j]+su[k];
                        }
                    }
                }
            }
            System.out.println(max);
        } catch (Exception e) {
        }
    }
}