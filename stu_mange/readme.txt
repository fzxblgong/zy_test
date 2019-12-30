--搭建步骤：https://www.cnblogs.com/xyfer1018/p/11456697.html
--SQL建表语句
CREATE TABLE `user` (
    `id` INT (50) NOT NULL,
    `name` VARCHAR (100) NOT NULL,
    `age` INT (50) NOT NULL,
    `address` VARCHAR (200) NOT NULL,
    PRIMARY KEY (`id`)
);
--插入数据
INSERT INTO USER (id,name,age,address)VALUES(1,'小谢',18,'上海市');
INSERT INTO USER (id,name,age,address)VALUES(2,'小尚',18,'上海市');
INSERT INTO USER (id,name,age,address)VALUES(3,'小楠',18,'天津市');
INSERT INTO USER (id,name,age,address)VALUES(4,'小勋',18,'郑州市');
INSERT INTO USER (id,name,age,address)VALUES(5,'小乔',18,'郑州市');
INSERT INTO USER (id,name,age,address)VALUES(6,'小威',18,'郑州市');
INSERT INTO USER (id,name,age,address)VALUES(7,'小欢',18,'武汉市');