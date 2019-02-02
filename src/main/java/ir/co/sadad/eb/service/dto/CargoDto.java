package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;


@Schema(name = "CargoDto", description = "محموله")
public class CargoDto implements Serializable {

    @Schema(example = "0", description = "شناسه" )
    private Long id ;
    @Schema(required = true ,example = "1", description = "نام محموله" )
    private String name;
    @Schema(required = true ,example = "1", description = "وزن خروج از مبدا" )
    private Double weightOfDeparture;
    @Schema(required = true ,example = "1", description = "وزن ورود به مقصد" )
    private Double weightOfLoad;
    //وزن محموله
//    private String cargoWeight;
    // todo should change to enum
    //
    @Schema(example = "1", description = "واحد اندازه گیری" )
    private String unit;
    @Schema(example = "1", description = "نوع بسته بندی" )
    private String packageType;
    @Schema(required = true ,example = "1", description = "تعداد بسته" )
    private Integer packageCount;
    @Schema(required = true ,example = "1", description = "ارزش محموله" )
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
