-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.25-log - MySQL Community Server (GPL)
-- ОС Сервера:                   Win32
-- HeidiSQL Версия:              8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Дамп структуры базы данных listexpenses
CREATE DATABASE IF NOT EXISTS `listexpenses` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `listexpenses`;


-- Дамп структуры для таблица listexpenses.expenses
CREATE TABLE IF NOT EXISTS `expenses` (
  `num` int(11) NOT NULL,
  `paydate` date DEFAULT NULL,
  `receiver` int(11) DEFAULT NULL,
  `value` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы listexpenses.expenses: ~8 rows (приблизительно)
/*!40000 ALTER TABLE `expenses` DISABLE KEYS */;
INSERT INTO `expenses` (`num`, `paydate`, `receiver`, `value`) VALUES
	(1, '2011-05-10', 1, 20000),
	(2, '2011-05-10', 2, 94200),
	(3, '2011-05-11', 3, 10000),
	(4, '2011-05-11', 2, 12950),
	(5, '2015-06-28', 1, 60000),
	(6, '2015-06-29', 2, 84000),
	(7, '2015-07-02', 2, 82000),
	(8, '2015-07-02', 3, 40000);
/*!40000 ALTER TABLE `expenses` ENABLE KEYS */;


-- Дамп структуры для таблица listexpenses.receivers
CREATE TABLE IF NOT EXISTS `receivers` (
  `num` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы listexpenses.receivers: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `receivers` DISABLE KEYS */;
INSERT INTO `receivers` (`num`, `name`) VALUES
	(1, 'Интернет-провайдер "Соло"'),
	(2, 'Гипермаркет "Корона"'),
	(3, 'МТС');
/*!40000 ALTER TABLE `receivers` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
