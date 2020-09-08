package org.example.basic1.exercise047;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Exercise047 {
    public static void main(String[] args){
        double currentOFDate = currentOFDate();
    }
    public static double currentOFDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime dateNow = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(dateNow));
        return 0;
    }
}
