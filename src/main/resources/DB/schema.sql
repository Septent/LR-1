DROP TABLE IF EXISTS product CASCADE;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1;


CREATE TABLE product(
    id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    title       VARCHAR         NOT NULL,
    author      VARCHAR         NOT NULL,
    genre       VARCHAR         NOT NULL,
    language    VARCHAR         NOT NULL,
    price       INTEGER         NOT NULL,
    quantity    INTEGER         NOT NULL
);