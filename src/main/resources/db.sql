drop table if exists users;

create table if not exists users (
    id         serial primary key,
    name       varchar(50)  not null,
    surname    varchar(100) not null,
    email      varchar(100) not null unique,
    password   varchar(20)  not null,
    avatar     varchar(50),
    created_at timestamp without time zone
)

drop table if exists friends;

create table if not exists friends (
    id serial primary key,
    user_id int,
    friend_user_id int,
    created_at timestamp without time zone,
    foreign key (user_id) references users (id),
    foreign key (friend_user_id) references users (id)
    );
