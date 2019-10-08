-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 08, 2019 at 05:20 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestor_medico`
--

-- --------------------------------------------------------

--
-- Table structure for table `antecedente_paciente`
--

CREATE TABLE `antecedente_paciente` (
  `folio_paciente` varchar(11) NOT NULL,
  `personales` varchar(255) NOT NULL,
  `heredo_personales` varchar(255) NOT NULL,
  `patologicos` varchar(255) NOT NULL,
  `quirurgicos` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `datos_paciente`
--

CREATE TABLE `datos_paciente` (
  `folio_paciente` varchar(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `primer_apellido` varchar(45) NOT NULL,
  `segundo_apellido` varchar(45) NOT NULL,
  `curp` varchar(18) NOT NULL,
  `fecha_nacimiento` varchar(10) NOT NULL,
  `sexo` varchar(5) NOT NULL,
  `tipo_sangre` varchar(5) NOT NULL,
  `religion` varchar(20) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `trabajo` varchar(45) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `colonia` varchar(45) NOT NULL,
  `municipio` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `antecedente_paciente`
--
ALTER TABLE `antecedente_paciente`
  ADD PRIMARY KEY (`folio_paciente`);

--
-- Indexes for table `datos_paciente`
--
ALTER TABLE `datos_paciente`
  ADD PRIMARY KEY (`folio_paciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
