package Prototype;

public class Cup extends Smth {

    public Cup(int size){
        super(size);
        if (this.size < 33)
            System.out.println("This is small-sized cup");
        else if (this.size < 66)
            System.out.println("This is medium-sized cup");
        else
            System.out.println("This is large-sized cup");
    }

    public Cup(Cup target){
        super(target);
        if (this.size < 33)
            System.out.println("This is copy of small-sized cup");
        else if (this.size < 66)
            System.out.println("This is copy of medium-sized cup");
        else
            System.out.println("This is copy of large-sized cup");
    }

    @Override
    public Smth clone() {
        return new Cup(this);
    }
}
