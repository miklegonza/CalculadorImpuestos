CREATE SCHEMA IF NOT EXISTS carro_db;
USE carro_db;

DROP TABLE IF EXISTS carro;
CREATE TABLE carro (
    Placa VARCHAR(45) NOT NULL,
    Marca VARCHAR(45) NOT NULL,
    Modelo VARCHAR(45) NOT NULL,
    Precio DECIMAL(15, 0) NOT NULL,
    PRIMARY KEY (Placa)
);

INSERT INTO carro (Placa, Marca, Modelo, Precio)
VALUES
    ('BRF 456', 'Chevrolet', 'Captiva', 156000),
    ('FAK 153', 'Renault', 'Duster', 95000),
    ('JNF 754', 'Nissan', 'Versa', 180000),
    ('QJI 798', 'Chrysler', 'Firepower Concept', 250000),
    ('ELV 015', 'Chevrolet', 'Cruze', 128000),
    ('PQZ 344', 'Fiat', '500', 43000),
    ('ALS 711', 'Ford', 'Fusion', 163000),
    ('NXK 254', 'Ford', 'Raptor', 290000),
    ('SOL 964', 'Kia', 'Cerato', 134000),
    ('DSK 810', 'Renault', 'Sandero', 68000);

SELECT * FROM carro;
