public class Sword <T extends Metal>{
    public T getItem() {
        return item;
    }

    T item;

    public Sword(T item) {
        this.item = item;
    }
    public boolean durableOrNot() {
        return this.item.Endurance > 49;
    }
}
