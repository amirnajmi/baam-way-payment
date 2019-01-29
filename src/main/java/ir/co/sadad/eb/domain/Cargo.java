package ir.co.sadad.eb.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

//محموله
@Entity
@Data
public class Cargo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    //نام محموله
    private String cargoName;
    //وزن محموله
    private String cargoWeight;
    // todo should change to enum
    //واحد اندازه گیری
    private String cargoUnit;
    //نوع بسته بندی
    private String packageType;
    //تعداد بسته
    private Integer packageCount;
    //ارزش محموله
    private Double valueOfCargo;

}
