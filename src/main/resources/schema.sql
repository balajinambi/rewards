CREATE TABLE IF NOT EXISTS customer (
    id BIGINT NOT NULL,
    name varchar(50),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS CUSTOMER_TRANSACTION (
    id BIGINT NOT NULL,
    comment varchar(50),
    total float,
    transaction_date TIMESTAMP,
    customer_id bigint,
    PRIMARY KEY (id)
);
