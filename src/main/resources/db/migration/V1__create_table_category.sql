CREATE TABLE tb_category
(
    id_category BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    description VARCHAR(255),
    CONSTRAINT pk_tb_category PRIMARY KEY (id_category)
);

ALTER TABLE tb_category
    ADD CONSTRAINT uc_tb_category_description UNIQUE (description);