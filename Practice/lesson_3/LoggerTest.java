package lesson_3;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerTest {
    public static void main(String[] args) throws IOException {
        Logger ll = Logger.getLogger(LoggerTest.class.getName());
        String logsPath = "log.txt";
        FileHandler fh = new FileHandler(logsPath, false); // false - файл перезапишется, true - файл допишется
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
//        XMLFormatter formatter = new XMLFormatter();
        fh.setFormatter(formatter);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10);
            ll.log(Level.INFO, "element"); // Запись в Logger можно делать так
        }
        ll.log(Level.WARNING, "logger off"); // Запись в Logger можно делать так
        ll.info("test"); // Запись в Logger можно делать так
        ll.warning("logsgogg"); // Запись в Logger можно делать так
    }
}
