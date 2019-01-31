package ir.co.sadad.eb.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

//محموله
@Entity
@Table(name = "CARGO" ,schema = "PUSH")
public class Cargo {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    //نام محموله
    @Column(name = "NAME")
    private String name;

    //وزن محموله
//    private String cargoWeight;

    //  وزن خروج از مبدا
    @Column(name = "WEIGHT_OF_DEPARTURE")
    private Double weightOfDeparture;

    //  وزن ورود به مقصد
    @Column(name = "WEIGHT_OF_LOAD")
    private Double weightOfLoad;

    // todo should change to enum
    //واحد اندازه گیری
    @Column(name = "CARGO_UNIT")
    private String cargoUnit;

    //نوع بسته بندی
    @Column(name = "PACKAGE_TYPE")
    private String packageType;

    //تعداد بسته
    @Column(name = "PACKAGE_COUNT")
    private Integer packageCount;

    //ارزش محموله
    @Column(name = "VALUE_OF_CARGO")
    private Double valueOfCargo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
