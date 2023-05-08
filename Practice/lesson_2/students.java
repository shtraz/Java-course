import java.io.BufferedReader;
import java.io.FileReader;

//���� ������ (��������� ����� ������� ��������� ����!!!)
//
//"�������":"������","������":"5","�������":"����������"
//"�������":"�������","������":"4","�������":"�����������"
//
//�������� �����(�), ������� ��������� ������ �, ��������� StringBuilder, ������� ������ ����:
//������� [�������] ������� [������] �� �������� [�������].
//
//������ ������ � �������:
//������� ������ ������� 5 �� �������� ����������.
//������� ������� ������� 4 �� �������� �����������.
//������� ������� ������� 5 �� �������� ������.
public class students {
    public static void main(String[] args) throws Exception {

        String dataFile = "C:/Users/shtraz/IdeaProjects/Java-course/Practice/lesson_2/students.txt";
        String[] infoBase;
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            String line; {
                while ((line = br.readLine()) != null) {
                    infoBase = line.replace("\"", "").split(":|,");
                    sb.append("������� ").append(infoBase[1]).append(" ������� ").append(infoBase[3])
                            .append(" �� �������� ").append(infoBase[5]).append(".\n");
                }
                System.out.println(sb);
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
