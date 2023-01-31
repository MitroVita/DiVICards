create table if not exists Users
(
    Id       varchar(36) primary key not null,
    Login    varchar(20)             not null,
    Password varchar(20)             not null
);
create table if not exists Collections
(
    Id               varchar(36) primary key not null,
    collections_name varchar(20)             not null,
    user_id          varchar(36)             not null
);
create table if not exists Words
(
    Id            varchar(36) primary key not null,
    Word          varchar(20)             not null,
    Translation   varchar(20)             not null,
    Collection_id varchar(36)
);
