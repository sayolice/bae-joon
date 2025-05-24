import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 입력
		String word= sc.next();
		
		int num=word.length();
		int result=1;
		sc.close();
		
		for(int i=0; i<num; i++){
		    // 비교
		    if(word.charAt(i)!=word.charAt(num-1-i)){
		        result=0;
		    }
		}
		// 출력
		System.out.println(result);
		
	}
}