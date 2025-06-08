import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // m, n입력
        int m= sc.nextInt();
        int n= sc.nextInt();
        sc.close();
        // 합, 최솟값
        int sum=0;
        int min=0;
        // m부터 n까지 반복
        for(int i=m; i<=n; i++){
            // 소수는 2부터, 2미만의 수는 스킵
            if(i<2){
                continue;
            }
            // i가 소수라고 가정
            boolean prime=true;
            // 소수 판별
            for(int j=2; j<i; j++){
                // 나누어진다면
                if(i%j==0){
                    // 소수가 아니다
                    prime=false;
                    break;
                }
            }
            // 소수라면
            if(prime){
                // 최솟값 저장
                if(min==0){
                    min=i;
                }
                // 합산
                sum+=i;
            }
        }
        // 합이 변함없다, m이상 n이하에 소수가 없다
        if(sum==0){
            System.out.println("-1");
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}