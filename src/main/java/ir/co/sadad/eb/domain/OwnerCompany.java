package ir.co.sadad.eb.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class OwnerCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ownerCompanyId;

    private String name;

    private String legalNo;
}
