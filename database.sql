CREATE DATABASE cadastra_cliente;

USE cadastra_cliente;

CREATE TABLE cliente ( 
	id INT PRIMARY KEY AUTO_INCREMENT, 
	nome VARCHAR(50) NOT NULL, 
	cpf VARCHAR(11) NOT NULL,
	endereco_id INT
);

CREATE TABLE endereco (
	id INT PRIMARY KEY AUTO_INCREMENT,
    lougradouro VARCHAR(50) NOT NULL,
    numero INT(4),
    complemento VARCHAR(10),
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    uf VARCHAR (2) NOT NULL,
    cep VARCHAR(8) NOT NULL
);

INSERT INTO Endereco (lougradouro, numero, complemento, bairro, cidade, uf, cep) VALUES ('Av. Santa Catarina', 333, 'Apto 105', 'Bela Vista', 'São José', 'SC', '88090100');
INSERT INTO Endereco (lougradouro, numero, complemento, bairro, cidade, uf, cep) VALUES ('Rua Iano', 57, 'casa', 'Barreiros', 'São José', 'SC', '88090105');
INSERT INTO Endereco (lougradouro, numero, complemento, bairro, cidade, uf, cep) VALUES ('São Pedro', 250, 'casa', 'Areas', 'São José', 'SC', '88090540');


INSERT INTO cliente (nome, cpf, endereco_id) VALUES ('João Pedro', '04583549824', 1);
INSERT INTO cliente (nome, cpf, endereco_id) VALUES ('Marta Cardoso', '04789621486', 2);
INSERT INTO cliente (nome, cpf, endereco_id) VALUES ('Anderson Becker', '06984523781', 3);

