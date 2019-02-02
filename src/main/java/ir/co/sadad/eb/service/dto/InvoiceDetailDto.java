package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

//todo don't use lombok in dtos
@Schema(name = "InvoiceDetailDto", description = "جزئیات صورتحساب")
public class InvoiceDetailDto {
    @Schema(example = "0", description = "شناسه" )
    private Long id;
    @Schema(required = true ,example = "45487/411", description = "سری بارنامه" )
    private String ladingOfBillSeries;
    @Schema(required = true ,example = "65897", description = "شماره بارنامه" )
    private String ladingOfBillCode;
    @Schema(required = true ,example = "156322.5", description = "مبلغ نهایی بارنامه پس از کسورات" )
    private Double finalAmount;


    //     شماره ورود
//    private String loadCode;
    //     شماره خروح
//    private String departureCode;
//        نام وسیله حمل کننده اولیه بار(کشتی)
//    private String sourceVehicleName;
    //    انبار مبدا
//    private String sourceStoreHouse;
    //    انبار مقصد
//    private String destinationStoreHouse;
    //    کد استان مبدا
//    private String sourceProvinceCode;
    //    کد استان مقصد
//    private String destinationProvinceCode;
    //    عوارض
//    private Double receipt;
    //    پلاک یا شماره وسیله نقلیه حامل
//    private String vehicleTag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLadingOfBillSeries() {
        return ladingOfBillSeries;
    }

    public void setLadingOfBillSeries(String ladingOfBillSeries) {
        this.ladingOfBillSeries = ladingOfBillSeries;
    }

    public String getLadingOfBillCode() {
        return ladingOfBillCode;
    }

    public void setLadingOfBillCode(String ladingOfBillCode) {
        this.ladingOfBillCode = ladingOfBillCode;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }
}
