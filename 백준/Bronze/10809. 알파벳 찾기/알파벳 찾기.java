import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 알파벳 입력
        String alpabet= sc.next();
        sc.close();
        // 아스키코드 a
        int ascii=97;
        // 아스키코드 z=122, a 부터 z 까지 반복
        while(ascii!=123){
            boolean check=false;
            for(int i=0; i<alpabet.length(); i++){
                if(alpabet.charAt(i)==ascii){
                    System.out.print(i+" ");
                    check=true;
                    break;
                }
            }
            if(check==false){
                System.out.print("-1 ");
            }
            ascii++;
        }
        
    }
}