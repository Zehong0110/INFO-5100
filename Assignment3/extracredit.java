package Assignment3;

public class extracredit {
	public static void main(String[] args) {
		String test="  zehong";
		String result=reverseString(test);
		System.out.println(result);		
	}
	
	public static String reverseString(String s) {
		s = s.replaceAll("\\s", "");
		char[] word=s.toCharArray();
		int left = 0, right = s.length() - 1;
        while (left < right) {
            char tmp = word[left];
            word[left++] = word[right];
            word[right--] = tmp;
        }
        return new String(word);
		
	}

}


