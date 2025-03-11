ALTER TABLE "User" ADD COLUMN address_id BIGINT;

ALTER TABLE "User" ADD CONSTRAINT fk_user_address
     FOREIGN KEY (address_id) REFERENCES "Address"(id) ON DELETE CASCADE;