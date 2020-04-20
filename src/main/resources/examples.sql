CREATE TABLE examples (
	id INTEGER GENERATED ALWAYS AS IDENTITY,
	first_name VARCHAR(32) NOT NULL,
	last_name VARCHAR(32) NOT NULL,
	PRIMARY KEY(id)
);

INSERT INTO examples (first_name, last_name)
VALUES
 ('Jeffery', 'Brannon')
,('Nathan', 'Sutton')
,('Nick', 'Jaross');