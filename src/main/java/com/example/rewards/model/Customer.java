package com.example.rewards.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy="customer", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("CustomerTransaction")
    private Set<CustomerTransaction> customerTransactions;
    @Transient
    private Integer rewardPoints;
    @Transient
    private Double totalPurchases;

    public Long getRewardPoints() {
        if (customerTransactions == null || customerTransactions.isEmpty()) return 0l;
        return customerTransactions.stream().map(x -> x.getTransactionPoint().intValue()).reduce(0, (a,b) -> a + b).longValue();
    }
    public Double getTotalPurchases() {
        if (customerTransactions == null || customerTransactions.isEmpty()) return 0d;
        return customerTransactions.stream().map(x -> x.getTotal().doubleValue()).reduce(0d, (a,b) -> a + b).doubleValue();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rewardPoints=" + getRewardPoints() +
                ", totalPurchases=" + getTotalPurchases() +
                '}';
    }
}
