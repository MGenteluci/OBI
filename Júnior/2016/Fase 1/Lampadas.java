import java.util.Scanner;

class Lampadas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int i1 = 0;
		int i2 = 0;
		int lA = 0;
		int lB = 0;
		
		for(int i = 0; i < n; i++){
			
			int estado = scan.nextInt();
			
			if(estado == 1){
				if(lA == 0){
					lA = 1;
				}else if(lA == 1){
					lA = 0;
				}
			}else if(estado == 2){
				if(lA == 0){
					lA = 1;
				}else if(lA == 1){
					lA = 0;
				}
				
				if(lB == 0){
					lB = 1;
				}else if(lB == 1){
					lB = 0;
				}
			}
			
		}
		
		System.out.println(lA);
		System.out.println(lB);
		
	}
}
