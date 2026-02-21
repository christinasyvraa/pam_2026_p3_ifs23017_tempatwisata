package org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.data
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.R

object DummyData {
    fun getPlantsData(): List<PlantData> {
        return listOf(

            PlantData(
                nama = "Candi Borobudur",
                gambar = R.drawable.img_candi_borobudur,
                deskripsi = "Candi Buddha terbesar di dunia yang menjadi salah satu warisan budaya UNESCO.",
                lokasi = "Magelang, Jawa Tengah"
            ),

            PlantData(
                nama = "Danau Kelimutu",
                gambar = R.drawable.img_danau_kelimutu,
                deskripsi = "Danau dengan tiga warna air yang unik dan berubah-ubah.",
                lokasi = "Flores, Nusa Tenggara Timur"
            ),

            PlantData(
                nama = "Danau Toba",
                gambar = R.drawable.img_danau_toba,
                deskripsi = "Danau vulkanik terbesar di Asia Tenggara dengan Pulau Samosir di tengahnya.",
                lokasi = "Sumatera Utara"
            ),

            PlantData(
                nama = "Gunung Bromo",
                gambar = R.drawable.img_gunung_bromo,
                deskripsi = "Gunung berapi aktif yang terkenal dengan pemandangan matahari terbitnya.",
                lokasi = "Jawa Timur"
            ),

            PlantData(
                nama = "Labuan Bajo",
                gambar = R.drawable.img_labuan_bajo,
                deskripsi = "Destinasi wisata bahari dengan pemandangan laut yang indah.",
                lokasi = "Nusa Tenggara Timur"
            ),

            PlantData(
                nama = "Nusa Penida",
                gambar = R.drawable.img_nusa_peninda,
                deskripsi = "Pulau dengan tebing dan pantai eksotis seperti Kelingking Beach.",
                lokasi = "Bali"
            ),

            PlantData(
                nama = "Pulau Komodo",
                gambar = R.drawable.img_pulau_komodo,
                deskripsi = "Habitat asli hewan Komodo yang terkenal di dunia.",
                lokasi = "Nusa Tenggara Timur"
            ),

            PlantData(
                nama = "Pura Ulun Danu Beratan",
                gambar = R.drawable.img_pura_ulun_beratan,
                deskripsi = "Pura yang terletak di tepi Danau Beratan dengan pemandangan indah.",
                lokasi = "Bedugul, Bali"
            ),

            PlantData(
                nama = "Raja Ampat",
                gambar = R.drawable.img_raja_ampat,
                deskripsi = "Surga bawah laut dengan keanekaragaman hayati laut terbaik di dunia.",
                lokasi = "Papua Barat"
            ),

            PlantData(
                nama = "Uluwatu",
                gambar = R.drawable.img_uluwatu,
                deskripsi = "Tebing tinggi dengan pura dan pemandangan sunset yang indah.",
                lokasi = "Bali"
            )
        )
    }
}

