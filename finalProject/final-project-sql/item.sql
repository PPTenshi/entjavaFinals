CREATE TABLE entjavaFinals.Item (
	Item_ID INT auto_increment NOT NULL,
	Item_Name varchar(100) auto_increment NOT NULL,
	Item_Brand varchar(100) auto_increment NOT NULL,
	Item_Price DOUBLE auto_increment NULL,
	CONSTRAINT Item_ID PRIMARY KEY (Item_ID),
	CONSTRAINT Item_Name PRIMARY KEY (Item_Name),
	CONSTRAINT Item_Price PRIMARY KEY (Item_Price)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;
