INSERT INTO TB_AUTHORS (ID, FIRST_NAME, LAST_NAME) VALUES (1, 'AYRTON', 'PEREIRA');
INSERT INTO TB_AUTHORS (ID, FIRST_NAME, LAST_NAME) VALUES (2, 'JOAQUIM', 'ERNESTO');
INSERT INTO TB_AUTHORS (ID, FIRST_NAME, LAST_NAME) VALUES (3, 'PAULINA', 'CHIZIANE');


INSERT INTO TB_posts (AUTHOR_ID, ID, POSTED, BODY, TITLE) VALUES (1, 1, CURRENT_DATE(), 'testando para body', 'testando para titulo');
