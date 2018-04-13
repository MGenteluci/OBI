import java.util.Scanner;

class Zip {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lia;
		int carolina;
		int liaA = scan.nextInt();
		int liaB = scan.nextInt();
		int carolinaA = scan.nextInt();
		int carolinaB = scan.nextInt();

		if(liaA == liaB){
			lia = (liaA + liaB)*2;
		}else if(liaA == (liaB+1) || liaA == (liaB-1)){
			lia = (liaA + liaB)*3;
		}else{
			lia = liaA + liaB;
		}
		
		if(carolinaA == carolinaB){
			carolina = (carolinaA + carolinaB)*2;
		}else if(carolinaA == (carolinaB-1) || carolinaA == (carolinaB+1)){
			carolina = (carolinaA + carolinaB)*3;
		}else{
			carolina = carolinaA + carolinaB;
		}
		
		if(lia > carolina){
			System.out.println("Lia");
		}else if(carolina > lia){
			System.out.println("Carolina");
		}else{
			System.out.println("empate");
		}
			
	}
}
