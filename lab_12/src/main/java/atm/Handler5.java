package atm;

public class Handler5 extends Handler{
    @Override
    public void process(int price) {
        Handler next = getNext();
        if (price % 5 > 0 && next == null) {
            System.out.println("Invalid operation");
            throw new IllegalArgumentException();
        }
        else {
            if (price / 5 != 0) {
                System.out.println(price / 5 + " * 5");
            }
        }
    }
}
