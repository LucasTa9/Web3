CREATE TABLE `pet` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `raca` varchar(50) NOT NULL,
  `idade` DATE NOT NULL,
  `especie` varchar(150) NOT NULL,
  `sexo` varchar(150) NOT NULL,
  `porte` varchar(15) NOT NULL,
  `vacina` tinyint(1) NOT NULL,
  `disponivel` tinyint(1) NOT NULL,
  `castracao` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO pet (id, nome, raca, idade, especie, sexo, porte, vacina,disponivel, castracao) 
values (1, 'Luca', 'ViraLata', '2025-02-25','cão','MACHO','medio', 1,1, 1);
INSERT INTO pet (id, nome, raca, idade, especie, sexo, porte, vacina,disponivel, castracao) 
values (2, 'Ra', 'Ciames', '2022-03-09', 'gato','FEMEA','pequeno', 1,1, 1);
