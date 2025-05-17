import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 단어 입력
        String words= sc.nextLine();
        sc.close();
        // StringTokenizer(띄어스기로 구분)
        StringTokenizer st= new StringTokenizer(words);
        // 출력
        System.out.println(st.countTokens());
    }
}