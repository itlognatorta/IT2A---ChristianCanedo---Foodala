-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2025 at 05:23 PM
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
  `cs_pass` varchar(255) NOT NULL,
  `cs_address` varchar(100) NOT NULL,
  `cs_type` varchar(20) NOT NULL,
  `cs_status` varchar(50) NOT NULL,
  `profile_picture` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `cs_fname`, `cs_lname`, `cs_email`, `cs_contact`, `cs_user`, `cs_pass`, `cs_address`, `cs_type`, `cs_status`, `profile_picture`) VALUES
(1, 'mark', 'christian', 'markcanedo@gmail.com', '09329011345', 'admin', '240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9', 'wala', 'admin', 'active', ''),
(5, 'hoho', 'kaka', 'hohokaka@gmail.com', '09329011345', 'koko', 'kokokaka123', 'wla', '', 'Pending', ''),
(10, 'aw', 'aw', 'aw@gmail.com', '09329011345', 'awaw', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'aw', 'manager', 'active', 'C:\\Users\\Administrator\\Desktop\\IT2A---ChristianCanedo---Foodala\\profile_pictures\\pfp.jpg'),
(11, 'Marian', 'Cadungon', 'marian.cadungon10@gmail.com', '09934119800', 'Marian', 'kram0207', 'Lipata', '', 'Active', ''),
(12, 'natnat', 'almaden', 'natnat@gmail.com', '09329011345', 'natnat', '05bd0ee58fd753cc054dd727f1700b0ec7a52a69a61a5a5d44c6aa554d198648', 'wala', 'customer', 'active', ''),
(13, 'chanchan', 'oo', 'chanchan@gmail.com', '09329011345', 'chanchan', 'christian', 'oo', 'Customer', 'active', ''),
(14, 'mike', 'christian', 'awaw@gmail.com', '09329011345', 'mikey', 'c8c738c493efa4015396b5c305b307b915415e7ea3761d71799f1f5ae8a8006f', 'Lower Lipata, Minglanilla, Cebu', 'Customer', 'Active', ''),
(15, 'test', 'test', 'test@gmail.com', '09329011345', 'test', 'fccdd6f437911e49ff6cd6d1ea20d7fdc0ff75fbd22d6a9930676978f9e35af1', 'test', 'Customer', 'Active', ''),
(16, 'Mark ', 'Christian', 'christian@gmail.com', '09329011345', 'admin123', 'JAvlGPq9JyTdtvBO6x2llnRI1+gxwIyPqCKAn3THIKk=', 'wala', 'Admin', 'Active', ''),
(17, 'wawa', 'wawa', 'wawa@gmail.com', '09909011345', 'wawaw', '+fSQbd7larvHB+vuJvVOEbSBtv5ksbC8iqzFOdyP9iU=', 'wawa', 'Manager', 'Active', ''),
(18, 'test1', 'test1', 'test1@gmail.com', '09329011345', 'test1', '37268335dd6931045bdcdf92623ff819a64244b53d0e746d438797349d4da578', 'test1', 'manager', 'Active', 'C:\\Users\\Administrator\\Desktop\\IT2A---ChristianCanedo---Foodala\\profile_pictures\\pfp1.jpg');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
