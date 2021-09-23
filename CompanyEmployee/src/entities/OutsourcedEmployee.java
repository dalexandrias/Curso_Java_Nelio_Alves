package entities;

public class OutsourcedEmployee extends Employee{
    private Double additionalChange;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalChange) {
        super(name, hours, valuePerHour);
        this.additionalChange = additionalChange;
    }

    public Double getAdditionalChange() {
        return additionalChange;
    }

    public void setAdditionalChange(Double additionalChange) {
        this.additionalChange = additionalChange;
    }

    @Override
    public double payment(){
        return super.payment() + additionalChange * 1.1;
    }
}
