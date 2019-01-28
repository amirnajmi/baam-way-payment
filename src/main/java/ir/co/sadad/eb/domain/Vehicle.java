package ir.co.sadad.eb.domain;

import javax.persistence.*;

@Entity
@Table(name = "Transport" ,schema = "TEST")
public class Vehicle {

    @Id
    @Column(name = "TRANSPORT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transportID;

    @Column(name = "TRANSPORT_NAME" , length=50, nullable=false)
    private String transportName;

    //carTagNumber & carTagSeries
    @Column(name = "CAR_PLATE_NO" , length=20, nullable=false)
    private String carPlateNo;

    //vehicleType
    @Column(name = "CAR_TYPE" , length=50, nullable=false)
    private String carType;

    public int getTransportID() {
        return transportID;
    }

    public void setTransportID(int transportID) {
        this.transportID = transportID;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getCarPlateNo() {
        return carPlateNo;
    }

    public void setCarPlateNo(String carPlateNo) {
        this.carPlateNo = carPlateNo;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}

