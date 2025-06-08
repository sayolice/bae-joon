import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 반복
        while(true){
            // n입력
            int n= sc.nextInt();
            int sum=0;
            int cnt=0;
            // -1이면 종료
            if(n==-1){
                break;
            }
            // n-1만큼 반복, 합과 "+"카운트를 위해
            for(int i=1; i<n; i++){
                if(n%i==0){
                    sum+=i;
                    cnt++;
                }
            }
            // 완전수라면
            if(sum==n){
                System.out.print(n+" = ");
                // n-1만큼 반복, 오름차순 나열
                for(int i=1; i<n; i++){
                    if(n%i==0){
                        System.out.print(i+" ");
                        if(cnt!=1){
                            System.out.print("+ ");
                            cnt--;
                        }
                    }
                }
                 System.out.println("");
            }
            // 완전수가 아니라면
            else{
                System.out.println(n+" is NOT perfect.");
            }
        }
        sc.close();
    }
}