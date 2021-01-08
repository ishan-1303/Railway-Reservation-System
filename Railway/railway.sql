-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2018 at 10:23 AM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.1.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `railway`
--

-- --------------------------------------------------------

--
-- Table structure for table `dadar`
--

CREATE TABLE `dadar` (
  `train_id` int(11) NOT NULL,
  `train_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `dest` varchar(45) DEFAULT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `dadar`
--

INSERT INTO `dadar` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10001, 'DECCAN EXPRESS', 'MUMBAI-CST', 'PUNE', 0),
(10002, 'DECCAN EXPRESS', 'PUNE', 'MUMBAI-CST', 0),
(10005, 'PANCHAVATI EXPRESS', 'MUMBAI-CST', 'MANMAD', 0),
(10006, 'PANCHAVATI EXPRESS', 'MANMAD', 'MUMBAI-CST', 0);

-- --------------------------------------------------------

--
-- Table structure for table `kalyan`
--

CREATE TABLE `kalyan` (
  `train_id` int(11) NOT NULL,
  `train_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `dest` varchar(45) DEFAULT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kalyan`
--

INSERT INTO `kalyan` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10001, 'DECCAN EXPRESS', 'MUMBAI_CST', 'PUNE', 0),
(10002, 'DECCAN EXPRESS', 'PUNE', 'MUMBAI_CST', 0),
(10003, 'PUNE_MANMAD EXPRESS', 'PUNE', 'MANMAD', 0),
(10004, 'MANMAD_PUNE EXPRESS', 'MANMAD', 'PUNE', 0),
(10005, 'PANCHAVATI EXPRESS', 'MANMAD', 'MUMBAI_CST', 0),
(10006, 'PANCHAVATI EXPRESS', 'MUMBAI_CST', 'MANMAD', 0),
(10007, 'GODAVARI EXPRESS', 'MUMBAI_LTT', 'MANMAD', 0),
(10008, 'GODAVARI EXPRESS', 'MANMAD', 'MUMBAI_LTT', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `karjat`
--

CREATE TABLE `karjat` (
  `train_id` int(11) NOT NULL,
  `train_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `dest` varchar(45) DEFAULT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `karjat`
--

INSERT INTO `karjat` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10001, 'DECCAN EXPRESS', 'MUMBAI-CST', 'PUNE', 0),
(10002, 'DECCAN EXPRESS', 'PUNE', 'MUMBAI-CST', 0),
(10003, 'PUNE_MANMAD EXPRESS', 'PUNE', 'MANMAD', 0),
(10004, 'MANMAD_PUNE EXPRESS', 'MANMAD', 'PUNE', 0);

-- --------------------------------------------------------

--
-- Table structure for table `kasara`
--

