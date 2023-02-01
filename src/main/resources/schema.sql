drop table if exists recomendations;

CREATE TABLE recomendations (
   id SERIAL PRIMARY KEY,
   title VARCHAR (45),
   salary INTEGER,
   description VARCHAR (255)
);
