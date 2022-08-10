import java.io.*;
import java.util.*;
public class Main {
	static StringBuffer sb = new StringBuffer();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			int dif = Y-X;
			int max = (int)Math.sqrt(dif);
			if(max ==Math.sqrt(dif)) {
				sb.append(max*2-1).append("\n");
			}else if(dif<=max*max+max) {
				sb.append(max*2).append("\n");
			}else {
				sb.append(max*2+1).append("\n");
			}
		}
		System.out.println(sb);
	}
}