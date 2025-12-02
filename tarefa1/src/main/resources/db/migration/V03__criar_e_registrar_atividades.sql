CREATE TABLE tarefa (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	description VARCHAR(50) NOT NULL,
	date DATE NOT NULL,
	observation VARCHAR(50) NOT NULL,
	status VARCHAR(20) NOT NULL,
	user_id BIGINT(20) NOT NULL,
	category_id BIGINT(20) NOT NULL,
	FOREIGN KEY (user_id) REFERENCES user(id),
	FOREIGN KEY (category_id) REFERENCES category(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tarefa (description, date, observation, status, user_id, category_id) VALUES 
('corredor', '2025-01-01', 'De noite', 'NOVA', 1, 1),
('procastinador', '2025-08-30', 'De dia', 'NOVA', 2, 2),
('batedor', '2025-07-11', 'De noite', 'CONCLUIDA', 3, 3);