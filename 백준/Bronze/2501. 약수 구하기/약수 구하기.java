import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 입력 n, k
        int n= sc.nextInt();
        int k= sc.nextInt();
        // 출력값 result. n<k일경우를 대비한 0으로 초기화
        int result=0;
        // count
        int cnt=0;
        // n만큼 반복
        for(int i=1; i<=n; i++){
            // 약수일때
            if(n%i==0){
                cnt++;
                // k번째 약수일경우
                if(cnt==k){
                    result=i;
                    // 탈출
                    break;
                }
            }
        }
        // 출력
        System.out.println(result);
    }
}