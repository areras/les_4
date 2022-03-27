package les_4;

abstract class Animal {
    protected int maxrun;
    protected int maxswim;

    public Animal(int maxrun, int maxswim) {
        this.maxrun = maxrun;
        this.maxswim = maxswim;
    }
    public void run(int runlength){
        if (runlength<=maxrun){
            System.out.println("Животное пробежало " + runlength +"м");
        } else {
            System.out.println("Животное не может столько пробежать");
        }
    }
    public void swim(int swimlength){
        if (swimlength<=maxswim){
            System.out.println("Животное проплыло " + swimlength + "м");
        } else {
            System.out.println("Животное не может столько проплыть");
        }
    }

}

class Cats extends Animal {
    public Cats (int maxrun, int maxswim){
        super(maxrun, maxswim);
    }
}
class CatAna extends Cats {
    public CatAna (int maxrun, int maxswim) {
        super(maxrun, maxswim);
    }
}

class Dogs extends Animal {
    public Dogs (int maxrun, int maxswim){
        super(maxrun, maxswim);
    }
}
class DogBob extends Dogs {
    public DogBob (int maxrun, int maxswim) {
        super(maxrun, maxswim);
    }
}

