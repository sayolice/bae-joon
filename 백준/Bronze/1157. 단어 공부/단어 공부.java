import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] count= new int[26];
		String word= sc.next();
        // for문 문자열 끝까지
		for(int i=0; i<word.length(); i++){
		    // i위치가 대문자면
			if(word.charAt(i)>=65 && word.charAt(i)<=90){
				count[word.charAt(i)-65]++;
			}
			// 소문자면
			else{
				count[word.charAt(i)-97]++;
			}
		}
        
		int max = 0;
		char result = '?';
        
		for (int i=0; i<26; i++){
			if (count[i]>max){
				max= count[i];
				result= (char)(i + 65);
			}
			else if (count[i]==max) {
				result= '?';
			}
		}
		
		System.out.println(result);
	}
 
}