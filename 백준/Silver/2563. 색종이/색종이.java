import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 반복할 횟수 입력
        int paper= sc.nextInt();
        // 넓이 면적
        boolean[][] area= new boolean[100][100];
        int extent=0;
        // for문
        for(int i=0; i<paper; i++){
            // 종이의 좌측 대각선 아래 위치 입력
            int x= sc.nextInt();
            int y= sc.nextInt();
            // 종이의 사이즈 10x10
            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    // 종이가 없는 위치라면
                    if(!area[j][k]){
                    area[j][k]= true;
                    extent++;
                    }
                }
            }
        }
        sc.close();
        // 출력
        System.out.println(extent);
    }
}