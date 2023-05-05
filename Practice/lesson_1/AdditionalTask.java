// +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.


public class AdditionalTask {
    public static void main(String[] args) {
        int solution = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69) {
                    solution += 1;
                    System.out.printf("2%d + %d5 = 69", i, j);
                }
            }
        }
        if (solution == 0) {
            System.out.println("Решенией нет!");
        }
    }
}