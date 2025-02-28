create table if not exists Address(
    id bigint not null,
    user_id bigint not null,
    zip_code smallint not null,
    house_num smallint not null,
    street varchar(50),
    city varchar(100),
    state varchar(50),
    country varchar(50)

    primary key (id),
    foreign key (user_id) references User(id)
     on delete cascade
)