public class Counter {
    int count;

    public int increment(){
        this.count++;
        return this.count;
    }

    public int decremant(){
        this.count--;
        return this.count;
    }

    public int getCount() {
        return count;
    }

}

