import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	static StringBuffer sb = new StringBuffer();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int index = 1;
		while(true) {
			String[] array = br.readLine().split(" ");
			int result = 0 ; 
			int L = Integer.parseInt(array[0]);
			int P = Integer.parseInt(array[1]);
			int V = Integer.parseInt(array[2]);
			if(L==0) {
				break;
			}

			result = (V/P)*L;
			
			if(V%P <=L) {
				result+=V%P;
			}else {
				result+=L;
			}

			sb.append("Case "+index+": "+result).append("\n");
			index++;
		}
		System.out.println(sb);
	}
}
