import java.util.Scanner;

class Medalhas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int t1 = scan.nextInt();
		int t2 = scan.nextInt();
		int t3 = scan.nextInt();
		
		int p = 0, s = 0, t = 0;
		
		if(t1 < t2 && t1 < t3) {
			p = 1;
			if(t2 < t3) {
				s = 2;
				t = 3;
			}else {
				s = 3;
				t = 2;
			}
		}else if(t2 < t1 && t2 < t3) {
			p = 2;
			if(t1 < t3) {
				s = 1;
				t = 3;
			}else {
				s = 3;
				t = 1;
			}
		}else if(t3 < t1 && t3 < t2) {
			p = 3;
			if(t1 < t2) {
				s = 1;
				t = 2;
			}else {
				s = 2;
				t = 1;
			}
		}
		
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(t);
	}
}
