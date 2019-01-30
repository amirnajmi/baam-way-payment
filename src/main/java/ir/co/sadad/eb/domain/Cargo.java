package ir.co.sadad.eb.domain;

import javax.persistence.*;
import java.io.Serializable;

//محموله
@Entity
@Table(name = "CARGO" , schema = "PUSH")
public class Cargo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    //نام محموله
    private String cargoName;
    //وزن محموله
//    private String cargoWeight;
    //  وزن خروج از مبدا
    private Double weightOfDeparture;
    //  وزن ورود به مقصد
    private Double weightOfLoad;
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
