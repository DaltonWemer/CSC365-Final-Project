CREATE TABLE devices (
	id INTEGER GENERATED ALWAYS AS IDENTITY,
	bar_code VARCHAR(32) NOT NULL,
	name VARCHAR(32) NOT NULL,
	category VARCHAR(32),
	condition VARCHAR(32) NOT NULL,
	price INTEGER NOT NULL,
	PRIMARY KEY(id)
);

INSERT INTO devices (bar_code,name,category,condition,price)
VALUES
 ('CXUG4A8VWGDANUPD','Macbook Pro', 'Laptop', 'New', 1799 ),
 ('817P4Z4KLHZB8UJ2','Macbook Pro', 'Laptop', 'Open Box', 1499 ),
 ('6460ATN0ZDFUYP44','iPhone 11 Pro Max', 'Phone', 'New', 1199 ),
 ('YPHC9LIPFRH2HPZS','Nvidia RTX Titan', 'Graphics Card', 'New', 1399 ),
 ('F855NG3CLQMLKB6H','LG B9 Oled', 'TV', 'New', 1999 );

