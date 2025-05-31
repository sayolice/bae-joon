import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 입력 n
        int n= sc.nextInt();
        // 출력 search
        int search=1;
        // 한 육각형 줄의 최대 방 번호, 시작은 1
        int max_room_number= 1;
        // 최대 번호가 찾는 번호보다 작으면
        while(n>max_room_number){
            // 6의 배수를 점진적으로 증가후 합, 1-7-19
            max_room_number+= 6*search;
            // 이동 횟수 증가
            search++;
        }
        
        System.out.println(search);
    }
}