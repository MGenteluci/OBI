import java.util.Scanner;

class JogoDeParOuImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		if(p == 0){
			if((a+b) % 2 == 0)
				System.out.println("0");
			else
				System.out.println("1");
		}else if(p == 1){
			if( (a+b) % 2 == 0)
				System.out.println("1");
			else
				System.out.println("0");
		}
		
	}
}
