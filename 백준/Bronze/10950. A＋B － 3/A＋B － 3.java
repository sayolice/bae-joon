import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int re= sc.nextInt();
		
		int a=0;
		int b=0;
		
		for(int i=1; i<=re; i++){
		    a= sc.nextInt();
		    b= sc.nextInt();
		    
		    System.out.println(a+b);
		}
	}
}