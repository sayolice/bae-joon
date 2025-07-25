import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 참가자 수 n
        int n= sc.nextInt();
        // 티셔츠 사이즈별 6개
        int[] t_shirt= new int[6];
        for(int i=0; i<6; i++){
            t_shirt[i]= sc.nextInt();
        }
        // 티셔츠와 펜의 묶음수
        int t= sc.nextInt();
        int p= sc.nextInt();
        // 펜의 묶음
        double bundle=0;
        // 6번 반복
        for(int i=0; i<t_shirt.length; i++){
            // 나눈뒤 올림처리
            bundle+=Math.ceil((double)t_shirt[i]/t);
        }
        // 출력
        System.out.println((int)bundle);
        // 펜의 몫과 나머지
        System.out.println(n/p+" "+n%p);
    }
}