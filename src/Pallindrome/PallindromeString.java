package Pallindrome;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "RACECAR";
		char[] arr = str.toCharArray();
		char[] arr1 = str.toCharArray();
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr1[j] = arr[i];
			j++;
		}
		String str1 = new String(arr1);
		System.out.println(str1);
		if (str.equalsIgnoreCase(str1)) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not a Pallindrome");
		}
	}

}
