public class Truck extends TransportInService {


    public Truck(String transportModel, int wheelCount) {
        super(transportModel, wheelCount);
    }
    void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.changeTire();
        checkEngine();
        checkTrailer();
    }
}
