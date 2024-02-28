import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void addContact(String name, String phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(phoneNum);
            phoneBook.put(name, arr);
        }
    }

    public void sortPhoneBook() {
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пуста");
        }
        HashMap<String, ArrayList<String>> sortedPhoneBook = new HashMap<>();
        ArrayList<Map.Entry<String, ArrayList<String>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort(Comparator.comparingInt(entry -> -entry.getValue().size()));


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
    public void deleteContact(String name){
        phoneBook.remove(name);
    }
    public void deleteAll() {
        phoneBook.clear();

    }
}

