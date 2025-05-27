import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 2차원 배열 생성
        String arr[][]= new String[5][15];
        // for문 
        for(int i=0; i<5; i++){
            // 한줄 입력
            String line= sc.nextLine();
            // 입력한 줄 길이 만큼 반복
            for(int j=0; j<line.length(); j++){
                // 줄 하나씩 저장
                arr[i][j]= String.valueOf(line.charAt(j));
            }
        }
        // 세로 출력
        for(int j=0; j<15; j++){
            for(int i=0; i<5; i++){
                if(arr[i][j]!=null){
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}