package ir.co.sadad.eb.service.dto;


//todo don't use lombok in dtos

import ir.co.sadad.eb.domain.Vehicle;

import java.io.Serializable;

public class DriverDto implements Serializable {

    private int driverID;
    private String driverName;
    private String nationalCode;
    private String smartCardNo;
    // todo change to enum
    private String driverKind;
    private String tell;
    private AccountDto accountDto;
    private Vehicle vehicle;

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getSmartCardNo() {
        return smartCardNo;
    }

    public void setSmartCardNo(String smartCardNo) {
        this.smartCardNo = smartCardNo;
    }

    public String getDriverKind() {
        return driverKind;
    }

    public void setDriverKind(String driverKind) {
        this.driverKind = driverKind;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
