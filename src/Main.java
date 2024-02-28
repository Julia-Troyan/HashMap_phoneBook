public class Main {


    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Julia", "89182345678");
        phoneBook.addContact("Julia", "89184567891");
        phoneBook.addContact("Marianna", "89188956231");
        phoneBook.addContact("Alexey", "89181245863");
        phoneBook.addContact("Alexey", "89183698523");
        phoneBook.addContact("Anastasiya", "89005784523");
        phoneBook.addContact("Anastasiya", "89009512345");
        phoneBook.addContact("Anastasiya", "89001594563");

        phoneBook.sortPhoneBook();
        phoneBook.deleteContact("Julia");
        phoneBook.sortPhoneBook();
        phoneBook.deleteAll();
        phoneBook.sortPhoneBook();

    }


}