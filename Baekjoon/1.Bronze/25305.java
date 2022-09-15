import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class Main {
	static StringBuffer sb = new StringBuffer();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		ArrayList<Integer>list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<N;i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(num);
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.get(k-1));
	}
}