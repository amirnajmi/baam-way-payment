package ir.co.sadad.eb.domain;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE" ,schema = "PUSH")
public class Vehicle {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME" , length=50, nullable=false)
    private String name;

    //پلاک ماشین
    @Column(name = "TAG" , length=20, nullable=false)
    private String tag;

    //سری ماشین
    @Column(name = "TAG_SERIES" , length=20, nullable=false)
    private String tagSeries;

    //نوع ماشین
    @Column(name = "TYPE" , length=50, nullable=false)
    private String type;

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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTagSeries() {
        return tagSeries;
    }

    public void setTagSeries(String tagSeries) {
        this.tagSeries = tagSeries;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

