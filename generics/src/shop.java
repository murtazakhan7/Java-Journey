public class shop<T,U> {

    T item;

    public T getItem() {
        return this.item;
    }

    public U getPrice() {
        return this.price;
    }

    U price;
    shop(T item,U price){
        this.item = item;
        this.price =price;
    }

}
