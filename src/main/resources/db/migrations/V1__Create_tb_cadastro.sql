CREATE TABLE tb_cadastro (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             nome VARCHAR(255) NOT NULL,
                             email VARCHAR(255) UNIQUE NOT NULL,
                             rank VARCHAR(100),
                             img_url VARCHAR(500),
                             idade INTEGER,
                             missoes_id BIGINT
);
