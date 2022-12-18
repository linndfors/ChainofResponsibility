package atm;

public class Handler50 extends Handler{
    @Override
    public void process(int price) {
        Handler next = getNext();
        if (price % 50 > 0 && next == null) {
            System.out.println("Invalid operation");
            throw new IllegalArgumentException();
        }
        else if (next != null) {
            next.process(price % 50);
            if (price / 50 != 0) {
                System.out.println(price / 50 + " * 50");
            }
        }
    }
}
