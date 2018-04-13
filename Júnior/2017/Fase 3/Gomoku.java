import java.util.Scanner;

class Gomoku {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] m = new int[15][15];
		int r = 0;
		
		for(int i = 0; i < 15; i++){
			for(int j = 0; j < 15; j++){
				m[i][j] = scan.nextInt();
			}
		}

		for(int i = 0; i < 15; i++){
			for(int j = 0; j < 11; j++){
				if( (m[i][j] == 1 && m[i][j+1] == 1 && m[i][j+2] == 1 && m[i][j+3] == 1 && m[i][j+4] == 1) ){
					r=1;
				}else if( (m[i][j] == 2 && m[i][j+1] == 2 && m[i][j+2] == 2 && m[i][j+3] == 2 && m[i][j+4] == 2) ){
					r=2;
				}
			}
		}
		
		for(int i = 0; i < 11; i++){
			for(int j = 0; j < 15; j++){
				if( (m[i][j] == 1 && m[i+1][j] == 1 && m[i+2][j] == 1 && m[i+3][j] == 1 && m[i+4][j] == 1) ){
					r=1;
				}else if( (m[i][j] == 2 && m[i+1][j] == 2 && m[i+2][j] == 2 && m[i+3][j] == 2 && m[i+4][j] == 2) ){
					r=2;
				}
			}
		}
		
		for(int i = 0; i < 11; i++){
			for(int j = 0; j < 11; j++){
				if( (m[i][j] == 1 && m[i+1][j+1] == 1 && m[i+2][j+2] == 1 && m[i+3][j+3] == 1 && m[i+4][j+4] == 1) ){
					r=1;
				}else if( (m[i][j] == 2 && m[i+1][j] == 2 && m[i+2][j] == 2 && m[i+3][j] == 2 && m[i+4][j] == 2) ){
					r=2;
				}
			}
		}
		
		for(int i = 14; i > 3; i--){
			for(int j = 0; j < 11; j++){
				if( (m[i][j] == 1 && m[i-1][j+1] == 1 && m[i-2][j+2] == 1 && m[i-3][j+3] == 1 && m[i-4][j+4] == 1) ){
					r=1;
				}else if( (m[i][j] == 2 && m[i-1][j+1] == 2 && m[i-2][j+2] == 2 && m[i-3][j+3] == 2 && m[i-4][j+4] == 2) ){
					r=2;
				}
			}
		}
		
		System.out.println(r);
		
	}
}
