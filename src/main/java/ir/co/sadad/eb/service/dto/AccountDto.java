package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;


//todo don't use lombok in dtos

@Schema(name = "AccountDto", description = "Pojo that represent a AccountDto object")
public class AccountDto implements Serializable {

    @Schema(example = "0", description = "شناسه" )
    private Long id ;
    //شماره حساب
    @Schema(required = true ,example = "1", description = "شماره حساب" )
    private String accountNo;
    @Schema(required = true ,example = "1", description = "نام صاحب حساب" )
    private String accountOwner;
    @Schema(required = true ,example = "1", description = "شماره شبا حساب" )
    private String iban;
    @Schema(required = true ,example = "1", description = "وضعیت حساب" )
    private Integer state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
