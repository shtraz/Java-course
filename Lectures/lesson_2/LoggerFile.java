import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerFile {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(LoggerFile.class.getName());
//        ConsoleHandler ch = new ConsoleHandler();
        File dir = new File("C:/Users/shtraz/IdeaProjects/Java-course/Lectures/lesson_2");
        FileHandler fh = new FileHandler(dir + "\\log.txt");
//        FileHandler fh = new FileHandler("log.xml");
//        logger.addHandler(ch);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
//        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
//        fh.setFormatter(xml);
//        ch.setFormatter(xml);

        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "�������� ����������� 1");
        logger.info("�������� ����������� 2");

    }
}
