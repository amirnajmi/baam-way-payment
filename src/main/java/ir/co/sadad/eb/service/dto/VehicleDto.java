package ir.co.sadad.eb.service.dto;

import java.io.Serializable;

public class VehicleDto implements Serializable {
    private Long id;
    private String name;
    private String tag;
    private String tagSeries;
    private String type;

    public VehicleDto() {
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
