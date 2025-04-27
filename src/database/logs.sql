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
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `log_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `actions` varchar(255) NOT NULL,
  `date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`log_id`, `id`, `actions`, `date`) VALUES
(1, 1, 'Created Student Account Successfully! ID no. 19', '2025-04-04 21:32:39'),
(2, 1, 'Created Student Account Successfully! ID no. 20', '2025-04-09 17:06:42'),
(3, 1, 'Created new account. ID: 21', '2025-04-09 17:15:55'),
(4, 1, 'Created new account. ID: 22', '2025-04-09 17:27:36'),
(5, 1, 'Created new account. ID: 23', '2025-04-09 17:43:56'),
(6, 1, 'Created new account. ID: 24', '2025-04-09 18:09:46'),
(7, 1, 'Created new account. ID: 25', '2025-04-09 18:12:50'),
(8, 1, 'Log in!', '2025-04-09 23:32:58'),
(9, 12, 'Log in!', '2025-04-09 23:50:25'),
(10, 12, 'Password Change!', '2025-04-09 23:50:57'),
(11, 1, 'Log in!', '2025-04-21 16:49:11'),
(12, 1, 'Updated account Information!', '2025-04-21 16:49:42'),
(13, 1, 'Updated account Information!', '2025-04-21 16:50:05'),
(14, 1, 'Updated account Information!', '2025-04-21 16:50:36'),
(15, 1, 'Log in!', '2025-04-21 16:50:55'),
(16, 1, 'Updated account Information!', '2025-04-21 16:51:20'),
(17, 1, 'Updated account Information!', '2025-04-21 16:51:38'),
(18, 1, 'Log in!', '2025-04-21 16:54:20'),
(19, 1, 'Updated account Information!', '2025-04-21 16:54:35'),
(20, 1, 'Updated account Information!', '2025-04-21 16:54:54'),
(21, 1, 'Log in!', '2025-04-21 16:56:06'),
(22, 1, 'Updated account Information!', '2025-04-21 16:56:15'),
(23, 1, 'Log in!', '2025-04-21 16:59:00'),
(24, 1, 'Updated account Information!', '2025-04-21 16:59:07'),
(25, 1, 'Updated account Information!', '2025-04-21 16:59:19'),
(26, 1, 'Log in!', '2025-04-21 17:02:53'),
(27, 1, 'Updated account Information!', '2025-04-21 17:03:02'),
(28, 1, 'Log in!', '2025-04-21 17:05:08'),
(29, 1, 'Updated account Information!', '2025-04-21 17:05:20'),
(30, 10, 'Log in!', '2025-04-21 18:33:05'),
(31, 10, 'Log in!', '2025-04-21 18:44:42'),
(32, 10, 'Added New Food Item! ID: 1', '2025-04-21 18:45:22'),
(33, 10, 'Log in!', '2025-04-21 18:51:14'),
(34, 10, 'Log in!', '2025-04-21 18:52:02'),
(35, 10, 'Log in!', '2025-04-21 18:52:20'),
(36, 10, 'Log in!', '2025-04-21 20:27:56'),
(37, 10, 'Added New Food Item! ID: 2', '2025-04-21 20:28:18'),
(38, 10, 'Log in!', '2025-04-21 20:29:55'),
(39, 10, 'Password Change!', '2025-04-21 20:30:10'),
(40, 10, 'Password Change!', '2025-04-21 20:31:09'),
(41, 10, 'Log in!', '2025-04-21 21:14:41'),
(42, 10, 'Log in!', '2025-04-21 21:16:30'),
(43, 10, 'Updated Food Item! ID: 1', '2025-04-21 21:16:48'),
(44, 1, 'Log in!', '2025-04-27 12:01:24'),
(45, 12, 'Log in!', '2025-04-27 12:01:55'),
(46, 12, 'Log in!', '2025-04-27 12:03:50'),
(47, 12, 'Log in!', '2025-04-27 12:16:17'),
(48, 12, 'Log in!', '2025-04-27 12:17:13'),
(49, 12, 'Log in!', '2025-04-27 12:17:31'),
(50, 12, 'Log in!', '2025-04-27 12:18:23'),
(51, 12, 'Log in!', '2025-04-27 12:19:53'),
(52, 10, 'Log in!', '2025-04-27 12:20:45'),
(53, 10, 'Updated Food Item! ID: 1', '2025-04-27 12:21:11'),
(54, 10, 'Updated Food Item! ID: 1', '2025-04-27 12:21:18'),
(55, 12, 'Log in!', '2025-04-27 12:21:35'),
(56, 12, 'Log in!', '2025-04-27 12:48:03'),
(57, 10, 'Log in!', '2025-04-27 12:48:32'),
(58, 12, 'Log in!', '2025-04-27 13:48:14'),
(59, 12, 'Log in!', '2025-04-27 14:43:15'),
(60, 12, 'Log in!', '2025-04-27 14:44:36'),
(61, 12, 'Log in!', '2025-04-27 14:46:06'),
(62, 12, 'Log in!', '2025-04-27 14:47:51'),
(63, 12, 'Log in!', '2025-04-27 14:48:36'),
(64, 12, 'Log in!', '2025-04-27 14:49:56'),
(65, 12, 'Log in!', '2025-04-27 14:51:04'),
(66, 12, 'Log in!', '2025-04-27 14:53:25'),
(67, 12, 'Log in!', '2025-04-27 14:55:38'),
(68, 12, 'Log in!', '2025-04-27 14:56:36'),
(69, 12, 'Log in!', '2025-04-27 14:57:15'),
(70, 12, 'Log in!', '2025-04-27 15:04:57'),
(71, 12, 'Log in!', '2025-04-27 15:05:57'),
(72, 12, 'Added New Order! Order ID: 2', '2025-04-27 15:06:03'),
(73, 12, 'Log in!', '2025-04-27 15:09:34'),
(74, 10, 'Log in!', '2025-04-27 15:51:57'),
(75, 10, 'Log in!', '2025-04-27 15:55:46'),
(76, 10, 'Log in!', '2025-04-27 16:17:08'),
(77, 10, 'Log in!', '2025-04-27 16:19:46'),
(78, 10, 'Log in!', '2025-04-27 16:31:59'),
(79, 10, 'Log in!', '2025-04-27 16:32:51'),
(80, 10, 'Log in!', '2025-04-27 16:34:13'),
(81, 10, 'Log in!', '2025-04-27 16:34:36'),
(82, 10, 'Log in!', '2025-04-27 16:40:12'),
(83, 10, 'Log in!', '2025-04-27 16:41:44'),
(84, 10, 'Log in!', '2025-04-27 16:43:11'),
(85, 10, 'Updated Food Item! ID: 1', '2025-04-27 16:43:23'),
(86, 10, 'Log in!', '2025-04-27 16:44:37'),
(87, 10, 'Log in!', '2025-04-27 16:46:21'),
(88, 10, 'Log in!', '2025-04-27 16:54:53'),
(89, 10, 'Log in!', '2025-04-27 16:55:27'),
(90, 10, 'Updated Order Status! Order ID: 1', '2025-04-27 16:55:29'),
(91, 10, 'Log in!', '2025-04-27 16:55:34');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `uid` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=92;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `uid` FOREIGN KEY (`id`) REFERENCES `customer` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
