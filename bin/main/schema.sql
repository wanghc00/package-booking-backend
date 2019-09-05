CREATE TABLE packageStorage (
  billNo VARCHAR(32) PRIMARY KEY,
  receivePerson VARCHAR(64) NOT NULL,
  telephone VARCHAR(20) NOT NULL,
  packageWeight VARCHAR(20) NOT NULL
);

CREATE TABLE subscribePackage (
  billNo VARCHAR(32) PRIMARY KEY,
  subscribeTime VARCHAR(32) NOT NULL
);

CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);


insert into packageStorage values ('12345678','zhangsan01','123456778','2.3kg');
insert into packageStorage values ('13572468','zhangsan02','123456778','2.3kg');

insert into subscribePackage values ('13572468','2019-09-09t00000');