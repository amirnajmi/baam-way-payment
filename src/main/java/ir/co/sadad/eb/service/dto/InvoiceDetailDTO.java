package ir.co.sadad.eb.service.dto;

//todo don't use lombok in dtos


public class InvoiceDetailDTO {

    private Integer id;
    //     شماره ورود
    private String loadCode;
    //     شماره خروح
    private String departureCode;
    //    نام وسیله حمل کننده اولیه بار(کشتی)
    private String sourceVehicleName;
    //    انبار مبدا
    private String sourceStoreHouse;
    //    انبار مقصد
    private String destinationStoreHouse;
    //    کد استان مبدا
    private String sourceProvinceCode;
    //    کد استان مقصد
    private String destinationProvinceCode;
    //    عوارض
    private Double receipt;
    //    پلاک یا شماره وسیله نقلیه حامل
    private String vehicleTag;
    //    شماره بارنامه
    private String wayBillCode;
    //  وزن خروج از مبدا
    private Double departureWeight;
    //  وزن ورود به مقصد
    private Double loadWeight;
    //  کسری مجاز
    private Double allowedDeficit;
    // کسری غیرمجاز
    private Double illegalDeficit;
    //  نرخ کرایه حمل
    private Double carriageRate;
    //  کرایه حمل
    private Double carriageFare;
    //  حق مدیریت
    private Double managerSalary ;
    // حق بیمه
    private Double premium;
    // مقدار غرامت دستی :|
    private Double amountOfHandyIndemnity;
    // مبلغ غرامت دستی :|
    private Double feeOfHandyIndemnity;
    // مقدار غرامت نرسیده :|
    private Double amountOfNotArrivedIndemnity;
    // مبلغ غرامت نرسیده :|
    private Double feeOfNotArrivedIndemnity;
    // مسافت
    private Double distance ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoadCode() {
        return loadCode;
    }

    public void setLoadCode(String loadCode) {
        this.loadCode = loadCode;
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public void setDepartureCode(String departureCode) {
        this.departureCode = departureCode;
    }

    public String getSourceVehicleName() {
        return sourceVehicleName;
    }

    public void setSourceVehicleName(String sourceVehicleName) {
        this.sourceVehicleName = sourceVehicleName;
    }

    public String getSourceStoreHouse() {
        return sourceStoreHouse;
    }

    public void setSourceStoreHouse(String sourceStoreHouse) {
        this.sourceStoreHouse = sourceStoreHouse;
    }

    public String getDestinationStoreHouse() {
        return destinationStoreHouse;
    }

    public void setDestinationStoreHouse(String destinationStoreHouse) {
        this.destinationStoreHouse = destinationStoreHouse;
    }

    public String getSourceProvinceCode() {
        return sourceProvinceCode;
    }

    public void setSourceProvinceCode(String sourceProvinceCode) {
        this.sourceProvinceCode = sourceProvinceCode;
    }

    public String getDestinationProvinceCode() {
        return destinationProvinceCode;
    }

    public void setDestinationProvinceCode(String destinationProvinceCode) {
        this.destinationProvinceCode = destinationProvinceCode;
    }

    public Double getReceipt() {
        return receipt;
    }

    public void setReceipt(Double receipt) {
        this.receipt = receipt;
    }

    public String getVehicleTag() {
        return vehicleTag;
    }

    public void setVehicleTag(String vehicleTag) {
        this.vehicleTag = vehicleTag;
    }

    public String getWayBillCode() {
        return wayBillCode;
    }

    public void setWayBillCode(String wayBillCode) {
        this.wayBillCode = wayBillCode;
    }

    public Double getDepartureWeight() {
        return departureWeight;
    }

    public void setDepartureWeight(Double departureWeight) {
        this.departureWeight = departureWeight;
    }

    public Double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(Double loadWeight) {
        this.loadWeight = loadWeight;
    }

    public Double getAllowedDeficit() {
        return allowedDeficit;
    }

    public void setAllowedDeficit(Double allowedDeficit) {
        this.allowedDeficit = allowedDeficit;
    }

    public Double getIllegalDeficit() {
        return illegalDeficit;
    }

    public void setIllegalDeficit(Double illegalDeficit) {
        this.illegalDeficit = illegalDeficit;
    }

    public Double getCarriageRate() {
        return carriageRate;
    }

    public void setCarriageRate(Double carriageRate) {
        this.carriageRate = carriageRate;
    }

    public Double getCarriageFare() {
        return carriageFare;
    }

    public void setCarriageFare(Double carriageFare) {
        this.carriageFare = carriageFare;
    }

    public Double getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(Double managerSalary) {
        this.managerSalary = managerSalary;
    }

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }

    public Double getAmountOfHandyIndemnity() {
        return amountOfHandyIndemnity;
    }

    public void setAmountOfHandyIndemnity(Double amountOfHandyIndemnity) {
        this.amountOfHandyIndemnity = amountOfHandyIndemnity;
    }

    public Double getFeeOfHandyIndemnity() {
        return feeOfHandyIndemnity;
    }

    public void setFeeOfHandyIndemnity(Double feeOfHandyIndemnity) {
        this.feeOfHandyIndemnity = feeOfHandyIndemnity;
    }

    public Double getAmountOfNotArrivedIndemnity() {
        return amountOfNotArrivedIndemnity;
    }

    public void setAmountOfNotArrivedIndemnity(Double amountOfNotArrivedIndemnity) {
        this.amountOfNotArrivedIndemnity = amountOfNotArrivedIndemnity;
    }

    public Double getFeeOfNotArrivedIndemnity() {
        return feeOfNotArrivedIndemnity;
    }

    public void setFeeOfNotArrivedIndemnity(Double feeOfNotArrivedIndemnity) {
        this.feeOfNotArrivedIndemnity = feeOfNotArrivedIndemnity;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
