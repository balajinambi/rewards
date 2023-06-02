package com.example.rewards.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
public class CustomerTransaction extends Reward {
    @Id
    @GeneratedValue
    private Long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private Double total;
    private Date transactionDate;
    private String comment;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerTransaction that = (CustomerTransaction) o;
        return Objects.equals(id, that.id) && Objects.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer);
    }

    @Override
    public Long getTransactionPoint() {
        this.points = 0l;

        if (this.total > 50 && this.total <= 100) {
            this.points += (this.total.intValue() - 50) * 1;
        }
        if (this.total > 100) {
            this.points += 50;
            this.points += (this.total.intValue() - 100) * 2;
        }

        return this.points;
    }
}
