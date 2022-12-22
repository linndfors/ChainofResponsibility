package atm;

public class Handler20 extends Handler{
    @Override
    public void process(int price) {
        Handler next = getNext();
        if (price % 20 > 0 && next == null) {
            System.out.println("Invalid operation");
            throw new IllegalArgumentException();
        }
        else if (next != null) {
            next.process(price % 20);
            if (price / 20 != 0) {
                System.out.println(price / 20 + " * 20");
            }
        }
    }
}
