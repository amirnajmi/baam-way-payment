package ir.co.sadad.eb.service.dto;

public class LadingOfBillUpdateDto {
    //شماره بارنامه
    private String ladingBillNo;
    //سریال بارنامه
    private String ladingBillSerial;
    //سهم راننده
    private Double driverContribution ;
    //سهم شرکت حمل
    private Double shippingCompanyContribution ;

    public String getLadingBillNo() {
        return ladingBillNo;
    }

    public void setLadingBillNo(String ladingBillNo) {
        this.ladingBillNo = ladingBillNo;
    }

    public String getLadingBillSerial() {
        return ladingBillSerial;
    }

    public void setLadingBillSerial(String ladingBillSerial) {
        this.ladingBillSerial = ladingBillSerial;
    }

    public Double getDriverContribution() {
        return driverContribution;
    }

    public void setDriverContribution(Double driverContribution) {
        this.driverContribution = driverContribution;
    }

    public Double getShippingCompanyContribution() {
        return shippingCompanyContribution;
    }

    public void setShippingCompanyContribution(Double shippingCompanyContribution) {
        this.shippingCompanyContribution = shippingCompanyContribution;
    }
}
