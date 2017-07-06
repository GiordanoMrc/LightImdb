# --- !Ups

CREATE TABLE TB_USUARIO (
  EMAIL VARCHAR(50),
  SENHA VARCHAR(12),
  PRIMARY KEY (EMAIL)
);


CREATE TABLE TB_FILME (
  ID_FILME INTEGER NOT NULL AUTO_INCREMENT,
  TITULO VARCHAR(50), 
  DIRETOR VARCHAR(50),
  ANO_PRODUCAO INTEGER(4),
  PRIMARY KEY (ID_FILME)
);

CREATE TABLE AVALIACAO (
  EMAIL VARCHAR(50) NOT NULL,
  ID_FILME INT NOT NULL,
  COMENTARIO VARCHAR(140) NOT NULL,
  NOTA INT(3) NOT NULL,
  PRIMARY KEY (EMAIL,ID_FIlME),
  FOREIGN KEY (EMAIL) REFERENCES TB_USUARIO(EMAIL)  ON DELETE CASCADE,
  FOREIGN KEY (ID_FILME) REFERENCES TB_FILME(ID_FILME) ON DELETE CASCADE
);

# --- !Downs

DROP TABLE User;