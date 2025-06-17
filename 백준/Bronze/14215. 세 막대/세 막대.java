import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 세 변 입력
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        // 최대 길이의 변
        int max=0;
        // 가장 큰 변 찾기
        if(a<=b){
            if(b<=c){
                max=c;
            }
            else{
                max=b;
            }
        }
        else if(a>=b){
            if(a>=c){
                max=a;
            }
            else{
                max=c;
            }
        }
        // 남은 두변의 길이가 다른 한변에 길이보다 클시
        if(max<a+b+c-max){
            // 세변의 최대값으로 삼각형이 가능
            System.out.println(a+b+c);
        }
        else{
            // 두변의 길이를 연장시킨뒤 1을 줄여서 접었을시 삼각형이 되도록
            // 1, 100, 1= 3(2*2-1)
            System.out.println((a+b+c-max)*2-1);
        }
    }
}