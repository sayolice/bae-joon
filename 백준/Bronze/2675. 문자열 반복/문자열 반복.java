import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // for문을 반복할 횟수 입력
        int t= sc.nextInt();
        // for문 (i=for을 반복할 횟수)
        for(int i=0; i<t; i++){
            // 문자열을 반복할 횟수 입력
            int r= sc.nextInt();
            // 문자열 입력
            String s= sc.next();
            // 문자열 순회
            for(int j=0; j<s.length(); j++){
                // 문자열 반복
                for(int k=0; k<r; k++){
                    // 문자열 위치 j의 문자 출력
                    System.out.print(s.charAt(j));
                }
            }
            // 줄바꿈
            System.out.println("");
        }
        sc.close();
    }
}