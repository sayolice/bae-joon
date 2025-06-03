import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 반복문
        while(true){
            // a, b, c
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // 0 0 0이면 종료
            if (a == 0 && b == 0 && c == 0){
                break;
            }
            // 숫자 정렬
            if (a > b && a > c){
                int temp= c;
                c= a;
                a= temp;
            } 
            else if(b > a && b > c){
                int temp= c;
                c= b;
                b= temp;
            }
            // 피타고라스
            if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }
    }
}
