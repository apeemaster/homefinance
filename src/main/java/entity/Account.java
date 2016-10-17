package entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by Aleksey on 19.09.2016.
 */
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    @NotEmpty
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column
    @NotEmpty
    private BigDecimal balance;

    @Column
    @NotEmpty
    @OneToOne(mappedBy = "account")
    private Currency currency;

    @OneToMany(mappedBy = "account")
    private Collection<Operation> operations;

    public Account(String name, User user, BigDecimal balance, Currency currency, Collection<Operation> operations) {
        this.name = name;
        this.user = user;
        this.balance = balance;
        this.currency = currency;
        this.operations = operations;
    }

    public Account() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Collection<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Collection<Operation> operations) {
        this.operations = operations;
    }
    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", user name=" + user.getUsername() +
                ", currency=" + currency.getName() +
                '}';
    }
}
