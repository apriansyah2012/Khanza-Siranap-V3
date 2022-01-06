

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for siranap_ketersediaan_kamar_c19
-- ----------------------------
DROP TABLE IF EXISTS `siranap_ketersediaan_kamar_c19`;
CREATE TABLE `siranap_ketersediaan_kamar_c19`  (
  `ID_RUANG` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NAMA_RUANG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `KATEGORI` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `KELAS` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `KAPASITAS` int(11) NULL DEFAULT NULL,
  `tersedia` int(11) NULL DEFAULT NULL,
  `antrian` int(11) NULL DEFAULT NULL,
  `terpakai` int(11) NULL DEFAULT NULL,
  `COVID` int(11) NULL DEFAULT 0,
  `ID_RSONLINE` int(11) NULL DEFAULT NULL,
  `PREPARE` int(11) NULL DEFAULT NULL,
  `PREPARE_PLAN` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ID_RUANG`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
