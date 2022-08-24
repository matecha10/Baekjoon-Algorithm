import java.io.*;
import java.util.*;
public class Main {
	static StringBuffer sb = new StringBuffer();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());


		int [][] array = new int[N][M];
		for(int i = 0 ; i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0  ; j<M;j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
			//System.out.println(Arrays.toString((array[i])));
		}
		st = new StringTokenizer(br.readLine()," ");
		st.nextToken();
		int K = Integer.parseInt(st.nextToken());
		
		int [][] array2 = new int[M][K];
		for(int i = 0 ; i<M;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0 ; j<K;j++) {
				array2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0 ; i<N;i++) {
			for(int j = 0 ; j<K;j++) {
				int sum = 0 ; 
				for(int z = 0 ; z<M;z++) {
					sum+=array[i][z]*array2[z][j];
				}
				sb.append(sum).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
