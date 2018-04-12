import java.util.Scanner;

class JogoDeTabuleiro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] m = new int [n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				m[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 1; i < n; i++){
			for(int j = 1; j < n; j++){
				
				int cont0 = 0, cont1 = 0;
				
				if(m[i-1][j-1] == 1){
					cont1++;
				}else{
					cont0++;
				}
				
				if(m[i][j-1] == 1){
					cont1++;
				}else{
					cont0++;
				}
				
				if(m[i-1][j] == 1){
					cont1++;
				}else{
					cont0++;
				}
				
				if(cont1 > cont0){
					m[i][j] = 0;
				}else{
					m[i][j] = 1;
				}
				
			}
		}
		
		System.out.println(m[n-1][n-1]);
		
	}

	}