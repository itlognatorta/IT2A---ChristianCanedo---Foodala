-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 25, 2025 at 01:14 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `christian`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `cs_fname` varchar(100) NOT NULL,
  `cs_lname` varchar(100) NOT NULL,
  `cs_email` varchar(100) NOT NULL,
  `cs_contact` varchar(50) NOT NULL,
  `cs_user` varchar(100) NOT NULL,
  `cs_pass` varchar(100) NOT NULL,
  `cs_address` varchar(100) NOT NULL,
  `cs_type` varchar(20) NOT NULL,
  `cs_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `cs_fname`, `cs_lname`, `cs_email`, `cs_contact`, `cs_user`, `cs_pass`, `cs_address`, `cs_type`, `cs_status`) VALUES
(1, 'mark', 'christian', 'markcanedo@gmail.com', '09329011345', 'admin', 'admin123', 'wala', 'admin', 'active'),
(5, 'hoho', 'kaka', 'hohokaka@gmail.com', '09329011345', 'koko', 'kokokaka123', 'wla', '', 'Pending'),
(10, 'aw', 'aw', 'aw@gmail.com', '09329011345', 'awaw', '12345678', 'aw', 'manager', 'active'),
(11, 'Marian', 'Cadungon', 'marian.cadungon10@gmail.com', '09934119800', 'Marian', 'kram0207', 'Lipata', '', 'Active'),
(12, 'natnat', 'almaden', 'natnat@gmail.com', '09329011345', 'natnat', 'almaden123', 'wala', 'customer', 'active'),
(13, 'chanchan', 'oo', 'chanchan@gmail.com', '09329011345', 'chanchan', 'christian', 'oo', 'Customer', 'active'),
(14, 'mike', 'christian', 'awaw@gmail.com', '09329011345', 'mikey', 'mikemike', 'Lower Lipata, Minglanilla, Cebu', 'Customer', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
