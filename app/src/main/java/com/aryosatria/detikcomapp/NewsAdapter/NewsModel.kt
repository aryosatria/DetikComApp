package com.aryosatria.detikcomapp.NewsAdapter

import com.aryosatria.detikcomapp.R

data class news(var title: String, var desc: String, var deskripsi: String, var photo: Int)

object NewsModel {
    val newsList = listOf<news>(
        news("Jepang mengadakan Event Musim Gugur di Lapangan Besar",
              "detikcom | Selasa, 2 Juni 2020",
               "Jepang mengakan festival musim gugur di lapangan besar Jepang di hadiri oleh warga setempat",
        R.drawable.img_news1),

        news("Pantai Pangandaran menjadi larian untuk berlibur",
            "detikcom | Minggu, 31 Mei 2020",
            "Warga setempat mulai datang dan berlibur di pantai Pangandaran",
        R.drawable.img_news2),

        news("Bundaran HI lagi - lagi menjadi pusat untuk Demo",
            "detikcom | Senin, 1 Juni 2020",
            "Di Karenakan Walikota tidak memenuhi saran masyarakat tentang Banjir",
        R.drawable.img_news3),

        news("Bekasi Macet!! Dikarenakan Pabrik Nestle Terbakar",
            "detikcom | Rabu, 3 Juni 2020",
            "Dikarenakan arus pendek listrik PLN selepas hujan lebat",
        R.drawable.img_news4),

        news("Gubernur Jawa Barat berkerjasama dengan Tolak Angin",
            "detikcom | Senin, 5 Juni 2020",
            "Ridwan Kamil berkerjasama untuk membagikan obat untuk masyarakat",
        R.drawable.img_news5),

        news("Korupsi 1 Miliyar Polisi sigap",
            "detikcom | Senin, 6 Juni 2020",
            "Polisi langsung dateng ke rumah pelaku jam 6 pagi",
        R.drawable.img_news6),

        news("Donald Trump tidak mau mentandatangani surat damai untuk Palestina",
            "detikcom | Senin, 6 Juni 2020",
            "Trump tidak mau mentandatangani surat damai karena bekerjasama bersamaa Israel",
        R.drawable.img_news7),

        news("Rakyat Amerika demo karena kematia Georger Floyd",
            "detikcom | Senin, 9 Juni 2020",
            "Dikarenakan Polisi menuduh kulit hitam dan mencekiknya hingga tewas",
        R.drawable.img_news8),

        news("Arab Saudi memberikan kuota untuk haji",
            "detikcom | Senin, 12 Juni 2020",
            "Arab Saudi",
        R.drawable.img_news9)
    )
}