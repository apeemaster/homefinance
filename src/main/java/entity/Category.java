package entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by Aleksey on 19.09.2016.
 */
@Entity
@Table(name = "category")
public class Category {


    public enum IncomeCategories {
        SALARY("Salary"),
        BUSINESS("Business"),
        OTHER("Other incomes");

        private final String text;

        /**
         * @param text
         */
        private IncomeCategories(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    public enum ExpenseCategories {
        FOOD("Food"),
        CLOTHES("Clothes"),
        ACCOMMODATION("Housing"),
        TRANSPORT("Transport"),
        EDUCATION("Education"),
        ENTERTAINMENT("Entertainment"),
        MEDICAL("Medical expanses"),
        SOCIAL("Social expanses"),
        BILLS("Bill payments"),
        OTHER("Other expanses");

        private final String text;

        /**
         * @param text
         */
        private ExpenseCategories(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    @NotEmpty
    private String name;

    @Column(name = "type", nullable = false)
    private boolean type;

    @Column(name = "priority", nullable = false)
    private Integer priority;

    public Category() {
    }

    public Category(Category category) {
        this(category.id, category.name, category.type);
    }

    public Category(long id, String name, boolean type) {
        super(id);
        this.name = name;
        this.type = type;
    }

    public Category(long id, String name, boolean type, Integer priority) {
        super(id);
        this.name = name;
        this.type = type;
        this.priority = priority;
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

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name;
    }
}

