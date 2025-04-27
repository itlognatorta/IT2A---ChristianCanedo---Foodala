-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2025 at 04:21 PM
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
-- Table structure for table `food_tbl`
--

CREATE TABLE `food_tbl` (
  `f_id` int(11) NOT NULL,
  `f_name` varchar(250) NOT NULL,
  `f_price` float NOT NULL,
  `f_category` varchar(250) NOT NULL,
  `f_status` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `food_tbl`
--

INSERT INTO `food_tbl` (`f_id`, `f_name`, `f_price`, `f_category`, `f_status`) VALUES
(1, 'Chicken Inasal w/ Rice', 169, 'Meals', 'Available'),
(2, 'MangoFloat', 20, 'Dessert', 'Available');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `food_tbl`
--
ALTER TABLE `food_tbl`
  ADD PRIMARY KEY (`f_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `food_tbl`
--
ALTER TABLE `food_tbl`
  MODIFY `f_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
