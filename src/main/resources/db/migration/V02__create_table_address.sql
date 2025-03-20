CREATE TABLE IF NOT EXISTS "Address"(
    id SERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    zip_code VARCHAR(15) NOT NULL,
    house_num SMALLINT NOT NULL,
    street VARCHAR(50) NOT NULL,
    city VARCHAR(100) NOT NULL,
    state VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL,

    CONSTRAINT fk_user_id 
    FOREIGN KEY (user_id) REFERENCES "User"(id) ON DELETE CASCADE
);