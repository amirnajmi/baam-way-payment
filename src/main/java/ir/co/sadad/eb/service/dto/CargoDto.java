package ir.co.sadad.eb.service.dto;

import java.io.Serializable;

//todo don't use lombok in dtos

public class CargoDto implements Serializable {


    private Long id ;
    //نام محموله
    private String cargoName;
    //  وزن خروج از مبدا
    private Double weightOfDeparture;
    //  وزن ورود به مقصد
    private Double weightOfLoad;
    //وزن محموله
//    private String cargoWeight;
    // todo should change to enum
    //واحد اندازه گیری
    private String cargoUnit;
    //نوع بسته بندی
    private String packageType;
    //تعداد بسته
    private Integer packageCount;
    //ارزش محموله
    private Double valueOfCargo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public String getCargoUnit() {
        return cargoUnit;
    }

    public void setCargoUnit(String cargoUnit) {
        this.cargoUnit = cargoUnit;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Integer getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    public Double getValueOfCargo() {
        return valueOfCargo;
    }

    public void setValueOfCargo(Double valueOfCargo) {
        this.valueOfCargo = valueOfCargo;
    }

    public Double getWeightOfDeparture() {
        return weightOfDeparture;
    }

    public void setWeightOfDeparture(Double weightOfDeparture) {
        this.weightOfDeparture = weightOfDeparture;
    }

    public Double getWeightOfLoad() {
        return weightOfLoad;
    }

    public void setWeightOfLoad(Double weightOfLoad) {
        this.weightOfLoad = weightOfLoad;
    }
}
