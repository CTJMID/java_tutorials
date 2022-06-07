import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Clock {
    public static void main(String[] args) {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm");
        LocalDateTime date = LocalDateTime.now();
        System.out.printf("Before formatting: " + date);
        String formattedTime = timeFormat.format(date);
        System.out.printf("After formatting: " + formattedTime);
    }
  }