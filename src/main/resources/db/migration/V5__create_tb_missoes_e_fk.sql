CREATE TABLE IF NOT EXISTS tb_missoes (
                                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                          nome_da_missao VARCHAR(100),
    dificuldade VARCHAR(50)
    );

ALTER TABLE tb_cadastro
    ADD COLUMN IF NOT EXISTS missoes_id BIGINT;

ALTER TABLE tb_cadastro
    ADD CONSTRAINT IF NOT EXISTS fk_ninja_missao
    FOREIGN KEY (missoes_id) REFERENCES tb_missoes(id);
