insert into customer(id, name) values (1000, 'Julia');
insert into customer(id, name) values (1001, 'Alex');
insert into customer(id, name) values (1002, 'Sri');

insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1001, 'transaction 1', 100, '2023-01-1 08:10:10', 1000);
insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1002, 'transaction 2', 50, '2023-01-17 11:20:10', 1000);
insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1003, 'transaction 3', 120, '2023-02-10 09:21:10', 1000);
insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1004, 'transaction 10', 185.29, '2023-02-12 10:25:10', 1000);


insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1101, 'transaction 100', 24.70, '2023-03-01 11:20:10', 1001);
insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1201, 'transaction 101', 79.50, '2023-03-05 19:00:10', 1001);
insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1202, 'transaction 202', 112.14, '2023-03-10 12:31:10', 1001);
insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1005, 'transaction 205', 64.90, '2023-03-11 18:20:10', 1001);
insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1006, 'transaction 206', 219.50, '2023-04-03 14:21:10', 1001);
insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1009, 'transaction 310', 43, '2023-04-18 17:10:10', 1001);

insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1008, 'transaction 5', 201, '2023-04-21 10:20:10', 1002);
insert into CUSTOMER_TRANSACTION(id, comment, total, transaction_date, customer_id) values (1010, 'transaction 310', 149, '2023-04-22 17:10:10', 1002);