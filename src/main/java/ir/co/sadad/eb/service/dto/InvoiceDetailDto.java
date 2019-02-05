package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "InvoiceDetailDto", description = "جزئیات صورتحساب")
public class InvoiceDetailDto {
    @Schema(example = "0", description = "شناسه" )
    private Long id;
    @Schema(required = true ,example = "254854210", description = "کد پیگیری بارنامه" )
    private String trackingCode;
    @Schema(required = true ,example = "156322.5", description = "مبلغ نهایی بارنامه پس از کسورات" )
    private Double finalAmount;
    @Schema(required = true, description = "مبالغ مالی بارنامه" )
    private FinancialAmountsDto financialAmounts;

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

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public FinancialAmountsDto getFinancialAmounts() {
        return financialAmounts;
    }

    public void setFinancialAmounts(FinancialAmountsDto financialAmounts) {
        this.financialAmounts = financialAmounts;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }
}
