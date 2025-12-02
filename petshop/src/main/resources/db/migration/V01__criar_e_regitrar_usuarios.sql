CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(150) NOT NULL,
  `data` DATE NOT NULL,
  `rua` varchar(30) NOT NULL,
  `numero` varchar(30) NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `cep` varchar(30) NOT NULL,
  `cpf` varchar(300) NOT NULL,
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (id, name, email, password, rua, numero, bairro, cidade, estado, cep, data, cpf, active) 
values (1, 'Fernando Duarte', 'fernandoduarte@ifsp.edu.br', '$2a$10$Ot4XGuyPP7r82nN3WXA0bOL1Qk9gShKDlVuPoyp89HoFnHcwO4Tji', 'Rua teste', '123', 'Centro', 'Campos do Jordão', 'SP','12345-123','1975-11-16','12345678900', 1);
INSERT INTO user (id, name, email, password, rua, numero, bairro, cidade, estado, cep, data, cpf, active) 
values (2, 'Juliana Silva', 'julianasilva@ifsp.edu.br', '$2a$10$Ot4XGuyPP7r82nN3WXA0bOL1Qk9gShKDlVuPoyp89HoFnHcwO4Tji', 'Rua teste', '123', 'Centro', 'Campos do Jordão', 'SP','12345-123','1980-01-01', '12345678900', 1);

