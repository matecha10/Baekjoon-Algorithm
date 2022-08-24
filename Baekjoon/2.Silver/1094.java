import java.io.*;
import java.util.*;
public class Main {
	static StringBuffer sb = new StringBuffer();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		int stick = 64;
		while(N>0) {
			if(stick > N) stick/=2;
			else {
				result++;
				N-=stick;
			}
		}
		System.out.println(result);
	}
}