package models;

public class Customer extends PersonFurama {
    private String adress;
    String custommerType;

    public Customer(String adress, String custommerType) {
        this.adress = adress;
        this.custommerType = custommerType;
    }

    public Customer(String id, String name, String birthDay, String gender, String cmnd, String phone, String email, String adress, String custommerType) {
        super(id, name, birthDay, gender, cmnd, phone, email);
        this.adress = adress;
        this.custommerType = custommerType;
    }


    public Customer() {
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCustommerType() {
        return custommerType;
    }

    public void setCustommerType(String custommerType) {
        this.custommerType = custommerType;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.custommerType + "," + this.adress;
    }
}
