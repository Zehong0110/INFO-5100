package Assignment5;

import java.util.HashSet;

public class Algorithms {

	public static int findFirstUnique(String s) {
		int[] freq=new int[26];
		for(int i=0; i<s.length();i++) {
			freq[s.charAt(i)-'a']++;			
		}
		
		for(int i=0; i<s.length();i++) {
			if(freq[s.charAt(i)-'a']==1)
				{return i;}
		}
		
		return -1;
		
	}
	
	public static int addDigits(int num) {
		
		while (num>10) {
			int temp=0;
			while(num>0) {
				temp=temp+num%10;
				num=num/10;			
			}
			num=temp;
		}
		return num;
		
	}
	
	public static int[] moveZeroToEnd(int[] arr) {
		int zero=0;
		for(int i=0; i<=arr.length-1; i++) {
			if (arr[i]!=0){
				int temp=arr[i];
				arr[i]=arr[zero];
				arr[zero]=temp;
				zero++;
			}
		}
		return arr;
		
	}
	
	public static int longestPalindrome(String s) {
		if(s==null || s.length()==0)
			return 0;
		HashSet<Character> hs=new HashSet<Character>();
		int count=0;
		for(int i=0; i<s.length()-1; i++) {
			if(hs.contains(s.charAt(i))){
				hs.remove(s.charAt(i));
				count++;
			}else {
				hs.add(s.charAt(i));
			}
		}
		
		if(!hs.isEmpty())
		{return count*2+1;}
		return count*2;
	}
	
	public static int[][] rotateImage(int[][] matrix){
		
		int n=matrix.length;
	    for (int i=0; i<n/2; i++) 
	        for (int j=i; j<n-i-1; j++) {
	            int tmp=matrix[i][j];
	            matrix[i][j]=matrix[n-j-1][i];
	            matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
	            matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
	            matrix[j][n-i-1]=tmp;
	        }
	    return matrix;
	    }
		
		
	
	

	
	
}
