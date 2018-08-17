use filesystem;

select * from t_file;

create table t_users(
user_id int not null primary key auto_increment,
username varchar(100) not null,
password varchar(200) not null,
repassword datetime not null,
email varchar(20),
telephone varchar(20),
status varchar(25)
);

create table t_file(
file_id int not null primary key auto_increment,
file_name varchar(100) not null,
file_url varchar(200) not null,
file_create_time datetime not null,
file_type varchar(20) not null,
file_size varchar(20),
userid int,
foreign key(userid) references t_user(user_id)
);

insert into t_user values(1,"jiangnan","123","123","ljnwsbs@163.com","15680081851","user");
insert into t_user values(2,"jiangnan","123","123","ljnwsbs@163.com","15680081851","admin");

insert into t_file values(1,"pic","E://pic","2018-06-12","txt","12M",1);
insert into t_file values(2,"pic","E://pic","2018-06-12","txt","12M",1);
insert into t_file values(3,"pic","E://pic","2018-06-12","txt","12M",1);
insert into t_file values(4,"pic","E://pic","2018-06-12","txt","12M",1);
insert into t_file values(5,"pic","E://pic","2018-06-12","txt","12M",1);
insert into t_file values(6,"pic","E://pic","2018-06-12","txt","12M",1);
insert into t_file values(7,"pic","E://pic","2018-06-12","txt","12M",1);
insert into t_file values(8,"pic","E://pic","2018-06-12","txt","12M",1);
insert into t_file values(9,"pic","E://pic","2018-06-12","txt","12M",1);
insert into t_file values(10,"pic","E://pic","2018-06-12","txt","12M",1);

select * from t_file;

