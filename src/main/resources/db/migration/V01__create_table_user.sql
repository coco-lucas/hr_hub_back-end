CREATE TABLE IF NOT EXISTS "User"(
    id SERIAL PRIMARY KEY,
    firstName VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    document_type varchar(5) NOT NULL CHECK (document_type IN('id', 'cpf', 'cnpj')),
    document_num VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL
);