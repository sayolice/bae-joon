import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 학점*등급의 합, 학점의 총합
        double sum=0;
        double totalgrade=0;
        // for문 스무번 반복
        for(int i=0; i<20; i++){
            // 과목, 학점, 등급 입력
            String subject= sc.next();
            double grade= sc.nextDouble();
            String rank= sc.next();
            // 등급에 따라서 점수 계산및 합에 더함
            if(rank.charAt(0)=='A'){
                if(rank.charAt(1)=='+'){
                    sum+= grade*4.5;
                }
                else{
                    sum+= grade*4.0;
                }
            }
            // 이하 내용 같음
            else if(rank.charAt(0)=='B'){
                if(rank.charAt(1)=='+'){
                    sum+= grade*3.5;
                }
                else{
                    sum+= grade*3.0;
                }
            }
            else if(rank.charAt(0)=='C'){
                if(rank.charAt(1)=='+'){
                    sum+= grade*2.5;
                }
                else{
                    sum+= grade*2.0;
                }
            }
            else if(rank.charAt(0)=='D'){
                if(rank.charAt(1)=='+'){
                    sum+= grade*1.5;
                }
                else{
                    sum+= grade*1.0;
                }
            }
            else if(rank.charAt(0)=='F'){
                sum+=grade*0.0;
            }
            // P일 경우 예외처리
            else{
                continue;
            }
            // 학점 총합 계산
            totalgrade+=grade;
        }
        // 전공 평점 계산
        double average= sum/totalgrade;
        // 출력 소숫점 6자리 제한
        System.out.printf("%.6f",average);
    }
}