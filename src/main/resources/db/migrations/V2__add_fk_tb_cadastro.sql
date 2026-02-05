ALTER TABLE tb_cadastro
    ADD CONSTRAINT fk_cadastro_missoes
        FOREIGN KEY (missoes_id)
            REFERENCES tb_missoes(id);
