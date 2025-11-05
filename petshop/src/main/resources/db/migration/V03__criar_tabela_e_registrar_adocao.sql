CREATE TABLE `adocao` (
	`id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	`status` VARCHAR(50) NOT NULL,
	`date` DATE NOT NULL,
	`observation` VARCHAR(50) NOT NULL,
	`user_id` BIGINT(20) NOT NULL,
	`pet_id` BIGINT(20) NOT NULL,
	FOREIGN KEY (user_id) REFERENCES user(id),
	FOREIGN KEY (pet_id) REFERENCES pet(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO adocao (id, status, date, observation, user_id, pet_id) VALUES 
(1, 'PENDENTE', '2025-06-10', 'timido', 1, 1),
(2, 'EM_ANALISE', '2025-04-16', 'De dia', 2, 2);
