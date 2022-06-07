import java.util.Date;
import java.time.format.DateTimeFormatter;

class Clock {
    public static void main(String[] args) {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm");
        Date date = new Date();
        System.out.printf("Before formatting: " + date);
        String formattedTime = timeFormat.format(new Date());
        System.out.printf("After formatting: " + formattedTime);
    }
  }