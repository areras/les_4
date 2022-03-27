package les_4;

class Cat {
    private String name;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
    public void satiety (Plate p) {
        System.out.print(name+" ");
        p.fill(appetite);
    }
}

class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int amount) {
        if (amount<=food){
            food -= amount;
            System.out.println("Сытый");
        } else {
            System.out.println("Не сможет есть, ему мало");
        }
    }
    public boolean fill (int amount) {
        if (amount<=food){
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("Колличество еды: " + food);
    }
    public void setFood(int newfood){
        System.out.println("Добавим в миску " + newfood);
        food += newfood;
    }

}


