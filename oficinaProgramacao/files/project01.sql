CREATE DATABASE mercado;

DROP TABLE IF EXISTS `mercado`.`produto`;
CREATE TABLE  `mercado`.`produto` (
  `id` INT NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  `nome` VARCHAR(50) NOT NULL DEFAULT '',
  `descricao` text,
  `quantidade` INT,
  `preco` double (7,2)
);