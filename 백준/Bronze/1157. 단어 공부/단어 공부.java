import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            int[] numbers = new int[26];
            for (char c : br.readLine().toUpperCase().toCharArray()) {
                numbers[(c - 'A')] = numbers[(c - 'A')] + 1;
            }
            int maxnum = 0;
            int maxchar = 0;
            for(int i = 0; i<26; i++){
                if(maxnum< numbers[i]){
                    maxnum = numbers[i];
                    maxchar = 'A'+i;
                }else if(maxnum == numbers[i]){
                    maxchar = '?';
                }
            }
            System.out.println((char)maxchar);

            br.close();
        } catch (Exception e) {

        }
    }
}
