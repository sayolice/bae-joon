import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 반복할 횟수
        int n= sc.nextInt();
        // 배열 x, y
        int[] x_arr= new int[n];
        int[] y_arr= new int[n];
        // 배열에 저장
        for(int i=0; i<n; i++){
            x_arr[i]= sc.nextInt();
            y_arr[i]= sc.nextInt();
        }
        // 최대, 최소
        int maxX = x_arr[0];
        int minX = x_arr[0];
        int maxY = y_arr[0];
        int minY = y_arr[0];
        // 최대와 최소 구별
        for (int i = 0; i < n; i++) {
            if (x_arr[i] > maxX) {
                maxX = x_arr[i];
            }
            if (x_arr[i] < minX) {
                minX = x_arr[i];
            }
            if (y_arr[i] > maxY) {
                maxY = y_arr[i];
            }
            if (y_arr[i] < minY) {
                minY = y_arr[i];
            }
        }
        // 출력, 넓이
        System.out.println((maxX-minX) *(maxY-minY));

    }
}