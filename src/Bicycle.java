public class Bicycle extends TransportInService {


    public Bicycle(String transportModel, int wheelCount) {
        super(transportModel, wheelCount);
    }

    @Override
    public void service() {
        super.changeTire();
    }
}
