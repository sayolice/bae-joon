import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 입력
        int n= sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        // 저장소들
        String word= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result="";
        // 0이 아니라면
        while(n!=0){
            // 나머지 저장
            int remain= n%b;
            // 나머지 추출
            result+= word.charAt(remain);
            // 수 조정
            n/=b;
        }
        // 거꾸로 출력
        for(int i=result.length()-1; i>=0; i--){
            System.out.print(result.charAt(i));
        }
    }
}