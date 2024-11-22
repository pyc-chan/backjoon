import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        
        int aleng = a.length();
        int bleng = b.length();
        int [] table = new int[bleng];
        boolean result = false;

        int idx = 0;
        for(int i = 1; i<bleng; i++){
            while(idx>0 && b.charAt(i) != b.charAt(idx)){
                idx= table[idx-1];
            }
            if(b.charAt(i)==b.charAt(idx)){
                idx++;
                table[i]=idx;
            }
        }

        for(int i=0; i<aleng; i++){
            while (idx>0 && a.charAt(i)!= b.charAt(idx)) {
                idx=table[idx-1];
            }
            if(a.charAt(i)==b.charAt(idx)){
                if(idx==bleng-1){
                    idx=table[idx];
                    result = true;
                }
                else{
                    idx++;
                }
            }
        }
        if(result == true){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    catch (Exception e){

    }
    }
}
