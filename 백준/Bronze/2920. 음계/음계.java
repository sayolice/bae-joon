import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 변수 선언
        int melody1=0;
        int melody2=0;
        int j=8;
        // for문
        for(int i=1; i<=8; i++){
            int music= sc.nextInt();
            if(i==music){
                melody1++;
            }
            else if(j==music){
                melody2++;
            }
            j--;
        }
        // 출력
        if(melody1==8){
            System.out.println("ascending");
        }
        else if(melody2==8){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
    }
}