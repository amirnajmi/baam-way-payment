package ir.co.sadad.eb.service.dto;

import org.joda.time.LocalDate;

public class LadingBillStatusHistoryDto {

    private Long id;
    private String description;
    private LocalDate date;
    private LadingOfBillDto ladingOfBillDto;
    private LadingBillStatusDto ladingBillStatusDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LadingBillStatusDto getLadingBillStatusDto() {
        return ladingBillStatusDto;
    }

    public void setLadingBillStatusDto(LadingBillStatusDto ladingBillStatusDto) {
        this.ladingBillStatusDto = ladingBillStatusDto;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LadingOfBillDto getLadingOfBillDto() {
        return ladingOfBillDto;
    }

    public void setLadingOfBillDto(LadingOfBillDto ladingOfBillDto) {
        this.ladingOfBillDto = ladingOfBillDto;
    }
}
