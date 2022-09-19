import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
public class Main {
    static StringBuffer sb = new StringBuffer();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] array = new int[num];
        int [] temp = new int[num];
        int count = 0 ; 
        for(int i = 0 ; i<num;i++) {
            int inputNumber = Integer.parseInt(st.nextToken());
            array[i] = inputNumber;
            temp[i] = inputNumber;
        }
        Arrays.sort(array);
        HashMap<Integer,Integer>hashmap = new HashMap<>();
        for(int i = 0 ; i<array.length;i++) {
            if(!hashmap.containsKey(array[i])) {
                hashmap.put(array[i],count++);
            }
        }

        for(int i = 0 ; i<num;i++) {
            sb.append(hashmap.get(temp[i])).append(" ");
        }
        System.out.println(sb);
    }
}