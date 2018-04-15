import java.util.Scanner;

class PlantacaoDeMorango {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		
		if(n1*n2 > n3*n4) {
			System.out.println(n1*n2);
		}else {
			System.out.println(n3*n4);
		}
		
	}
}
