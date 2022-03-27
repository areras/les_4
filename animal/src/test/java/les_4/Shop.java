package les_4;

public class Shop {
    public static void main(String[] args) {
        Payment.List list = new Payment().new List("Список:");
        list.setChecklist("Квас");
        list.setChecklist("Мороженное");
        list.setChecklist("Сосиски");
        list.setChecklist("Творог");
        list.setChecklist("Мука");
        list.getChecklist();
    }
}
