CREATE DATABASE  IF NOT EXISTS `liga_typerow`;
USE `liga_typerow`;

DROP TABLE IF EXISTS `mecz`;
CREATE TABLE `mecz` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `kolejka_id` int NOT NULL,
    `host_team` varchar(50) NOT NULL,
    `away_team` varchar(50) NOT NULL,
    `data` datetime NOT NULL,
    `wynik` varchar(50),
    FOREIGN KEY (`kolejka_id`) REFERENCES `kolejka` (`kolejka_id`)
);

DROP TABLE IF EXISTS `kolejka`;
CREATE TABLE `kolejka` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `data_kolejki` date NOT NULL,
    `wyniki` varchar(10)
);

DROP TABLE IF EXISTS `typy`;
CREATE TABLE `typy` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `kolejka_id` int NOT NULL,
    `user_id` int NOT NULL,
    `typy` varchar(10) NOT NULL,
    `punkty` int NOT NULL,
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
);

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `login` varchar(40) NOT NULL UNIQUE,
    `email` varchar(50) NOT NULL UNIQUE,
    `password` varchar(50) NOT NULL,
    `pkt` int
);