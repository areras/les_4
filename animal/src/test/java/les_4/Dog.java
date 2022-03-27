package les_4;
public class Dog extends Animal {

    private static int count;

    public Dog(String type, String name, int run, int sweem) {
        this.type = type;
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        count++;
    }
    public static int getCount() {
        return count;
    }
}