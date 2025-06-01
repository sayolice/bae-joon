import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 입력 x
        int x= sc.nextInt();
        sc.close();
        // 분수 번호
        int num=1;
        // 옳바른 분수 찾기
        for(int i=1; i<=10000000; i++){
            for(int j=1; j<=i; j++){
                // 원하는 분수면 출력
                if(num==x){
                    // 두가지 출력방식 a<b, a/b || a>b, a/b
                    if(i%2==0){
                        System.out.println(j + "/" + (i - j + 1));
                    }
                    else{
                        System.out.println(i - j + 1 + "/" + j);
                    }
                    // 종료
                    return;
                }
                // 분수 번호 증가
                num++;
            }
        }
    }
}