drop table if exists users;

create table if not exists users (
    id         serial primary key,
    name       varchar(50)  not null,
    surname    varchar(100) not null,
    email      varchar(100) not null unique,
    password   varchar(20)  not null,
    avatar     varchar(50),
    created_at timestamp without time zone now()
)

drop table if exists friends;

create table if not exists friends (
    id serial primary key,
    user_id int,
    friend_user_id int,
    created_at timestamp without time zone now(),
    foreign key (user_id) references users (id),
    foreign key (friend_user_id) references users (id)
    );

drop table if exists friend_requests;

create table if not exists friend_requests (
                                               id serial primary key,
                                               user_id int,
                                               friend_user_id int,
                                               created_at timestamp without time zone now(),
                                               foreign key (user_id) references users (id),
    foreign key (friend_user_id) references users (id)
    );


drop table if exists user_black_list;

create table if not exists user_black_list (
                                               id serial primary key,
                                               user_id int,
                                               black_list_user_id int,
                                               created_at timestamp without time zone now(),
                                               foreign key (user_id) references users (id),
    foreign key (black_list_user_id) references users (id)
    );


drop table if exists groups;

create table if not exists groups
(
    id         serial primary key,
    user_id    int not null,
    name       varchar(250),
    created_at timestamp without time zone default now(),
    foreign key (user_id) references users (id)
    );

create table if not exists users_groups
(
    user_id   int not null,
    group_id  int not null,
    moderator boolean,
    foreign key (user_id) references users (id),
    foreign key (group_id) references groups (id)
    );

drop table if exists chats;

create table if not exists chats
(
    id         serial primary key,
    user_id    int not null,
    group_id   int not null,
    created_at timestamp without time zone default now(),
    foreign key (user_id) references users (id),
    foreign key (group_id) references groups (id)
    );

create table if not exists users_chats
(
    user_id int not null,
    chat_id int not null,
    foreign key (user_id) references users (id),
    foreign key (chat_id) references chats (id)
    );

create table if not exists messages
(
    id         serial primary key,
    user_id    int not null,
    chat_id    int not null,
    text       text,
    created_at timestamp without time zone default now()
    )
