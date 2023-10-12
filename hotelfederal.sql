-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 13, 2023 at 01:27 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotelfederal`
--

-- --------------------------------------------------------

--
-- Table structure for table `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  `piso` int(11) DEFAULT NULL,
  `idTipoHabitacion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `numero`, `estado`, `piso`, `idTipoHabitacion`) VALUES
(10, 1, 1, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `DNI` varchar(15) DEFAULT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `celular` int(15) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `apellido`, `DNI`, `domicilio`, `correo`, `celular`, `estado`) VALUES
(1, 'Carlos Salvador', 'Nardone', '37577100', 'Berrutti 1840', 'carlin1994@live.com.ar', 155155655, 1),
(2, 'Avila', 'Mauricio', '30068183', 'Tucuman', 'mauricioavila@gmail.com', 542323423, 1),
(3, 'Bazzoni', 'Diego', '24652571', 'San Luis', 'diegobazzoni@gmail.com', 2147483647, 1),
(4, 'Perez', 'Andres', '1243243', 'Mendoza', 'andres.perez242@gmail.com', 112313223, 1),
(5, 'Hernandez', 'Ezequiel', '34243424', 'Necochea 3850', 'ezequiel.14322@live.com', 155155155, 1),
(6, 'Pepe', 'Lopez', '574645664', 'Santa Cruz', 'jorgelopez57@gmail.com', 14141656, 1),
(7, 'Alberto', 'Gonzales', '5734242', 'Cordoba 1040', 'albertogonzales@gmail.com', 313123121, 0),
(8, 'Laura', 'Fernandez', '64646466', 'San Juan 340', 'lauraperez@gmail.com', 15514341, 0),
(9, 'Martin', 'Perez', '1231231312', 'En la esquina de mi casa', 'martinmartinez@gmai.com.ru', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `fechaEntrada` date DEFAULT NULL,
  `fechaSalida` date DEFAULT NULL,
  `cantidadPersonas` int(11) DEFAULT NULL,
  `precioTotal` double(10,0) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  `idHuesped` int(11) DEFAULT NULL,
  `idHabitacion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tipohabitacion`
--

CREATE TABLE `tipohabitacion` (
  `idTipoHabitacion` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `capacidadMaxima` int(11) DEFAULT NULL,
  `cantidadCamas` int(11) DEFAULT NULL,
  `tipoCamas` varchar(50) DEFAULT NULL,
  `precioNoche` double(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tipohabitacion`
--

INSERT INTO `tipohabitacion` (`idTipoHabitacion`, `codigo`, `capacidadMaxima`, `cantidadCamas`, `tipoCamas`, `precioNoche`) VALUES
(1, 1, 1, 1, 'Simple', 10000),
(4, 2, 2, 2, 'doble', 3000),
(5, 3, 3, 4, 'Simple', 12000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `idTipoHabitacion` (`idTipoHabitacion`);

--
-- Indexes for table `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`);

--
-- Indexes for table `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHuesped` (`idHuesped`),
  ADD KEY `idHabitacion` (`idHabitacion`);

--
-- Indexes for table `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  ADD PRIMARY KEY (`idTipoHabitacion`),
  ADD UNIQUE KEY `codigo` (`codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  MODIFY `idTipoHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idTipoHabitacion`) REFERENCES `tipohabitacion` (`idTipoHabitacion`);

--
-- Constraints for table `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
