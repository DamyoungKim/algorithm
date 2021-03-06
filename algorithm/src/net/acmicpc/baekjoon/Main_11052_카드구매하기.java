package net.acmicpc.baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11052_카드구매하기 {
//	static int[] arr, dp;
//	static int N;
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		N = Integer.parseInt(br.readLine());
//		
//		arr = new int[N + 1];
//		dp = new int[N + 1];
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i = 1; i < N + 1; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//		dp[1] = arr[1];
//		
//		for(int i = 2; i < N + 1; i++) {
//			int temp = 0;
//			for(int j = 1; j <=  i / 2; j++) {
//				temp = Math.max(temp, dp[i - j] + dp[j]);
//			}
//			dp[i] = Math.max(temp, arr[i]);
//		}
//		
//		System.out.println(dp[N]);
//	}
	static int[] arr = new int[1001];
	static int[] dp = new int[1001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] = Math.max(dp[i - j] + arr[j], dp[i]);
			}
			max = Math.max(dp[i], max);
		}
		System.out.println(max);
	}

}
