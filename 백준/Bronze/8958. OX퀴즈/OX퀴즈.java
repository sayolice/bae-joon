import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 테스트 케이스 입력
        int t= sc.nextInt();
        // for문 (테스트 케이스 만큼 반복)
        for(int i=0; i<t; i++){
            // 출력변수 totalscore
            int totalscore=0;
            // ox 입력
            String ox= sc.next();
            // 변수 score
            int score=1;
            for(int j=0; j<ox.length(); j++){
                if(ox.charAt(j)=='O'){
                    totalscore+= score;
                    score++;
                }
                else{
                    score=1;
                }
            }
            System.out.println(totalscore);
        }
        sc.close();
    }
}