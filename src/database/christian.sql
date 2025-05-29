-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2025 at 02:54 PM
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
  `profile_picture` varchar(255) NOT NULL,
  `secret_question` varchar(255) DEFAULT NULL,
  `secret_answer` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `cs_fname`, `cs_lname`, `cs_email`, `cs_contact`, `cs_user`, `cs_pass`, `cs_address`, `cs_type`, `cs_status`, `profile_picture`, `secret_question`, `secret_answer`) VALUES
(1, 'mark', 'christian', 'markcanedo@gmail.com', '09329011345', 'admin', '240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9', 'wala', 'admin', 'active', 'pfpimage/GrubGo Logo (1).jpg', 'What\'s your favorite color?', 'b1f51a511f1da0cd348b8f8598db32e61cb963e5fc69e2b41485bf99590ed75a'),
(10, 'Opaw ga Lamaw', 'aw', 'aw@gmail.com', '09329011345', 'awaw', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'aw', 'manager', 'active', 'pfpimage/1421bb7c-5da7-4256-91c3-ffa58bbe67c5.jpg', 'What\'s your favorite color?', 'a67a41c8bc79d5da917b5051f1f0d3f5aeb4b63ba246b3546a961ef7a3c7d931'),
(12, 'Merlion', 'almaden', 'natnat@gmail.com', '09329011345', 'natnat', '05bd0ee58fd753cc054dd727f1700b0ec7a52a69a61a5a5d44c6aa554d198648', 'wala', 'customer', 'active', 'pfpimage/pfp1.jpg', 'What\'s your favorite food?', 'be37888163073e0166d56d28cc5d45679343f4f57dbcefc25dd930eeda233c5b'),
(18, 'test1', 'test1', 'test1@gmail.com', '09329011345', 'test1', '37268335dd6931045bdcdf92623ff819a64244b53d0e746d438797349d4da578', 'test1', 'manager', 'Active', 'C:\\Users\\Administrator\\Desktop\\IT2A---ChristianCanedo---Foodala\\profile_pictures\\pfp1.jpg', '', ''),
(19, 'christian', 'christian', 'christian@gmail.com', '09329011345', 'christian', 'df59c257785d70706a411e70e123aff2844d6d57eb19f3a071afc8e019f5f2d8', 'christian', 'Customer', 'Active', 'pfpimage/default.jpg', '', ''),
(24, 'macky', 'mackyu', 'macky@gmail.com', '09329011345', 'macky', '78fd1ca8020dc6d7535e45c4b6c7164eaadbc748bc8146ecdc2748f1364b379f', 'macky', 'Customer', 'Active', 'pfpimage/default.jpg', '', ''),
(25, 'miketest', 'mike', 'mike@gmail.com', '09329011566', 'mike', 'b8ef69ad52755883952749fb3416642283d6313bd58738711bbdea3d347538a9', 'awaw', 'Customer', 'Active', 'pfpimage/pfp1.jpg', '', ''),
(26, 'Marian', 'Cadungon', 'marian@gmail.com', '09329011345', 'marian', 'a0cdcd29420ab399f89b01fc6461d7ac655bd8f942ff699c8bd2613229065141', 'Tungkil', 'Customer', 'Pending', 'pfpimage/default.jpg', NULL, NULL);

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
(91, 10, 'Log in!', '2025-04-27 16:55:34'),
(92, 12, 'Log in!', '2025-05-24 08:27:37'),
(93, 10, 'Log in!', '2025-05-24 08:27:48'),
(94, 10, 'Log in!', '2025-05-24 08:30:15'),
(95, 10, 'Log in!', '2025-05-24 08:32:31'),
(96, 12, 'Log in!', '2025-05-25 16:43:45'),
(97, 12, 'Log in!', '2025-05-25 16:46:45'),
(98, 1, 'Log in!', '2025-05-27 18:12:49'),
(99, 1, 'Log in!', '2025-05-27 18:19:23'),
(100, 1, 'Log in!', '2025-05-27 20:39:51'),
(101, 1, 'Log in!', '2025-05-27 21:04:46'),
(102, 1, 'Log in!', '2025-05-27 21:05:51'),
(103, 1, 'Log in!', '2025-05-27 21:08:59'),
(104, 12, 'Log in!', '2025-05-27 21:35:45'),
(105, 12, 'Log in!', '2025-05-27 22:34:01'),
(106, 12, 'Log in!', '2025-05-27 22:44:13'),
(107, 12, 'Log in!', '2025-05-27 22:50:54'),
(108, 12, 'Log in!', '2025-05-27 22:52:36'),
(109, 12, 'Log in!', '2025-05-27 22:58:37'),
(110, 12, 'Log in!', '2025-05-27 23:04:31'),
(111, 12, 'Log in!', '2025-05-27 23:05:17'),
(112, 12, 'Log in!', '2025-05-27 23:05:56'),
(113, 12, 'Log in!', '2025-05-27 23:06:32'),
(114, 12, 'Log in!', '2025-05-27 23:07:38'),
(115, 12, 'Log in!', '2025-05-27 23:09:03'),
(116, 12, 'Log in!', '2025-05-27 23:11:45'),
(117, 12, 'Log in!', '2025-05-27 23:14:44'),
(118, 12, 'Log in!', '2025-05-27 23:16:22'),
(119, 12, 'Log in!', '2025-05-27 23:16:51'),
(120, 1, 'Log in!', '2025-05-27 23:26:06'),
(121, 1, 'Log in!', '2025-05-27 23:26:33'),
(122, 1, 'Log in!', '2025-05-27 23:28:31'),
(123, 10, 'Log in!', '2025-05-27 23:40:37'),
(124, 10, 'Log in!', '2025-05-27 23:46:05'),
(125, 10, 'Updated Order Status! Order ID: 5', '2025-05-27 23:46:16'),
(126, 10, 'Log in!', '2025-05-27 23:47:39'),
(127, 10, 'Log in!', '2025-05-27 23:48:38'),
(128, 10, 'Updated Order Status! Order ID: 2', '2025-05-27 23:48:45'),
(129, 10, 'Log in!', '2025-05-27 23:50:56'),
(130, 10, 'Log in!', '2025-05-28 00:04:27'),
(131, 10, 'Added New Food Item! ID: 3', '2025-05-28 00:04:40'),
(132, 10, 'Updated Food Item! ID: 3', '2025-05-28 00:10:12'),
(133, 10, 'Log in!', '2025-05-28 14:27:23'),
(134, 12, 'Log in!', '2025-05-28 14:29:02'),
(135, 12, 'Password Change!', '2025-05-28 14:54:05'),
(136, 10, 'Log in!', '2025-05-28 15:11:13'),
(137, 10, 'Log in!', '2025-05-28 15:12:39'),
(138, 1, 'Log in!', '2025-05-28 15:41:52'),
(139, 1, 'Log in!', '2025-05-28 15:45:33'),
(140, 1, 'Log in!', '2025-05-28 15:48:34'),
(141, 10, 'Log in!', '2025-05-29 20:46:08'),
(142, 10, 'Log in!', '2025-05-29 20:48:11'),
(143, 10, 'Log in!', '2025-05-29 20:49:20'),
(144, 10, 'Log in!', '2025-05-29 20:50:16'),
(145, 10, 'Log in!', '2025-05-29 20:50:59');

