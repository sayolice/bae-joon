import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 숫자 입력
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        sc.close();
        // 숫자 곱, 문자열 변환
        int abc= a*b*c;
        String num= Integer.toString(abc);
        // for 문 (i=카운트 할 숫자, j=문자열 위치)
        for(int i=0; i<=9; i++){
            int count=0;
            for(int j=0; j<num.length(); j++){
                // 문자열 위치 j가 카운트할 숫자라면
                if(num.charAt(j)-'0'==i){
                    count++;
                }
            }
            // 출력
            System.out.println(count);
        }
    }
}