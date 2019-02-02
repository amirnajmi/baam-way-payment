package ir.co.sadad.eb.service.dto;


//todo don't use lombok in dtos

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;

@Schema(name = "DriverDto", description = "راننده")
public class DriverDto implements Serializable {
    @Schema(example = "0", description = "شناسه" )
    private Long id;
    @Schema(required = true ,example = "عباس", description = "نام راننده" )
    private String name;
    @Schema(required = true ,example = "1", description = "کد ملی" )
    private String nationalCode;
    @Schema(required = true ,example = "1", description = "شماره هوشمند راننده" )
    private String smartCardNo;
    // todo change to enum
    @Schema(required = true ,example = "1", description = "نوع راننده از نظر استخدام" )
    private String kind;
    @Schema(required = true ,example = "1", description = "شماره موبایل" )
    private String tell;
    @Schema(required = true , description = "اطلاعات حساب" )
    private AccountDto account;
    @Schema(required = true ,example = "77705058069", description = "شماره گواهینامه" )
    private String licenceNo;
    @Schema(required = true , description = "آدرس" )
    private String address;

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

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public AccountDto getAccount() {
        return account;
    }

    public void setAccount(AccountDto account) {
        this.account = account;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
