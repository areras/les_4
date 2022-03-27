package les_4;
public class Cat extends Animal {

    private static int count; // счетчик количества созданных животных класса Cat

    public Cat(String type, String name, int run, int sweem) {

        this.type = type;
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        count++;
    }

    public static int getCount() {
        return count;
    }
    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem +  " meters/");
    }

}
