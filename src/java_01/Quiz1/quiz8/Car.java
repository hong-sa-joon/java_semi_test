package java_01.Quiz1.quiz8;

public class Car {
    private String company;  // 회사명
    private String model;    // 모델명
    private double maxSpeed; // 최고속도
    private Tire tire;       // 타이어

    public Car(String company,String model,double maxSpeed){
        this.company=company;
        this.maxSpeed=maxSpeed;
        this.model=model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
