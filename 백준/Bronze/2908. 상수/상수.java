import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 숫자입력
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        // close
        sc.close();
        // 메서드 호출
        int result= reverse(num1, num2);
        // 출력
        System.out.println(result);
    }
    // 뒤집고 비교하기
    public static int reverse(int num1, int num2){
        // 숫자 -> 문자열
        String str1= Integer.toString(num1);
        String str2= Integer.toString(num2);
        // 저장
        String result1="";
        String result2="";
        // for문
        for(int i=str1.length()-1; i>=0; i--){
            result1+= str1.charAt(i);
        }
        for(int i=str2.length()-1; i>=0; i--){
            result2+= str2.charAt(i);
        }
        // 누가 더 큰지 비교할 변수
        int reversedNum1 = Integer.parseInt(result1);
        int reversedNum2 = Integer.parseInt(result2);
        // 비교
        if (reversedNum1 > reversedNum2){
            return reversedNum1;
        }
        else{
            return reversedNum2;
        }
    }
}