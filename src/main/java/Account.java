public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        int firstSpace = name.indexOf(" ");
        int lastSpace = name.lastIndexOf(" ");
        int length = name.length();

        return length <= 19 & length >= 3 & !(firstSpace == -1) & firstSpace != 0 & !(lastSpace == length - 1) & firstSpace == lastSpace;
    }
}