-- --------------------------------------------------------

--
-- Table structure for table `order_tbl`
--

CREATE TABLE `order_tbl` (
  `o_id` int(11) NOT NULL,
  `f_id` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  `o_quantity` int(11) NOT NULL,
  `o_due` float NOT NULL,
  `o_status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order_tbl`
--

INSERT INTO `order_tbl` (`o_id`, `f_id`, `c_id`, `o_quantity`, `o_due`, `o_status`) VALUES
(1, 2, 12, 2, 40, 'Done'),
(2, 1, 12, 3, 507, 'Done'),
(4, 1, 12, 1, 169, 'Pending'),
(5, 2, 12, 2, 40, 'Done'),
(6, 1, 12, 2, 338, 'Pending'),
(7, 2, 12, 3, 60, 'Pending'),
(8, 1, 12, 1, 169, 'Pending'),
(9, 2, 12, 2, 40, 'Pending'),
(10, 2, 12, 3, 60, 'Pending'),
(11, 1, 12, 1, 169, 'Pending'),
(12, 2, 12, 4, 80, 'Pending'),
(13, 1, 12, 3, 507, 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `food_tbl`
--
ALTER TABLE `food_tbl`
  ADD PRIMARY KEY (`f_id`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `uid` (`id`);

--
-- Indexes for table `order_tbl`
--
ALTER TABLE `order_tbl`
  ADD PRIMARY KEY (`o_id`),
  ADD KEY `id_fk` (`c_id`),
  ADD KEY `f_id` (`f_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `food_tbl`
--
ALTER TABLE `food_tbl`
  MODIFY `f_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=146;

--
-- AUTO_INCREMENT for table `order_tbl`
--
ALTER TABLE `order_tbl`
  MODIFY `o_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `uid` FOREIGN KEY (`id`) REFERENCES `customer` (`id`);

--
-- Constraints for table `order_tbl`
--
ALTER TABLE `order_tbl`
  ADD CONSTRAINT `f_id` FOREIGN KEY (`f_id`) REFERENCES `food_tbl` (`f_id`),
  ADD CONSTRAINT `id_fk` FOREIGN KEY (`c_id`) REFERENCES `customer` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
