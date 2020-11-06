CREATE TABLE entjavaFinals.Cart (
	Cart_ID INT auto_increment NOT NULL,
	Cart_TotItem INT auto_increment NOT NULL,
	Cart_TotPrice DOUBLE auto_increment NOT NULL,
	Cust_ID INT NULL,
	Item_ID INT NULL,
	Item_Name varchar(100) NULL,
	Item_Price DOUBLE NULL,
	CONSTRAINT Cart_ID PRIMARY KEY (Cart_ID),
	CONSTRAINT Cust_ID FOREIGN KEY (Cust_ID) REFERENCES entjavaFinals.Customer(Cust_ID),
	CONSTRAINT Item_ID FOREIGN KEY (Item_ID) REFERENCES entjavaFinals.Item(Item_ID),
	CONSTRAINT Item_Name FOREIGN KEY (Item_Name) REFERENCES entjavaFinals.Item(Item_Name),
	CONSTRAINT Item_Price FOREIGN KEY (Item_Price) REFERENCES entjavaFinals.Item(Item_Price)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;
