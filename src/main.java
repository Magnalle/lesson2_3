import java.util.Arrays;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        // номер 1

        String text = "The self-study lessons in this section are written and organised according to the levels of the Common European Framework of Reference for languages (CEFR). There are different types of texts and interactive exercises that practise the reading skills you need to do well in your studies, to get ahead at work and to communicate in English in your free time.";
        String words[] = text.replace(".","")
                .replace(",","")
                .replace("(","")
                .replace(")","")
                .toLowerCase()
                .split(" ");
        System.out.print("Initial words: ");
        System.out.println(Arrays.asList(words));

        HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++)
        {
            if (wordsCount.containsKey(words[i]))
                wordsCount.put(words[i], wordsCount.get(words[i]) + 1);
            else
                wordsCount.put(words[i], 1);
        }
        System.out.print("Words count: ");
        System.out.println(wordsCount);

        // номер 2

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.AddPerson("Иванов", "11111", "ivanov1@gmail.com");
        phoneBook.AddPerson("Иванов", "22222", "ivanov2@gmail.com");
        phoneBook.AddPerson("Сидоров", "123412", "sidorov@gmail.com");

        System.out.println(phoneBook.persons);
        System.out.println("Телефон Иванова: " + phoneBook.findPhone("Иванов"));
        System.out.println("Email Иванова: " + phoneBook.findEmail("Иванов"));
        System.out.println("Телефон Сидоров: " + phoneBook.findPhone("Сидоров"));
        System.out.println("Email Сидоров: " + phoneBook.findEmail("Сидоров"));
        System.out.println("Телефон Петров: " + phoneBook.findPhone("Петров"));
        System.out.println("Email Петров: " + phoneBook.findEmail("Петров"));
    }
}
