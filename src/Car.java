public class Car extends TransportInService {


    public Car(String transportModel, int wheelCount) {
        super(transportModel, wheelCount);
    }

    @Override
    public void service() {
        super.changeTire();
        super.checkEngine();
    }
}
