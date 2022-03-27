package les_4;

public class AmusementPark {
    public static void main(String[] args) {
        Park.Atr atr1 = new Park().new Atr("Колесо обозрения", 10, 22, 30);
        Park.Atr atr2 = new Park().new Atr("Машинки", 10, 21, 45);
        atr1.information();
        atr2.information();
    }

}
