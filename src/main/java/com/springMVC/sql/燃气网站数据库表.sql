Sql 

Drop database if exists GAS;

Create database if not exists GAS;

Use GAS;
drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   user_ID_card         varchar(40) not null,
   user_balance         double,
   user_name            varchar(40) not null,
   user_password        varchar(40),
   user_phone           varchar(13),
   primary key (user_ID_card)
);

alter table user comment ' 用户表，用来记录用户信息（身份证号，用户名，密码，燃气卡号，联系电话，账户余额）';
drop table if exists Gas_address;

/*==============================================================*/
/* Table: Gas_address                                           */
/*==============================================================*/
create table Gas_address
(
   user_ID_card         varchar(40) not null,
   user_gas_card_number varchar(40) not null,
   user_address         varchar(40),
   user_gas_burner_brand varchar(40),
   user_gas_burner_type varchar(40),
   postcode             varchar(20),
   primary key (user_gas_card_number)
);
drop table if exists Gas_address;

/*==============================================================*/
/* Table: Gas_address                                           */
/*==============================================================*/
create table Gas_address
(
   user_ID_card         varchar(40) not null,
   user_gas_card_number varchar(40) not null,
   user_address         varchar(40),
   user_gas_burner_brand varchar(40),
   user_gas_burner_type varchar(40),
   postcode             varchar(20),
   primary key (user_gas_card_number)
);
drop table if exists gas_logs;

/*==============================================================*/
/* Table: gas_logs                                              */
/*==============================================================*/
create table gas_logs
(
   user_gas_card_number varchar(40),
   meter_read_time      timestamp,
   read_number          varchar(40)
);
drop table if exists bill;

/*==============================================================*/
/* Table: bill                                                  */
/*==============================================================*/
create table bill
(
   user_gas_card_number varchar(40),
   meter_read_time      timestamp,
   pay_time             timestamp,
   charge_money         double,
   pay_money            double
);
drop table if exists report;

/*==============================================================*/
/* Table: report                                                */
/*==============================================================*/
create table report
(
   user_gas_card_number varchar(40),
   postcode             varchar(40),
   e_mail               varchar(40),
   report_time          timestamp,
   report_context       text,
   report_result        varchar(255),
   report_statu         int
);
drop table if exists order_table;

/*==============================================================*/
/* Table: order_table                                           */
/*==============================================================*/
create table order_table
(
   user_gas_card_number varchar(40),
   business_id          varchar(10),
   user_name            varchar(40),
   user_phone           varchar(20),
   remark               varchar(255),
   order_statu          int
);
drop table if exists business;

/*==============================================================*/
/* Table: business                                              */
/*==============================================================*/
create table business
(
   business_id          varchar(10),
   bussiness_name       varchar(20)
);

Insert into user values('320382199608181631',1000.00,'admin','123456','18652261008');
Insert into user values('320382199608181632',1000.00,'admin','123456','18652261008');
Insert into user values('320382199608181633',1000.00,'admin','123456','18652261008');
Insert into user values('320382199608181634',1000.00,'admin','123456','18652261008');
Insert into user values('320382199608181635',1000.00,'admin','123456','18652261008');
Insert into user values('320382199608181636',1000.00,'admin','123456','18652261008');
Insert into user values('320382199608181637',1000.00,'admin','123456','18652261008');
Insert into user values('320382199608181638',1000.00,'admin','123456','18652261008');
Insert into user values('320382199608181639',1000.00,'admin','123456','18652261008');


/*gas_address 插入测试数据*/
insert into Gas_address values('320382199608181631','s0001','上海外滩国贸大厦110','华帝','s01','000001');
insert into Gas_address values('320382199608181631','s0002','上海外滩国贸大厦111','老板','s02','000001');
insert into Gas_address values('320382199608181632','s0003','上海外滩国贸大厦112','西门子','f01','000001');
insert into Gas_address values('320382199608181632','s0004','上海外滩国贸大厦113','华帝','s02','000001');
insert into Gas_address values('320382199608181633','s0005','上海外滩国贸大厦114','老板','s01','000001');
insert into Gas_address values('320382199608181634','s0006','上海外滩国贸大厦115','老板','s03','000001');
insert into Gas_address values('320382199608181634','s0007','上海外滩国贸大厦116','华帝','s04','000001');
insert into Gas_address values('320382199608181634','s0008','上海外滩国贸大厦117','老板','s51','000001');
insert into Gas_address values('320382199608181635','s0009','上海外滩国贸大厦118','华帝','g01','000001');
insert into Gas_address values('320382199608181635','s0010','上海外滩国贸大厦119','西门子','s31','000001');
insert into Gas_address values('320382199608181636','s0011','上海外滩国贸大厦109','华帝','s03','000001');
insert into Gas_address values('320382199608181636','s0012','上海外滩国贸大厦108','西门子','r01','000001');



 select u.user_ID_card,u.user_balance,u.user_name,u.user_password,u.user_phone,g.user_gas_card_number,g.user_address,g.user_gas_burner_brand,g.user_gas_burner_type,g.postcode from user u join Gas_address g on u.user_ID_card=g.user_ID_card   where u.user_ID_card='320382199608181636'
