package entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Aleksey on 19.09.2016.
 */
@Entity
@Table(name = "operation")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "type", nullable = false)
    private boolean type;

    @Column
    @NotEmpty
    private String description;

    @Column
    @NotNull
    private LocalDate date;

    @Column
    @NotEmpty
    private BigDecimal sum;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public Operation(boolean type, String description, LocalDate date, BigDecimal sum, Account account, Category category) {
        this.type = type;
        this.description = description;
        this.date = date;
        this.sum = sum;
        this.account = account;
        this.category = category;
    }

    public Operation() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Record{" +
                "account=" + account.getName() +
                ", category=" + category +
                ", type=" + (type ? "Income" : "Expense") +
                ", description='" + description + '\'' +
                ", sum=" + sum +
                ", date=" + date +
                '}';
    }
}