CREATE TABLE `kasara` (
  `train_id` int(11) NOT NULL,
  `train_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `dest` varchar(45) DEFAULT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kasara`
--

INSERT INTO `kasara` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10003, 'PUNE_MANMAD EXPRESS', 'PUNE', 'MANMAD', 0),
(10004, 'PUNE_MANMAD EXPRESS', 'MANMAD', 'PUNE', 0),
(10005, 'PANCHAVATI EXPRESS', 'MUMBAI-CST', 'MANMAD', 0),
(10006, 'PANCHAVATI EXPRESS', 'MANMAD', 'MUMBAI-CST', 0),
(10007, 'GODAVARI EXPRESS', 'MUMBAI_LTT', 'MANMAD', 0),
(10008, 'GODAVARI EXPRESS', 'MANMAD', 'MUMBAI_LTT', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `manmad`
--

CREATE TABLE `manmad` (
  `train_id` int(11) NOT NULL,
  `train_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `dest` varchar(45) DEFAULT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `manmad`
--

INSERT INTO `manmad` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10003, 'PUNE_MANMAD EXPRESS', 'PUNE', 'MANMAD', 0),
(10004, 'MANMAD_PUNE EXPRESS', 'MANMAD', 'MANMAD', 0),
(10005, 'PANCHAVATI EXPRESS', 'MUMBAI-CST', 'MANMAD', 0),
(10006, 'PANCHAVATI EXPRESS', 'MANMAD', 'MUMBAI-CST', 0),
(10007, 'GODAVARI EXPRESS', 'MUMBAI_LTT', 'MANMAD', 0),
(10008, 'GODAVARI EXPRESS', 'MANMAD', 'MUMBAI_LTT', 0);

-- --------------------------------------------------------

--
-- Table structure for table `mumbai_cst`
--

CREATE TABLE `mumbai_cst` (
  `train_id` int(11) NOT NULL,
  `train_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `dest` varchar(45) DEFAULT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `mumbai_cst`
--

INSERT INTO `mumbai_cst` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10001, 'DECCAN EXPRESS', 'MUMBAI-CST', 'PUNE', 0),
(10002, 'DECCAN EXPRESS', 'PUNE', 'MUMBAI-CST', 0),
(10005, 'PANCHAVATI EXPRESS', 'MUMBAI-CST', 'MANMAD', 0),
(10006, 'PANCHAVATI EXPRESS', 'MANMAD', 'MUMBAI-CST', 0);

-- --------------------------------------------------------

--
-- Table structure for table `mumbai_ltt`
--

CREATE TABLE `mumbai_ltt` (
  `train_id` int(20) NOT NULL,
  `train_name` varchar(50) NOT NULL,
  `source` varchar(50) NOT NULL,
  `dest` varchar(50) NOT NULL,
  `day` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mumbai_ltt`
--

INSERT INTO `mumbai_ltt` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10007, 'GODAVARI EXPRESS', 'MUMBAI-LTT', 'MANMAD', 0),
(10008, 'GODAVARI EXPRESS', 'MANMAD', 'MUMBAI-LTT', 0);

-- --------------------------------------------------------

--
-- Table structure for table `nashik_road`
--

CREATE TABLE `nashik_road` (
  `train_id` int(11) NOT NULL,
  `train_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `dest` varchar(45) DEFAULT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nashik_road`
--

INSERT INTO `nashik_road` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10003, 'PUNE_MANMAD EXPRESS', 'PUNE', 'MANMAD', 0),
(10004, 'MANMAD_PUNE EXPRESS', 'MANMAD', 'MANMAD', 0),
(10005, 'PANCHAVATI EXPRESS', 'MUMBAI-CST', 'MANMAD', 0),
(10006, 'PANCHAVATI EXPRESS', 'MANMAD', 'MUMBAI-CST', 0),
(10007, 'GODAVARI EXPRESS', 'MUMBAI_LTT', 'MANMAD', 0),
(10008, 'GODAVARI EXPRESS', 'MANMAD', 'MUMBAI_LTT', 0);

-- --------------------------------------------------------

--
-- Table structure for table `panvel`
--

CREATE TABLE `panvel` (
  `train_id` int(11) NOT NULL,
  `train_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `dest` varchar(45) DEFAULT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `panvel`
--

INSERT INTO `panvel` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10003, 'PUNE_MANMAD EXPRESS', 'PUNE', 'MANMAD', 0),
(10004, 'MANMAD_PUNE EXPRESS', 'MANMAD', 'PUNE', 0);

-- --------------------------------------------------------

--
-- Table structure for table `pune`
--

CREATE TABLE `pune` (
  `train_id` int(11) NOT NULL,
  `train_name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `dest` varchar(45) DEFAULT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pune`
--

INSERT INTO `pune` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10001, 'DECCAN EXPRESS', 'MUMBAI-CST', 'PUNE', 0),
(10002, 'DECCAN EXPRESS', 'PUNE', 'MUMBAI-CST', 0),
(10003, 'PUNE_MANMAD EXPRESS', 'PUNE', 'MANMAD', 0),
(10004, 'MANMAD_PUNE EXPRESS', 'MANMAD', 'PUNE', 0);

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `pnr` int(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `from` varchar(50) NOT NULL,
  `to` varchar(50) NOT NULL,
  `train_id` int(50) NOT NULL,
  `train_name` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `bill` int(50) NOT NULL,
  `day` int(50) NOT NULL,
  `month` varchar(50) NOT NULL,
  `year` varchar(50) NOT NULL,
  `Seat Number` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`pnr`, `name`, `mail`, `phone`, `from`, `to`, `train_id`, `train_name`, `type`, `bill`, `day`, `month`, `year`, `Seat Number`) VALUES
(1000000001, 'abcd', 'adsg', '4765', 'jguj', 'ygu', 65878, 'jghj', 'gkj', 7868, 768, 'hgkj', 'kjhg', 'h'),
(1000000002, '1', '2', '3', '4', '5', 6, '7', '8', 89, 3, '5', '6', '6'),
(1000000003, 'Ishan Kulkarni', 'ishan.kularni1997@gmail.com', '9403608070', 'NASHIK_ROAD', 'KALYAN', 10008, 'GODAVARI EXPRESS', 'FIRST CLASS', 500, 13, 'Mar', '1997', 'O-86');

-- --------------------------------------------------------

--
-- Table structure for table `station`
--

CREATE TABLE `station` (
  `stn_id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `nop` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `station`
--

INSERT INTO `station` (`stn_id`, `name`, `nop`) VALUES
(304, 'MUMBAI_CST', '12'),
(305, 'DADAR', '6'),
(306, 'KALYAN', '7'),
(307, 'PANVEL', '6'),
(308, 'KARJAT', '3'),
(309, 'PUNE', '6'),
(310, 'KASARA', '4'),
(311, 'NASHIK_ROAD', '4'),
(312, 'MANMAD', '6'),
(313, 'THANE', '10'),
(314, 'MUMBAI_LTT', '10');

-- --------------------------------------------------------

--
-- Table structure for table `thane`
--

CREATE TABLE `thane` (
  `train_id` int(20) NOT NULL,
  `train_name` varchar(50) NOT NULL,
  `source` varchar(50) NOT NULL,
  `dest` varchar(50) NOT NULL,
  `day` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `thane`
--

INSERT INTO `thane` (`train_id`, `train_name`, `source`, `dest`, `day`) VALUES
(10007, 'GODAVARI EXPRESS', 'MUMBAI_LTT', 'MANMAD', 0),
(10008, 'GODAVARI EXPRESS', 'MANMAD', 'MUMBAI_LTT', 0);

-- --------------------------------------------------------

--
-- Table structure for table `trains`
--

CREATE TABLE `trains` (
  `train_id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `source` varchar(45) DEFAULT NULL,
  `destination` varchar(45) DEFAULT NULL,
  `stops` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `trains`
--

INSERT INTO `trains` (`train_id`, `name`, `source`, `destination`, `stops`) VALUES
(10001, 'DECCAN EXPRESS', 'MUMBAI-CST', 'PUNE', 3),
(10002, 'DECCAN EXPRESS', 'PUNE', 'MUMBAI-CST', 3),
(10003, 'PUNE-MANMAD EXPRESS', 'PUNE', 'MANMAD', 5),
(10004, 'MANMAD-PUNE EXPRESS', 'MANMAD', 'PUNE', 5),
(10005, 'PANCHAVATI EXPRESS', 'MUMBAI-CST', 'MANMAD', 4),
(10006, 'PANCHAVATI EXPRESS', 'MANMAD', 'MUMBAI-CST', 4),
(10007, 'GODAVARI EXPRESS', 'MUMBAI-LTT', 'MANMAD', 4),
(10008, 'GODAVARI EXPRESS', 'MANMAD', 'MUMBAI-LTT', 4);

-- --------------------------------------------------------

--
-- Table structure for table `train_info`
--

CREATE TABLE `train_info` (
  `id` int(20) NOT NULL,
  `train_id` int(50) NOT NULL,
  `train_name` varchar(50) NOT NULL,
  `station` varchar(50) NOT NULL,
  `time_in` varchar(50) NOT NULL,
  `time_out` varchar(50) NOT NULL,
  `platform` int(20) NOT NULL,
  `source` varchar(50) NOT NULL,
  `dest` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `train_info`
--

INSERT INTO `train_info` (`id`, `train_id`, `train_name`, `station`, `time_in`, `time_out`, `platform`, `source`, `dest`) VALUES
(1, 10001, 'DECCAN EXPRESS', 'MUMBAI_CST', 'START', '07:00', 8, 'MUMBAI_CST', 'PUNE'),
(2, 10001, 'DECCAN EXPRESS', 'DADAR', '07:11', '07:13', 5, 'MUMBAI-CST', 'PUNE'),
(5, 10001, 'DECCAN EXPRESS', 'KALYAN', '07:53', '07:55', 5, 'MUMBAI-CST', 'PUNE'),
(7, 10001, 'DECCAN EXPRESS', 'KARJAT', '08:43', '08:45', 3, 'MUMBAI-CST', 'PUNE'),
(8, 10001, 'DECCAN EXPRESS', 'PUNE', '11:05', 'END', 5, 'MUMBAI-CST', 'PUNE'),
(9, 10002, 'DECCAN EXPRESS', 'PUNE', 'START', '15:15', 5, 'PUNE', 'MUMBAI-CST'),
(10, 10002, 'DECCAN EXPRESS', 'KARJAT', '17:18', '17:20', 2, 'PUNE', 'MUMBAI-CST'),
(11, 10002, 'DECCAN EXPRESS', 'KALYAN', '18:02', '18:05', 6, 'PUNE', 'MUMBAI-CST'),
(12, 10002, 'DECCAN EXPRESS', 'DADAR', '18:53', '18:55', 6, 'PUNE', 'MUMBAI-CST'),
(13, 10002, 'DECCAN EXPRESS', 'MUMBAI_CST', '19:17', 'END', 8, 'PUNE', 'MUMBAI_CST'),
(14, 10005, 'PANCHAVATI EXPRESS', 'MUMBAI_CST', 'START', '18:15', 9, 'MUMBAI_CST', 'MANMAD'),
(15, 10005, 'PANCHAVATI EXPRESS', 'DADAR', '18:28', '18:30', 5, 'MUMBAI-CST', 'MANMAD'),
(16, 10005, 'PANCHAVATI EXPRESS', 'KALYAN', '19:10', '19:13', 4, 'MUMBAI-CST', 'MANMAD'),
(17, 10005, 'PANCHAVATI EXPRESS', 'KASARA', '20:13', '20:15', 3, 'MUMBAI-CST', 'MANMAD'),
(18, 10005, 'PANCHAVATI EXPRESS', 'NASHIK_ROAD', '21:38', '21:40', 1, 'MUMBAI-CST', 'MANMAD'),
(19, 10005, 'PANCHAVATI EXPRESS', 'MANMAD', '22:50', 'END', 3, 'MUMBAI-CST', 'MANMAD'),
(20, 10006, 'PANCHAVATI EXPRESS', 'MANMAD', 'START', '06:02', 3, 'MANMAD', 'MUMBAI-CST'),
(21, 10006, 'PANCHAVATI EXPRESS', 'NASHIK_ROAD', '07:07', '07:10', 2, 'MANMAD', 'MUMBAI-CST'),
(22, 10006, 'PANCHAVATI EXPRESS', 'KASARA', '08:28', '08:30', 2, 'MANMAD', 'MUMBAI-CST'),
(23, 10006, 'PANCHAVATI EXPRESS', 'KALYAN', '09:38', '09:40', 5, 'MANMAD', 'MUMBAI-CST'),
(24, 10006, 'PANCHAVATI EXPRESS', 'DADAR', '10:23', '10:25', 4, 'MANMAD', 'MUMBAI-CST'),
(25, 10006, 'PANCHAVATI EXPRESS', 'MUMBAI_CST', '10:45', 'END', 9, 'MANMAD', 'MUMBAI_CST'),
(27, 10003, 'PUNE_MANMAD EXPRESS', 'PUNE', 'START', '11:45', 4, 'PUNE', 'MANMAD'),
(28, 10003, 'PUNE_MANMAD EXPRESS', 'KARJAT', '13:34', '13:35', 2, 'PUNE', 'MANMAD'),
(29, 10003, 'PUNE_MANMAD EXPRESS', 'PANVEL', '14:15', '14:20', 6, 'PUNE', 'MANMAD'),
(30, 10003, 'PUNE_MANMAD EXPRESS', 'KALYAN', '15:17', '15:20', 4, 'PUNE', 'MANMAD'),
(31, 10003, 'PUNE_MANMAD EXPRESS', 'KASARA', '16:20', '16:23', 3, 'PUNE', 'MANMAD'),
(32, 10003, 'PUNE_MANMAD EXPRESS', 'NASHIK_ROAD', '18:08', '18:10', 1, 'PUNE', 'MANMAD'),
(33, 10003, 'PUNE_MANMAD EXPRESS', 'MANMAD', '19:05', 'END', 5, 'PUNE', 'MANMAD'),
(34, 10004, 'MANMAD_PUNE EXPRESS', 'MANMAD', 'START', '04:05', 5, 'MANMAD', 'PUNE'),
(35, 10004, 'MANMAD_PUNE EXPRESS', 'NASHIK_ROAD', '05:08', '05:10', 2, 'MANMAD', 'PUNE'),
(36, 10004, 'MANMAD_PUNE EXPRESS', 'KASARA', '06:55', '07:00', 3, 'MANMAD', 'PUNE'),
(37, 10004, 'MANMAD_PUNE EXPRESS', 'KALYAN', '08:02', '08:05', 5, 'MANMAD', 'PUNE'),
(38, 10004, 'MANMAD_PUNE EXPRESS', 'PANVEL', '09:00', '09:05', 5, 'MANMAD', 'PUNE'),
(39, 10004, 'MANMAD_PUNE EXPRESS', 'KARJAT', '09:55', '10:00', 3, 'MANMAD', 'PUNE'),
(40, 10004, 'MANMAD_PUNE EXPRESS', 'PUNE', '12:05', 'END', 4, 'MANMAD', 'PUNE'),
(41, 10007, 'GODAVARI EXPRESS', 'MUMBAI_LTT', 'START', '15:00', 6, 'MUMBAI_LTT', 'MANMAD'),
(42, 10007, 'GODAVARI EXPRESS', 'THANE', '15:18', '15:20', 6, 'MUMBAI-LTT', 'MANMAD'),
(43, 10007, 'GODAVARI EXPRESS', 'KALYAN', '15:40', '15:43', 4, 'MUMBAI-LTT', 'MANMAD'),
(44, 10007, 'GODAVARI EXPRESS', 'KASARA', '16:46', '16:48', 3, 'MUMBAI-LTT', 'MANMAD'),
(45, 10007, 'GODAVARI EXPRESS', 'NASHIK_ROAD', '18:15', '18:20', 1, 'MUMBAI-LTT', 'MANMAD'),
(46, 10007, 'GODAVARI EXPRESS', 'MANMAD', '19:25', 'END', 2, 'MUMBAI-LTT', 'MANMAD'),
(47, 10008, 'GODAVARI EXPRESS', 'MANMAD', 'START', '08:35', 2, 'MANMAD', 'MUMBAI-LTT'),
(48, 10008, 'GODAVARI EXPRESS', 'NASHIK_ROAD', '09:32', '09:35', 2, 'MANMAD', 'MUMBAI-LTT'),
(49, 10008, 'GODAVARI EXPRESS', 'KASARA', '10:53', '10:55', 2, 'MANMAD', 'MUMBAI-LTT'),
(50, 10008, 'GODAVARI EXPRESS', 'KALYAN', '12:00', '12:03', 5, 'MANMAD', 'MUMBAI-LTT'),
(51, 10008, 'GODAVARI EXPRESS', 'THANE', '12:18', '12:20', 8, 'MANMAD', 'MUMBAI-LTT'),
(52, 10008, 'GODAVARI EXPRESS', 'MUMBAI_LTT', '13:00', 'END', 6, 'MANMAD', 'MUMBAI_LTT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dadar`
--
ALTER TABLE `dadar`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `kalyan`
--
ALTER TABLE `kalyan`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `karjat`
--
ALTER TABLE `karjat`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `kasara`
--
ALTER TABLE `kasara`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `manmad`
--
ALTER TABLE `manmad`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `mumbai_cst`
--
ALTER TABLE `mumbai_cst`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `mumbai_ltt`
--
ALTER TABLE `mumbai_ltt`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `nashik_road`
--
ALTER TABLE `nashik_road`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `panvel`
--
ALTER TABLE `panvel`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `pune`
--
ALTER TABLE `pune`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`pnr`);

--
-- Indexes for table `station`
--
ALTER TABLE `station`
  ADD PRIMARY KEY (`stn_id`);

--
-- Indexes for table `thane`
--
ALTER TABLE `thane`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `trains`
--
ALTER TABLE `trains`
  ADD PRIMARY KEY (`train_id`);

--
-- Indexes for table `train_info`
--
ALTER TABLE `train_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `pnr` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1000000004;

--
-- AUTO_INCREMENT for table `station`
--
ALTER TABLE `station`
  MODIFY `stn_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=315;

--
-- AUTO_INCREMENT for table `trains`
--
ALTER TABLE `trains`
  MODIFY `train_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10009;

--
-- AUTO_INCREMENT for table `train_info`
--
ALTER TABLE `train_info`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
