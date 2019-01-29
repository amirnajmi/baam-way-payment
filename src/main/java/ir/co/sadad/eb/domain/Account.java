package ir.co.sadad.eb.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//اطلاعات حساب
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    //شماره حساب
    private String AccountNo;
    // نام صاحب حساب
    private String accountOwner;
    //شماره شبا حساب
    private String IBAN;
    //وضعیت حساب
    private Boolean state;

}
