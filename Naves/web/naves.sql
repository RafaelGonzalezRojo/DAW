-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 18-05-2016 a las 14:40:15
-- Versión del servidor: 5.5.44-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `naves`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hangar`
--

CREATE TABLE IF NOT EXISTS `hangar` (
  `IdNave` int(11) NOT NULL,
  `modelo` varchar(50) COLLATE utf8_bin NOT NULL,
  `longitud` int(11) NOT NULL,
  `daño` int(11) NOT NULL,
  `escudo` int(11) DEFAULT NULL,
  `combustible` varchar(50) COLLATE utf8_bin NOT NULL,
  `arma` varchar(50) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`IdNave`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
