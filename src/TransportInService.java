public abstract class TransportInService implements ServiceTransport{

    private String transportModel;
    private int wheelsCount;

    public String getTransportModel() {
        return transportModel;
    }

    public void setTransportModel(String transportModel) {
        this.transportModel = transportModel;
    }

    public int getWheelCount() {
        return wheelsCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelsCount = wheelCount;
    }

    public TransportInService(String transportModel, int wheelCount) {
        this.transportModel = transportModel;
        this.wheelsCount = wheelCount;
    }

    void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void changeTire() {
        System.out.println("Обслуживаем " + getTransportModel());
        int tireCounter = 0;
        for (int i = 0; i < getWheelCount(); i++) {
            tireCounter = i + 1;
        }
        System.out.println( "Меняем " + tireCounter + " покрышек");
    }

}
