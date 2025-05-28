import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // b진법의 수 n을 입력받음.
        String n= sc.next();
        int b= sc.nextInt();
        sc.close();
        
        int result= 0;
        int len= n.length();
        
        for (int i = 0; i < len; i++) {
            // 오른쪽부터 숫자를 처리: n.charAt(len - 1 - i)
            char bn = n.charAt(len - 1 - i);
            int num = 0;
            
            // 숫자일 경우 ('0' ~ '9')
            if (bn >= '0' && bn <= '9') {
                num = bn - '0';
            } else { // 알파벳(A-Z)의 경우
                num = bn - 'A' + 10;
            }
            
            result += num * (int)Math.pow(b, i);
        }
        
        System.out.println(result);
    }
}