package Pallindrome;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int num = 444;
		int temp = num;
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			sum = sum*10 + rem;
			num = num/10;
		}
		if(sum == temp) {
			System.out.println("Is Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	*/
		
		int n = 232;
		int tmp = n;
		int s = 0;
		while(n!=0) {
			int r = 0;
			r = n%10;
			s = s*10 + r;
			n = n/10;
		}
		System.out.println(s);
		
		if(tmp == s) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}

}
