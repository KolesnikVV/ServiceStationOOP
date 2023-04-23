public class Car extends TransportInService {


    public Car(String transportModel, int wheelCount) {
        super(transportModel, wheelCount);
    }
    void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.changeTire();
        checkEngine();

    }
}
