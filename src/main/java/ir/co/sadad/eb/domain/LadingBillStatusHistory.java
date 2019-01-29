package ir.co.sadad.eb.domain;

import lombok.Data;
import org.joda.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "LADING_BILL_STATUS_HISTORY", schema = "TEST")
@Data
public class LadingBillStatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(targetEntity = LadingOfBill.class)
    @JoinColumn(name = "LADING_OF_BILL_ID", referencedColumnName = "ID")
    private LadingOfBill ladingOfBill;

    @Column(name = "LADING_BILL_STATUS")
    @Enumerated(EnumType.STRING)
    private LadingBillStatus ladingBillStatus;

    @Basic
    @Column(name = "DESCRIPTION")
    private String description;

    @Basic
    @Column(name = "DATE")
    private LocalDate date;
}
