import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// for문 반복할 횟수
		int t= sc.nextInt();
		// for문
		for(int i=1; i<=t; i++){
		    // 호텔의 층 수, 각 층의 방 수, 몇 번째 손님 입력
		    int h=sc.nextInt();
		    int w=sc.nextInt();
		    int n=sc.nextInt();
		    // 몇 층인지 계산
		    int floor= n%h;
		    if(floor==0){
		        floor=h;
		    }
		    // 몇 호실인지 계산
		    int room= n/h;
		    if(n%h!=0){
		        room++;
		    }
		    // 출력값
		    int room_number= floor*100+room;
		    // 출력
		    System.out.println(room_number);
		}
	}
}
