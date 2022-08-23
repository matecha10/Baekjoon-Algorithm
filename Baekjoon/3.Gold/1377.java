import java.io.*;
import java.util.*;
public class Main {
	static StringBuffer sb = new StringBuffer();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		Number [] number  = new Number[N];
		for(int i = 0 ; i<N;i++) {
			int num = Integer.parseInt(br.readLine());
			number[i] = new Number(num,i);
		}

		Arrays.sort(number, (o1, o2) -> o1.num - o2.num);
		int result = 0 ;
		for(int i = 0 ; i<N;i++) {
			if(number[i].index - i > result) {
				result = number[i].index - i;
			}
		}
		System.out.println(result+1);
	}

	static class Number{
		int num ;
		int index;
		public Number(int num, int index) {
			this.num = num;
			this.index = index;
		}
	}
}