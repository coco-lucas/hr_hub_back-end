create table if not exists User(
    id bigint not null,
    firstName varchar(50) not null,
    lastname varchar(50) not null,
    document_type enum('id', 'cpf', 'cnpj') not null,
    document_num varchar(20) not null,
    email varchar(100) not null,
    phone varchar(20) not null,
    address_id bigint,

    primary key (id),
    foreign key (address_id) references Address(id) ON DELETE SET NULL
)