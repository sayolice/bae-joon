import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int d1= sc.nextInt();
        int d2= sc.nextInt();
        int d3= sc.nextInt();
        
        int money=(d1==d2&&d2==d3)? 10000+d1*1000: 
            (d1==d2||d1==d3)? 1000+d1*100: 
            (d2==d3)? 1000+d2*100: 
            Math.max(Math.max(d1,d2),d3)*100;
        
        System.out.println(money);
    }
}