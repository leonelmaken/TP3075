-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS MoBileDao;
CREATE DATABASE MoBileDao;
USE MoBileDao;

CREATE TABLE Compte (
	Numero				int(20)		PRIMARY KEY,
	nameUser				varchar(20)	REFERENCES nameUser(User),
	Solde		int(600),
) ENGINE = InnoDB;
INSERT INTO Compte (Numero, nameUser,Solde) VALUES ( 653241315, 'Anderson',75000 );
INSERT INTO  Compte (Numero, nameUser,Solde)VALUES ( 653124578, 'Skywalker',0 );
INSERT INTO Compte (Numero, nameUser,Solde) VALUES ( 658234479, 'Elena',75000 );
INSERT INTO Compte (Numero, nameUser,Solde)VALUES ( 699882231, 'Klaus',500000 );
INSERT INTO  Compte (Numero, nameUser,Solde)VALUES ( 679285364, 'Bonnie',900000);
INSERT INTO  Compte (Numero, nameUser,Solde)VALUES ( 677951025,'CamWater',6000000);
INSERT INTO  Compte (Numero, nameUser,Solde)VALUES ( 652584617 ,'Eneo',5000000);
-- -----------------------------------------------------------------------------
-- - Construction de la table des utilisateurs                               ---
-- -----------------------------------------------------------------------------
CREATE TABLE Users (
	IdUser				int(4)		PRIMARY KEY AUTO_INCREMENT,
	nameUser				varchar(20)	NOT NULL,
	CodePin			int(20)	NOT NULL,
	Numero	int(20)		NOT NULL REFERENCES Numero(Compte),
	Solde               int(255)   REFERENCES Compte(Solde)
) ENGINE = InnoDB;


INSERT INTO Users (IdUser, nameUser, CodePin,Numero,Solde) VALUES ( 1, 'Anderson',15780,653124707,75000 );
INSERT INTO  Users (IdUser, nameUser, CodePin,Numero,Solde)VALUES ( 2, 'Skywalker',131500,612034578,0 );
INSERT INTO  Users (IdUser, nameUser, CodePin,Numero,Solde)VALUES ( 3, 'Elena',15893,658791423,85200);
INSERT INTO  Users (IdUser, nameUser, CodePin,Numero,Solde)VALUES ( 4, 'Klaus',251346,694782513,50000 );
INSERT INTO Users (IdUser, nameUser, CodePin,Numero,Solde) VALUES ( 5, 'Bonnie',68932,678123547,850000);
INSERT INTO  Users (IdUser, nameUser, CodePin,Numero,Solde)VALUES ( 6,'CamWater',58963,677951025,6000000);
INSERT INTO  Users (IdUser, nameUser, CodePin,Numero,Solde)VALUES ( 7,'Eneo',89632,652584617,5000000);

SELECT * FROM Users;

-- -----------------------------------------------------------------------------
-- - Construction de la table des administrateurs                            ---
-- -----------------------------------------------------------------------------

CREATE TABLE Admins (
	IdUser				int(4)		NOT NULL REFERENCES Users(IdUser),
	CodePin				int(4)		NOT NULL REFERENCES Users(CodePin),
	nameUser		    varchar(20)		NOT NULL REFERENCES Users(nameUser),
	Numero              int(20)     NOT NULL REFERENCES Users(Numero),
	Solde               int(255)   REFERENCES Compte(Solde)
) ENGINE = InnoDB;

INSERT INTO Admins (IdUser, CodePin,nameUser,Numero,Solde)VALUES ( 1,15780, 'Anderson',653124707,75000);
INSERT INTO Admins (IdUser, CodePin,nameUser,Numero,Solde) VALUES ( 5,68932, 'Bonnie',678123547,850000 );

-- -----------------------------------------------------------------------------
-- - Construction de la tables des ComptStructures en vente                         ---
-- -----------------------------------------------------------------------------
CREATE TABLE ComptStructure (
	IdCompt			int(4)		PRIMARY KEY AUTO_INCREMENT,
	nameUser		VARCHAR(200)     	NOT NULL REFERENCES Users(nameUser),
	Solde				int(255)       REFERENCES Compte(Solde),
	Numero		int(20)	NOT NULL REFERENCES Compte(Numero)
) ENGINE = InnoDB;

INSERT INTO ComptStructure (IdCompt, nameUser,Solde,Numero ) VALUES ( 1,'Eneo',5000000,652584617 );
INSERT INTO ComptStructure ( IdCompt, nameUser,Solde,Numero ) VALUES ( 2,'CamWater',6000000,677951025);

SELECT * FROM ComptStructure;

-- -----------------------------------------------------------------------------
-- - Construction de la tables des Responsables de Coin de ventes                                 ---
-- -----------------------------------------------------------------------------
CREATE TABLE ResponsCoin (
	IdUser		int(4)		NOT NULL REFERENCES Users(IdUser),
	Poste			VARCHAR(200)		NOT NULL,
	Numero       int(20)  NOT NULL REFERENCES Compte(Numero),
	Solde        int(255)    REFERENCES Compte(Solde)
) ENGINE = InnoDB;

INSERT INTO ResponsCoin (IdUser,Poste,Numero,Solde) VALUES (2,"CalBoxeur",612034578,0); 
INSERT INTO ResponsCoin (IdUser,Poste,Numero,Solde) VALUES (3,"CalBoxeur",658791423,85200); 
INSERT INTO ResponsCoin (IdUser,Poste,Numero,Solde) VALUES (4,"CalBoxeur",694782513,50000); 


