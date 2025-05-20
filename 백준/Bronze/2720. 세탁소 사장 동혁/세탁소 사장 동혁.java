import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 테스트케이스
        int t= sc.nextInt();
        
        for(int i=0; i<t; i++){
            int quarter=0;//25
            int dime=0;//10
            int nickel=0;//5
            int penny=0;//1
            // 돈입력
            int money= sc.nextInt();
            // 거스름돈
            while(money!=0){
                if(money>=25){
                    money-=25;
                    quarter++;
                }
                else if(money>=10){
                    money-=10;
                    dime++;
                }
                else if(money>=5){
                    money-=5;
                    nickel++;
                }
                else{
                    money-=1;
                    penny++;
                }
            }
            System.out.print(quarter+" "+dime+" "+nickel+" "+penny);
            System.out.println("");
        }
        sc.close();
    }
}