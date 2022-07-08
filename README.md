# SpringCore20220617
巨匠東認 SpringCore 20220617
<pre>
-- 建立 Emp 資料表
create table if not exists emp (
	eid int not null auto_increment, -- 主鍵
	ename varchar(30) not null unique, -- 員工姓名
	age int, -- 員工年齡
	createtime timestamp default current_timestamp, -- 建檔時間
	primary key(eid)
);

-- 建立 Job 資料表
create table if not exists job (
	jid int not null auto_increment, -- 主鍵
	jname varchar(50) not null, -- 工作名稱
	eid int, -- 員工 id
	primary key(jid),
	foreign key(eid) references emp(eid) -- 外鍵關聯
);

-- 建立初始數據
insert into emp(ename, age) values ('A01', 21);
insert into emp(ename, age) values ('A02', 22);
insert into emp(ename, age) values ('A03', 23);
insert into emp(ename, age) values ('A04', 24);
insert into emp(ename, age) values ('A05', 25);
insert into emp(ename, age) values ('A06', 26);
insert into emp(ename, age) values ('A07', 27);
insert into emp(ename, age) values ('A08', 28);
insert into emp(ename, age) values ('A09', 29);
insert into emp(ename, age) values ('A10', 30);
insert into emp(ename, age) values ('A11', 31);
insert into emp(ename, age) values ('A12', 32);
insert into emp(ename, age) values ('A13', 33);

insert into job(jname, eid) values ('report', 1);
insert into job(jname, eid) values ('coding', 3);
insert into job(jname, eid) values ('jobA', 3);
insert into job(jname, eid) values ('jobB', 4);
insert into job(jname, eid) values ('jobC', 7);
insert into job(jname, eid) values ('jobD', 12);
insert into job(jname, eid) values ('jobE', 13);
insert into job(jname, eid) values ('jobF', 1);
insert into job(jname, eid) values ('jobG', 1);
insert into job(jname, eid) values ('jobH', 3);
insert into job(jname, eid) values ('jobI', 12);
insert into job(jname, eid) values ('jobJ', 7);
insert into job(jname, eid) values ('jobK', 4);
insert into job(jname, eid) values ('jobL', 3);
insert into job(jname) values ('jobM');
insert into job(jname) values ('jobN');

</pre>

