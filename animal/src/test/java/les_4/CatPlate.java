package les_4;

public class CatPlate {
    public static void main(String[] args) {
        Cat cat = new Cat("БоШик", 50);
        Plate plate = new Plate(180);
        plate.info();
        cat.satiety(plate);
        cat.eat(plate);
        plate.info();
        plate.setFood(120);
        plate.info();
        Cat[] caty = new Cat[5];
        caty[0] = new Cat("Шурик", 95);
        caty[1] = new Cat("Гулящ", 70);
        caty[2] = new Cat("Том", 120);
        caty[3] = new Cat("Болт", 50);
        caty[4] = new Cat("Тутик", 35);
        for (int i = 0; i < 5; i++) {
            caty[i].satiety(plate);
            caty[i].eat(plate);
            plate.info();

        }
    }
}
