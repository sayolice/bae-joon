import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 2차우너 배열 생성 9x9
        int[][] arr= new int[9][9];
        // 변수 선언
        int max=0;
        int index_i=0;
        int index_j=0;
        // for문 81번
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                // 입력
                arr[i][j]= sc.nextInt();
                // 최댓값 계산
                if(arr[i][j]>=max){
                    max=arr[i][j];
                    // 주소 저장
                    index_i=i;
                    index_j=j;
                }
            }
        }
        System.out.println(max);
        System.out.print((index_i+1)+" "+(index_j+1));
    }
}