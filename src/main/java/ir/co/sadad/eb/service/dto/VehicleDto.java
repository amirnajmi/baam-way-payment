package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;

@Schema(name = "VehicleDto", description = "وسیله نقلیه")
public class VehicleDto implements Serializable {
    @Schema(example = "0", description = "شناسه" )
    private Long id;
    @Schema(required = true ,example = "گروه بازرگانی ایران", description = "نام وسیله نقلیه" )
    private String name;
    @Schema(required = true ,example = "12ع123", description = "پلاک" )
    private String tag;
    @Schema(required = true ,example = "99", description = "سری پلاک" )
    private String tagSeries;
    //todo must be change to ENUM
    @Schema(required = true ,example = "کفی 18 چرخ", description = "نوع تریلر" )
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
