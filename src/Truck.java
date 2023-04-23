public class Truck extends TransportInService {


    public Truck(String transportModel, int wheelCount) {
        super(transportModel, wheelCount);
    }

    @Override
    public void service() {
        super.checkEngine();
        super.checkTrailer();
        super.changeTire();
    }
}
