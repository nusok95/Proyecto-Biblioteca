-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-05-2016 a las 06:51:39
-- Versión del servidor: 5.7.9-log
-- Versión de PHP: 7.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lector`
--

CREATE TABLE `lector` (
  `id` varchar(15) NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `apellido_paterno` varchar(15) DEFAULT NULL,
  `apellido_materno` varchar(15) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `tipo_usuario` int(11) DEFAULT NULL,
  `calle` varchar(15) DEFAULT NULL,
  `codigo_postal` varchar(10) DEFAULT NULL,
  `colonia` varchar(15) DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `lector`
--

INSERT INTO `lector` (`id`, `nombre`, `apellido_paterno`, `apellido_materno`, `correo`, `telefono`, `tipo_usuario`, `calle`, `codigo_postal`, `colonia`, `numero`, `estado`) VALUES
('s14011607', 'Gerardo', 'Martinez', 'asdasa', 'dasda', 'dasd', 1, 'sadas', 'sad', 'dasda', '12', 1),
('s14011627', 'Alan', 'Barrera', 'Arcos', 'aspdjas', 'dajpsijda', 0, 'dasipjda', 'jip', 'dapsjd', 'dapsjd', 1),
('s14011632', 'Susana', 'González', 'Portilla', 'susana@hotmail.com', '8812212', 0, 'asda', '1', 'dasdas', '32', 1),
('s14011642', 'Erasmo Carlos', 'Torres ', 'Sanromán', 'erasmocts@gmail.com', '8145181', 0, 'Antonio Perez', '91170', 'El mirador', '61', 1),
('s14017955', 'Omar ', 'Cornelio', 'Munguia', 'asdijada', 'djaipsdj', 0, 'das', 'd', 'd', 'd', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `folio` varchar(20) NOT NULL,
  `titulo` varchar(30) DEFAULT NULL,
  `fecha_publicacion` date DEFAULT NULL,
  `editorial` varchar(30) DEFAULT NULL,
  `estado` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `nombre_usuario` varchar(20) NOT NULL,
  `contraseña` varchar(20) DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nombre_usuario`, `contraseña`, `tipo`) VALUES
('alan', 'alanB', 0),
('carlos', 'carlosT', 0),
('omar', 'omarC', 0),
('susana', 'camilo123', 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `lector`
--
ALTER TABLE `lector`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`folio`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`nombre_usuario`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
