import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate today = LocalDate.now();
        
        String formattedDate = today.format(formatter);
        
        System.out.println(formattedDate);
    }
}