import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuffer sb = new StringBuffer();
	static int [] memo = new int[2000001];
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<N;i++) {
			int input = Integer.parseInt(br.readLine())+1000000;
			memo[input]++;
		}
		for(int i = 0 ; i<memo.length;i++) {
			if(memo[i]==1) {
				sb.append((i-1000000)).append('\n');
			}
		}
		System.out.println(sb);
	}
}