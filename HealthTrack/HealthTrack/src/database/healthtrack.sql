CREATE DATABASE healthtrack;

USE healthtrack;

CREATE TABLE atividade_fisica (

	id INT PRIMARY KEY auto_increment,
    nome varchar(100),
    duracao INT
);

CREATE TABLE habito_saude (

	id INT PRIMARY KEY auto_increment,
    descricao VARCHAR(150)
);

CREATE TABLE dado_biometrico (

    id INT PRIMARY KEY AUTO_INCREMENT,
    peso DOUBLE,
    altura DOUBLE,
    idade INT
);

SELECT * FROM atividade_fisica;
SELECT * FROM habito_saude;
SELECT * FROM dado_biometrico;

TRUNCATE TABLE atividade_fisica;
TRUNCATE TABLE habito_saude;
TRUNCATE TABLE dado_biometrico;