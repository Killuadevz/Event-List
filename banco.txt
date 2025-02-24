INSERT INTO tb_atividades (Id, nome, descricao, preco)
VALUES 
    (1, 'Curso de HTML', 'Curso introdutório de HTML', 50.00),
    (2, 'Palestra de IA', 'Palestra sobre Inteligência Artificial', 0.00),
    (3, 'Workshop de Python', 'Aprenda Python do zero', 120.00),
    (4, 'Curso de Banco de Dados', 'Introdução ao SQL e NoSQL', 80.00),
    (5, 'Oficina de UX/UI', 'Fundamentos de experiência do usuário', 90.00),
    (6, 'Curso de Git e GitHub', 'Controle de versão na prática', 60.00),
    (7, 'Curso de ReactJS', 'Desenvolvimento web moderno', 150.00),
    (8, 'Segurança da Informação', 'Fundamentos de cibersegurança', 70.00),
    (9, 'Desenvolvimento Mobile', 'Criação de apps para Android e iOS', 130.00),
    (10, 'Inteligência Artificial aplicada', 'Machine Learning e Data Science', 200.00);

INSERT INTO tb_bloco (Id, atividade_id, inicio, fim)
VALUES 
    (1, 1, '2025-03-01 09:00:00', '2025-03-01 12:00:00'),
    (2, 1, '2025-03-02 14:00:00', '2025-03-02 17:00:00'),
    (3, 2, '2025-03-01 15:00:00', '2025-03-01 17:00:00'),
    (4, 3, '2025-03-05 10:00:00', '2025-03-05 13:00:00'),
    (5, 4, '2025-03-06 14:00:00', '2025-03-06 16:00:00'),
    (6, 5, '2025-03-07 09:30:00', '2025-03-07 12:30:00'),
    (7, 6, '2025-03-08 13:00:00', '2025-03-08 15:00:00'),
    (8, 7, '2025-03-09 10:00:00', '2025-03-09 12:00:00'),
    (9, 8, '2025-03-10 14:00:00', '2025-03-10 16:30:00'),
    (10, 9, '2025-03-11 16:00:00', '2025-03-11 18:00:00');

INSERT INTO tb_categoria (Id, nome)
VALUES 
    (1, 'Programação'),
    (2, 'Tecnologia'),
    (3, 'Banco de Dados'),
    (4, 'UX/UI Design'),
    (5, 'Versionamento'),
    (6, 'Desenvolvimento Web'),
    (7, 'Cibersegurança'),
    (8, 'Mobile'),
    (9, 'Inteligência Artificial'),
    (10, 'Ciência de Dados');

INSERT INTO tb_participante (Id, nome, email)
VALUES 
    (1, 'Fiama', 'fiama@email.com'),
    (2, 'João Silva', 'joao@email.com'),
    (3, 'Maria Oliveira', 'maria@email.com'),
    (4, 'Carlos Pereira', 'carlos@email.com'),
    (5, 'Ana Souza', 'ana@email.com'),
    (6, 'Ricardo Lima', 'ricardo@email.com'),
    (7, 'Beatriz Mendes', 'beatriz@email.com'),
    (8, 'Fernando Rocha', 'fernando@email.com'),
    (9, 'Gabriela Costa', 'gabriela@email.com'),
    (10, 'Lucas Martins', 'lucas@email.com');
