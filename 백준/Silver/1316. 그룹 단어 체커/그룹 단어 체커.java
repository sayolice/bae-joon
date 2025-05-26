import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 단어의 개수 입력
        int n= sc.nextInt();
        int count=0;
        // n 만큼 반복
        for(int i=0; i<n; i++){
            // 단어 입력
            String word= sc.next();
            // a-z의 저장소
            boolean[] Record= new boolean[26];
            // 그룹 단어인지 여부
            boolean grword= true;
            // 이전 글자를 저장할 변수
            char back= 0;
            // 단어를 하나씩 확인
            for(int j=0; j<word.length(); j++){
                // 현재 알파벳
                char now= word.charAt(j);
                // 현재 알파벳이 전과 다르고
                if(now!= back){
                    // 기록되었다면
                    if(Record[now-97]){
                        // 그룹 단어가 아니다
                        grword= false;
                        break;
                    }
                    // 아니라면 기록
                    Record[now-97]= true;
                }
                // 다음 글자 비교를 위해 저장
                back= now;
            }
            // 그룹 단어면 카운트
            if(grword){
                count++;
            }
        }
        sc.close();
        // 출력
        System.out.println(count);
    }
}