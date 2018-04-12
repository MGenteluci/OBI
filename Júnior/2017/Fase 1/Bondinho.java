import java.util.Scanner;

class Bondinho {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int m = scan.nextInt();
		
		if(a+m > 50){
			System.out.println("N");
		}else{
			System.out.println("S");
		}

	}

}
