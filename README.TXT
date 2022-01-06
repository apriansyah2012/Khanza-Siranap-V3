


	Software ini adalah Software Menejemen Rumah Sakit/Klinik/
  Puskesmas yang  gratis, open source dan boleh digunakan siapa saja tanpa dikenai 
  biaya apapun.  Hal yang tidak boleh dilakukan adalah memperjualbelikan/mengambil 
  keuntungan dari Software ini dalam bentuk apapun tanpa seijin pembuat 
  software  (Khanza.Soft Media). 
  
  Licensi yang dianut di software ini https://en.wikipedia.org/wiki/Aladdin_Free_Public_License

  Informasi dan panduan bisa dicek di halaman https://github.com/mas-elkhanza/SIMRS-Khanza/wiki
  
  Hasil build/Software jadi bisa di download di https://drive.google.com/drive/folders/0ByL--Jg6bdF7RG1NSlVTT2ZPODg 

  Bagi yang ingin berdonasi untuk pengembangan SIMRS Khanza bisa lewat BSI 1015369872 atas nama Windiarto

Silahkan Tambahkan tabel berikut :

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
