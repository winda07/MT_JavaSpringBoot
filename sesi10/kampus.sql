-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `nilai`;
CREATE TABLE `nilai` (
  `NIM` int(11) NOT NULL,
  `kode_matakuliah` int(11) NOT NULL,
  `nilai` enum('a','b','c','d') NOT NULL,
  KEY `NIM` (`NIM`),
  KEY `kode_matakuliah` (`kode_matakuliah`),
  CONSTRAINT `nilai_ibfk_1` FOREIGN KEY (`NIM`) REFERENCES `tabel_mahasiswa` (`NIM`),
  CONSTRAINT `nilai_ibfk_2` FOREIGN KEY (`kode_matakuliah`) REFERENCES `tabel_matakuliah` (`kode_matakuliah`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `nilai`;

DROP TABLE IF EXISTS `tabel_mahasiswa`;
CREATE TABLE `tabel_mahasiswa` (
  `NIM` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `tanggal_lahir` date NOT NULL,
  PRIMARY KEY (`NIM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tabel_mahasiswa`;

DROP TABLE IF EXISTS `tabel_matakuliah`;
CREATE TABLE `tabel_matakuliah` (
  `kode_matakuliah` int(11) NOT NULL AUTO_INCREMENT,
  `nama_matakuliah` varchar(20) NOT NULL,
  `sks` int(2) NOT NULL,
  PRIMARY KEY (`kode_matakuliah`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tabel_matakuliah`;

-- 2022-06-20 17:13:48
