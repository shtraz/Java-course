import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class SortedContacts {
    public static void main(String[] args) {
        Map<String, Integer> contacts = new HashMap<>();
        String[] contactsArray = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };
        
        for (String el: contactsArray) {
            String name = el.split(" ")[0];
            
            if (contacts.containsKey(name)) {
                contacts.replace(name, contacts.get(name) + 1);
            }
            else contacts.put(name, 1);
        }
        
        Map<String, Integer> sortedDict = sortHashMap(contacts);
        System.out.println(contacts);
        System.out.println(sortedDict);
    }
    
    public static Map<String, Integer> sortHashMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        int max = 1;
        
        for (int value: map.values())
        
        if (value > max) max = value;
        
        for (int i = max; i > 0; i--) {
            for (var el: map.entrySet())
            if (map.get(el.getKey()) == i)
            sortedMap.put(el.getKey(), el.getValue());
        }
        return sortedMap;
    }
}
