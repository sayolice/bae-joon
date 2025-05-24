import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // K,Q 기물
        for(int i=0; i<2; i++){
            int count=0;
            int num= sc.nextInt();
            while(num!=1){
                if(num<1){
                    count++;
                    num++;
                }
                else{
                    count--;
                    num--;
                }
            }
            System.out.print(count+" ");
        }
        // R,Kn,B 기물물
        for(int i=0; i<3; i++){
            int count=0;
            int num= sc.nextInt();
            while(num!=2){
                if(num<2){
                    count++;
                    num++;
                }
                else{
                    count--;
                    num--;
                }
            }
            System.out.print(count+" ");
        }
        // 폰 기물물
        int count=0;
        int num= sc.nextInt();
        
        while(num!=8){
                if(num<8){
                    count++;
                    num++;
                }
                else{
                    count--;
                    num--;
                }
            }
            System.out.print(count+" ");
    }
}
