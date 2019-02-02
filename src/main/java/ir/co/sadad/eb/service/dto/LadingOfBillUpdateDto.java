package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;

@Schema(name = "LadingOfBillUpdateDto", description = "به روز رسانی بارنامه برای تعیین سهم")
public class LadingOfBillUpdateDto implements Serializable {

    @Schema(required = true,example = "1",description = "شماره بارنامه")
    private String ladingBillNo;
    @Schema(required = true, example = "111/2626", description = "سریال بارنامه")
    private String ladingBillSerial;
    @Schema(required = true,example = "156000.5", description = "سهم راننده")
    private Double driverContribution;
    @Schema(required = true,example = "100000.5", description = "سهم شرکت حمل")
    private Double shippingCompanyContribution;

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
