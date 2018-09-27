-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-06-2017 a las 18:04:06
-- Versión del servidor: 5.6.26
-- Versión de PHP: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `iqupbd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen`
--

CREATE TABLE IF NOT EXISTS `examen` (
  `CodExamen` int(6) NOT NULL,
  `CodMateria` int(10) NOT NULL,
  `CodTema` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE IF NOT EXISTS `materia` (
  `CodMateria` int(11) NOT NULL,
  `NomMateria` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`CodMateria`, `NomMateria`) VALUES
(1, 'Matematicas'),
(2, 'Fisica'),
(5, 'Quimica'),
(8, 'Lenguaje');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notar`
--

CREATE TABLE IF NOT EXISTS `notar` (
  `CodNotaR` int(6) NOT NULL,
  `Contenido` varchar(500) NOT NULL,
  `CodTema` int(10) NOT NULL,
  `CodMateria` int(5) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `notar`
--

INSERT INTO `notar` (`CodNotaR`, `Contenido`, `CodTema`, `CodMateria`) VALUES
(1, 'Los carbohidratos son fuentes de energia', 1, 5),
(9, 'La aceleracion de la gravedad es 10m/s2', 5, 2),
(10, 'Area del triangulo = (b*h)/2', 3, 1),
(11, 'El dominio de una funcion polinomica son los Reales', 6, 1),
(13, 'CnH2n+2', 7, 5),
(14, 'El angulo incidente es igual al reflejado ', 8, 2),
(16, 'Los tipos de agumentos son 4: causa, autoridad, ejemplo y analogía', 9, 8),
(17, 'Sustancia que acelera o retarda la velocidad de una reacción ', 10, 5),
(18, ' F = k • ?x', 11, 2),
(28, 'area circulo a=(r*r)/2', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promedio`
--

CREATE TABLE IF NOT EXISTS `promedio` (
  `CodPromedio` int(11) NOT NULL,
  `CodMateria` int(10) NOT NULL,
  `Necesita` varchar(5) NOT NULL,
  `Final` double(3,1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `promedio`
--

INSERT INTO `promedio` (`CodPromedio`, `CodMateria`, `Necesita`, `Final`) VALUES
(10, 8, ' - ', 3.2),
(11, 1, ' M ', 1.0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tareas`
--

CREATE TABLE IF NOT EXISTS `tareas` (
  `CodTarea` int(5) NOT NULL,
  `Descripcion` varchar(50) NOT NULL,
  `Fecha` varchar(11) DEFAULT NULL,
  `Verificacion` varchar(2) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tareas`
--

INSERT INTO `tareas` (`CodTarea`, `Descripcion`, `Fecha`, `Verificacion`) VALUES
(5, 'Proyecto de artes ', '11-jul-2017', 'NO'),
(6, 'Mascara de religion', '9-jun-2017', 'SI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tema`
--

CREATE TABLE IF NOT EXISTS `tema` (
  `CodTema` int(11) NOT NULL,
  `NomTema` varchar(40) NOT NULL,
  `CodMateria` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tema`
--

INSERT INTO `tema` (`CodTema`, `NomTema`, `CodMateria`) VALUES
(1, 'Biocompuestos', 5),
(3, 'Geometria', 1),
(5, 'Fuerza ', 2),
(6, 'Funciones', 1),
(7, 'Alcanos', 5),
(8, 'Ley de reflexion', 2),
(9, 'Tipos de argumentos', 8),
(10, 'Catalizador', 5),
(11, 'Ley de Hooke', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `examen`
--
ALTER TABLE `examen`
  ADD PRIMARY KEY (`CodExamen`),
  ADD KEY `CodMateria` (`CodMateria`),
  ADD KEY `tema` (`CodTema`),
  ADD KEY `CodMateria_2` (`CodMateria`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`CodMateria`);

--
-- Indices de la tabla `notar`
--
ALTER TABLE `notar`
  ADD PRIMARY KEY (`CodNotaR`),
  ADD KEY `CodTema` (`CodTema`),
  ADD KEY `CodMateria` (`CodMateria`);

--
-- Indices de la tabla `promedio`
--
ALTER TABLE `promedio`
  ADD PRIMARY KEY (`CodPromedio`),
  ADD KEY `Materia` (`CodMateria`);

--
-- Indices de la tabla `tareas`
--
ALTER TABLE `tareas`
  ADD PRIMARY KEY (`CodTarea`);

--
-- Indices de la tabla `tema`
--
ALTER TABLE `tema`
  ADD PRIMARY KEY (`CodTema`),
  ADD KEY `CodMateria` (`CodMateria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `examen`
--
ALTER TABLE `examen`
  MODIFY `CodExamen` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `CodMateria` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `notar`
--
ALTER TABLE `notar`
  MODIFY `CodNotaR` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT de la tabla `promedio`
--
ALTER TABLE `promedio`
  MODIFY `CodPromedio` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT de la tabla `tareas`
--
ALTER TABLE `tareas`
  MODIFY `CodTarea` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `tema`
--
ALTER TABLE `tema`
  MODIFY `CodTema` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `examen`
--
ALTER TABLE `examen`
  ADD CONSTRAINT `examen_ibfk_1` FOREIGN KEY (`CodMateria`) REFERENCES `materia` (`CodMateria`),
  ADD CONSTRAINT `examen_ibfk_2` FOREIGN KEY (`CodTema`) REFERENCES `tema` (`CodTema`);

--
-- Filtros para la tabla `notar`
--
ALTER TABLE `notar`
  ADD CONSTRAINT `notar_ibfk_1` FOREIGN KEY (`CodTema`) REFERENCES `tema` (`CodTema`),
  ADD CONSTRAINT `notar_ibfk_2` FOREIGN KEY (`CodMateria`) REFERENCES `materia` (`CodMateria`);

--
-- Filtros para la tabla `promedio`
--
ALTER TABLE `promedio`
  ADD CONSTRAINT `promedio_ibfk_1` FOREIGN KEY (`CodMateria`) REFERENCES `materia` (`CodMateria`);

--
-- Filtros para la tabla `tema`
--
ALTER TABLE `tema`
  ADD CONSTRAINT `tema_ibfk_1` FOREIGN KEY (`CodMateria`) REFERENCES `materia` (`CodMateria`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
