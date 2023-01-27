create table if not exists "Users" (
    "Id" varchar(30) not null auto_increment primary key,
    "Login" varchar(20) not null,
    "Password" varchar(20) not null
)ENGINE=InnoDB default CHARSET=UTF8