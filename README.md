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

</pre>

