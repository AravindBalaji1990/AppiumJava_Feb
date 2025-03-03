package genericsdemo;

// T represents the data type
public class Box<X> {
    private X item;

    public Box(X item){
        this.item = item;
    }

    public X getItem(){
        return item;
    }

}
