import java.io.*;
import java.util.*;
public class Main {
	static StringBuffer sb = new StringBuffer();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		int N = Integer.parseInt(br.readLine());
		int result = 0 ; 
		for(int i = 0 ; i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a<=b) {
				result+=(b%a);
			}else if(a>b) {
				result+=b;
			}
		}
		sb.append(result);
		System.out.println(sb);
	}
}