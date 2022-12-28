-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 28 déc. 2022 à 12:31
-- Version du serveur : 10.4.20-MariaDB
-- Version de PHP : 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS MoBileDao;
CREATE DATABASE MoBileDao;
USE MoBileDao;

CREATE TABLE Admins (
  idAdmin int(4) NOT NULL,
  `CodePin` int(25) NOT NULL,
  `nameUser` varchar(255) NOT NULL,
  `Numero` int(25) NOT NULL,
  `Solde` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `Admins`
--

INSERT INTO Admins (idAdmin, `CodePin`, `nameUser`, `Numero`, `Solde`)VALUES
(1, 1245, 'arnaud', 6546545, 250000),
(2, 1234, 'bobi', 456987, 40000);

-- --------------------------------------------------------

--
-- Structure de la table `Compte`
--

CREATE TABLE Compte (
  idCompte int(20) NOT NULL,
  `nameUser` varchar(25) NOT NULL,
  `Solde` int(255) NOT NULL,
  `Numero` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `Compte`
--

INSERT INTO Compte (idCompte, `nameUser`, `Solde`, `Numero`)VALUES
(1, 'Anderson', 250000, 620151842),
(2, 'Skywalker', 40000, 679707142),
(3, 'Elena', 45000, 695156866),
(4, 'Klaus', 50000, 620175731),
(5, 'Bonnie', 900000, 679285364),
(6, 'CamWater', 6000000, 677951025),
(7, 'Eneo', 5000000, 652584617);

-- --------------------------------------------------------

--
-- Structure de la table `CompteStructure`
--

CREATE TABLE CompteStructure (
  idStructure int(11) NOT NULL,
  `nameUser` varchar(255) NOT NULL,
  `Solde` int(255) NOT NULL,
  `Numero` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `CompteStructure`
--

INSERT INTO CompteStructure (idStructure, `nameUser`, `Solde`, `Numero`)VALUES
(3, 'tankeu', 45000, 44444),
(4, 'cynthia', 50000, 22222);

-- --------------------------------------------------------

--
-- Structure de la table `ResponsCoin`
--

CREATE TABLE ResponsCoin (
  idResp int(4) NOT NULL,
  `nameUser` varchar(255) NOT NULL,
  `Numero` int(25) NOT NULL,
  `Solde` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ResponsCoin`
--

INSERT INTO ResponsCoin (idResp, `nameUser`, `Numero`, `Solde`)VALUES
(2, 'bobi', 456987, 40000),
(3, 'tankeu', 154565, 45000);

-- --------------------------------------------------------

--
-- Structure de la table `Users`
--

CREATE TABLE Users (
  `idUser` int(2) NOT NULL,
  `idStructure` int(4) NOT NULL,
  `idAdmin` int(4) NOT NULL,
  `idResp` int(4) NOT NULL,
  `idCompte` int(4) NOT NULL,
  `nameUser` varchar(200) NOT NULL,
  `CodePin` int(8) NOT NULL,
  `Numero` int(12) NOT NULL,
  `Solde` int(255) NOT NULL,
  `NumeroCni` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `Users`
--

INSERT INTO Users (idUser, idStructure, idAdmin, idResp, idCompte, `nameUser`, `CodePin`, `Numero`, `Solde`, `NumeroCni`) VALUES
(1, 1, 1, 1, 1, 'arnaud', 1245, 45456423, 250000, 0),
(3, 2, 2, 2, 2, 'bobi', 1234, 456987, 40000, 0);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Admins`
--
ALTER TABLE Admins
  ADD PRIMARY KEY (idAdmin);

--
-- Index pour la table `Compte`
--
ALTER TABLE Compte
  ADD PRIMARY KEY (idCompte);

--
-- Index pour la table `CompteStructure`
--
ALTER TABLE CompteStructure
  ADD PRIMARY KEY (idStructure);

--
-- Index pour la table `ResponsCoin`
--
ALTER TABLE ResponsCoin
  ADD PRIMARY KEY (idResp);

--
-- Index pour la table `Users`
--
ALTER TABLE Users
  ADD PRIMARY KEY (idUser),
  ADD UNIQUE KEY `structure` (idStructure),
  ADD UNIQUE KEY `admin` (idAdmin),
  ADD UNIQUE KEY `responsable` (idResp),
  ADD UNIQUE KEY `compte` (idCompte);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Admins`
--
ALTER TABLE Admins
  MODIFY idAdmin int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `Compte`
--
ALTER TABLE Compte
  MODIFY idCompte int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `CompteStructure`
--
ALTER TABLE CompteStructure
  MODIFY idStructure int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `ResponsCoin`
--
ALTER TABLE ResponsCoin
  MODIFY idResp int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `Users`
--
ALTER TABLE Users
  MODIFY idUser int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `Users`
--
ALTER TABLE Users
  ADD CONSTRAINT `if_admin_user` FOREIGN KEY (idAdmin) REFERENCES Admins (idAdmin) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `if_compte_user` FOREIGN KEY (idCompte) REFERENCES Compte (idCompte) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
