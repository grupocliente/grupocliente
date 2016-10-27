-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-10-2016 a las 10:32:35
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba1`
--

CREATE TABLE `prueba1` (
  `codigo` int(3) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prueba1`
--

INSERT INTO `prueba1` (`codigo`, `nombre`, `apellido`, `direccion`) VALUES
(1, 'carlos', 'lizama', 'santa martha'),
(2, 'ana', 'velasco', 'santa elena'),
(3, 'aquilon', 'lizama', 'santa martha'),
(4, 'josue', 'enano', 'loco'),
(5, 'juan', 'carrasco', 'santa elena'),
(6, 'alex', 'saavedra', 'jose de lama'),
(7, 'ciliorca', 'orozco', 'no se sabe'),
(8, 'hola', 'mundo', 'java'),
(9, 'hola', 'java', 'rmi'),
(10, 'marlon', 'XD', 'XD'),
(11, 'carlos', 'jhona', 'santa martha'),
(12, 'hana', 'lazo', 'jose de lama');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
