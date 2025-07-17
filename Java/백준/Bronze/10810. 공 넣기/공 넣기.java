import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        // 도현이는 바구니를 총 N개 가지고 있고, 
        // 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 
        // 또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 
        // 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
        // 도현이는 앞으로 M번 공을 넣으려고 한다. 
        // 도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 
        // 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다. 
        // 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 
        // 공을 넣을 바구니는 연속되어 있어야 한다.
        // 공을 어떻게 넣을지가 주어졌을 때, 
        // M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstinput = br.readLine();
        String nm[] = firstinput.split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);
        int[] result = new int[N];
        for(int i = 0; i < M; i++){
            String eachinput = br.readLine();
            String inputs[] = eachinput.split(" ");
            int firstnumber = Integer.parseInt(inputs[0]);
            int secondnumber = Integer.parseInt(inputs[1]);
            int thirdnumber = Integer.parseInt(inputs[2]);
            for(int j = firstnumber-1; j <= secondnumber-1; j++){
                result[j] = thirdnumber;
            }
        }
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}