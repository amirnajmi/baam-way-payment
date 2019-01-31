package ir.co.sadad.eb.service.dto;


//todo don't use lombok in dtos

import ir.co.sadad.eb.domain.Vehicle;

import java.io.Serializable;

public class DriverDto implements Serializable {

    private Long id;
    private String name;
    private String nationalCode;
    private String smartCardNo;
    // todo change to enum
    private String kind;
    private String tell;
    private AccountDto account;
    private String licenceNo;
    private String address ;

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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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
}
