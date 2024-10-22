package litec;

public class Car {
    private String name;
    private double kmTotal;

    public Car(String name, double kmTotal){
        this.name = name;
        this.kmTotal = kmTotal;
    }

    public void drive(double km){
        kmTotal += km;
    }


    public String getName() {
        return name;
    }
    public double getKmTotal(){
        return kmTotal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKmTotal(double kmTotal) {
        this.kmTotal = kmTotal;
    }
}
