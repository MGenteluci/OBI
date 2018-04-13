import java.util.Scanner;

class Montanha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String r = "N";
		int n = scan.nextInt();
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++){
			p[i] = scan.nextInt();
		}
		
		for(int i = 1; i < n-1; i++){
			if(p[i] < p[i-1] && p[i] < p[i+1]){
				r = "S";
			}
		}
		
		System.out.println(r);

	}
}