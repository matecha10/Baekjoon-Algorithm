import java.io.*;
import java.util.*;
public class Main {
	static StringBuffer sb = new StringBuffer();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int sub = (e-c);
			if(r>sub) {
				sb.append("do not advertise").append("\n");
			}else if(r==sub) {
				sb.append("does not matter").append("\n");; 
			}else {
				sb.append("advertise").append("\n");;
			}
		}
		System.out.println(sb);
	}
}