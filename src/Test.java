public class Test {
    public static void main(String[] args) {
        Steel st1 = new Steel();
        Sword<Steel> sw1 = new Sword<>(st1);
        Iron iron = new Iron();
        Sword<Iron> sw2= new Sword<>(iron);
        System.out.println(sw2.durableOrNot());
        System.out.println(sw1.durableOrNot());
    }

}




