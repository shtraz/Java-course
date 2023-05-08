import java.io.File;

public class read_file {
    public static void main(String[] args) {

        // определяем объект для каталога
        File dir = new File("C:/Users/shtraz/IdeaProjects/Java-course/Lectures/lesson_2");
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){

                if(item.isDirectory()){

                    System.out.println(item.getName() + "  \t folder");
                }
                else{

                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}
