package ir.co.sadad.eb.domain.metamodel;

import ir.co.sadad.eb.domain.Status;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Status.class)
public class Status_ {

    public static volatile SingularAttribute<Status,Short> statusCode;
    public static volatile SingularAttribute<Status,String> title;

}
