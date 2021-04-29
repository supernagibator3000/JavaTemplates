package Prototype;

public abstract class Smth {
    public int size;

    public Smth(int size){
        this.size = size;
    }

    public Smth(Smth target){
        if (target != null){
            this.size = target.size;
        }
    }

    public abstract Smth clone();
}
