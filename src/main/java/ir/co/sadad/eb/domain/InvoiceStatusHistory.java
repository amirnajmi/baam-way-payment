package ir.co.sadad.eb.domain;

import lombok.Data;
import org.joda.time.LocalDate;

import javax.persistence.*;

@Entity
public class InvoiceStatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(targetEntity = LadingOfBill.class)
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "ID")
    private Invoice invoice;

    @Column(name = "INVOICE_STATUS")
    @Enumerated(EnumType.STRING)
    private InvoiceStatus invoiceStatus;

    @Basic
    @Column(name = "DESCRIPTION")
    private String description;

    @Basic
    @Column(name = "DATE")
    private LocalDate date;

}
