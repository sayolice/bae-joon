import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 반복할 횟수 n
        int n= sc.nextInt();
        // 카운트
        int cnt=0;
        // n 만큼 반복
        for(int i=0; i<n; i++){
            // 숫자입력
            int num= sc.nextInt();
            boolean prime_number= true;
            // 2부터 num-1까지 반복
            for(int j=2; j<num; j++){
                // 만약 나누어진다면
                if(num%j==0){
                    // 소수가 아니다
                    prime_number=false;
                    // 반복문 탈출
                    break;
                }
            }
            // 소수이면서 1이 아닐때
            if(prime_number&&num!=1){
                //증가
                cnt++;
            }
        }
        // 출력
        System.out.println(cnt);
        sc.close();
    }
}
