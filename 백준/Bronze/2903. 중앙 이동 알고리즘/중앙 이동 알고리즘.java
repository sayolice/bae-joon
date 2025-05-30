import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 반복할 횟수 n
        int n= sc.nextInt();
        // 제곱에 쓸 수 num
        int num=2;
        // num에 더할수 next
        int next=1;
        // 출력변수 dot
        int dot=0;
        // for문 n 만큼 반복
        for(int i=0; i<=n; i++){
            // num^2
            dot= (int)Math.pow(num,2);
            num+=next;
            next*=2;
        }
        System.out.println(dot);
    }
}