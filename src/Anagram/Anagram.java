package Anagram;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Nitin";
		System.out.println(str.indexOf("i"));
		System.out.println(str.substring(0,3));
		boolean s =str.endsWith("i");
		System.out.println(s);
		//change to char array
		char[] arr = str.toCharArray();
		//intialize another array of same length
		char[] arr_new = new char[str.length()];
		//now reverse the string and store into new array
		int j = 0;
		for(int i =str.length()-1;i>=0;i--) {
			arr_new[j++] = arr[i];
			
		}
		//now convert the new array into String
		String str_new = new String(arr_new);
		
		//Logic to compare the strings
		if(str.equalsIgnoreCase(str_new)) {
			System.out.print("Anagram" + str);}
			else {
				System.out.println("Not Anagram" + str);
				
			}
		}
	

}
