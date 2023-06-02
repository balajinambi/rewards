package com.example.rewards.model;

public abstract class Reward {
    protected Long points;
    abstract Long getTransactionPoint();
}
