import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 시험본 과목의 개수 n
        int n= sc.nextInt();
        // 배열
        double[] score= new double[n];
        // 변수들
        double max= 0;
        double sum= 0;
        // 점수들 입력
        for(int i=0; i<n; i++){
            score[i]= sc.nextDouble();
            if(score[i]>=max){
                max=score[i];
            }
        }
        // close
        sc.close();
        // 합 계산
        for(int i=0; i<n; i++){
            sum+= score[i]/max*100;
        }
        // 평균
        double average= sum/n;
        // 출력
        System.out.println(average);
    }
}