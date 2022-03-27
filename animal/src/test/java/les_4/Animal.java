package les_4;

public class Animal {
    // сдесь задаем одинаковые типы данных для всех животных, индивидуальные навыки задаются в классе для конкретного животного
    protected String type;
    protected String name;
    protected int run;
    protected int sweem;
    private static int count;

    public Animal() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public String toString() {
        return "Вид: '" + type + '\'' +
                ", Кличка: '" + name + "\' " +
                "Пробежал " + run + "м. " +
                "Проплыл " + sweem + "м.\n";
    }
    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "  - Пробежал " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не смог пробежать дистанции ---- ");
        }
    }
    protected void sweem(int distance) {
        if (sweem >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО проплыл " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не смог проплыть дистанцию ---- ");

        }
    }
}