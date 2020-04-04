package com.mramirid.cegahcovid_19.helper

import com.mramirid.cegahcovid_19.R
import com.mramirid.cegahcovid_19.model.InfoCovid

object DataCovid {

    fun getInfoCovidList(): ArrayList<InfoCovid> {
        val infoCovidList = arrayListOf<InfoCovid>()

        infoCovidList.add(
            InfoCovid(
                0,
                "Apa itu virus Corona?",
                "Virus Corona atau severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2) adalah virus yang menyerang sistem pernapasan. Penyakit karena infeksi virus ini disebut COVID-19. Virus Corona bisa menyebabkan gangguan pada sistem pernapasan, pneumonia akut, sampai kematian.\n\n" +
                        "Severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2) yang lebih dikenal dengan nama virus Corona adalah jenis baru dari coronavirus yang menular ke manusia. Virus ini bisa menyerang siapa saja, baik bayi, anak-anak, orang dewasa, lansia, ibu hamil, maupun ibu menyusui.\n\n" +
                        "Infeksi virus ini disebut COVID-19 dan pertama kali ditemukan di kota Wuhan, Cina, pada akhir Desember 2019. Virus ini menular dengan cepat dan telah menyebar ke wilayah lain di Cina dan ke beberapa negara, termasuk Indonesia.\n\n" +
                        "Coronavirus adalah kumpulan virus yang bisa menginfeksi sistem pernapasan. Pada banyak kasus, virus ini hanya menyebabkan infeksi pernapasan ringan, seperti flu. Namun, virus ini juga bisa menyebabkan infeksi pernapasan berat, seperti infeksi paru-paru (pneumonia), Middle-East Respiratory Syndrome (MERS), dan Severe Acute Respiratory Syndrome (SARS).",
                R.drawable.ic_definition,
                R.drawable.coronavirus_image
            )
        )

        infoCovidList.add(
            InfoCovid(
                1,
                "Gejala COVID-19",
                "Infeksi virus Corona atau COVID-19 bisa menyebabkan penderitanya mengalami gejala flu, seperti demam, pilek, batuk, sakit tenggorokan, dan sakit kepala; atau gejala penyakit infeksi pernapasan berat, seperti demam tinggi, batuk berdahak bahkan berdarah, sesak napas, dan nyeri dada.\n\n" +
                        "Namun, secara umum ada 3 gejala umum yang bisa menandakan seseorang terinfeksi virus Corona, yaitu: Demam (suhu tubuh di atas 38 derajat Celcius), Batuk dan Sesak napas.\n\n" +
                        "Menurut penelitian, gejala COVID-19 muncul dalam waktu 2 hari sampai 2 minggu setelah terpapar virus Corona.",
                R.drawable.ic_alert,
                R.drawable.gejala_image
            )
        )

        infoCovidList.add(
            InfoCovid(
                2,
                "Kapan harus ke dokter?",
                "Segera ke dokter bila Anda mengalami gejala infeksi virus Corona (COVID-19), terutama jika gejala muncul 2 minggu setelah kembali dari daerah yang memiliki kasus COVID-19 atau berinteraksi dengan penderita infeksi virus Corona.\n\n" +
                        "Bila Anda mungkin terpapar virus Corona namun tidak mengalami gejala apa pun, Anda tidak perlu pergi ke rumah sakit untuk memeriksakan diri, cukup tinggal di rumah selama 14 hari dan membatasi kontak dengan orang lain.\n\n" +
                        "Aplikasi ini juga memiliki fitur untuk membantu Anda memeriksa risiko tertular virus Corona dengan lebih mudah. Untuk menggunakan fitur tersebut, silakan menuju ke tab checkup di halaman utama",
                R.drawable.ic_hospital,
                R.drawable.hospital_image
            )
        )

        infoCovidList.add(
            InfoCovid(
                3,
                "Penyebab COVID-19",
                "Infeksi virus Corona atau COVID-19 disebabkan oleh coronavirus, yaitu kelompok virus yang menginfeksi sistem pernapasan. Pada sebagian besar kasus, coronavirus hanya menyebabkan infeksi pernapasan ringan sampai sedang, seperti flu. Akan tetapi, virus ini juga bisa menyebabkan infeksi pernapasan berat, seperti pneumonia, Middle-East Respiratory Syndrome (MERS), dan Severe Acute Respiratory Syndrome (SARS).\n\n" +
                        "Ada dugaan bahwa virus Corona awalnya ditularkan dari hewan ke manusia. Namun, kemudian diketahui bahwa virus Corona juga menular dari manusia ke manusia.\n\n" +
                        "Seseorang dapat tertular COVID-19 melalui berbagai cara, yakni: tidak sengaja menghirup percikan ludah dari bersin atau batuk penderita COVID-19, memegang mulut atau hidung tanpa mencuci tangan terlebih dulu setelah menyentuh benda yang terkena cipratan air liur penderita COVID-19, kontak jarak dekat dengan penderita COVID-19, misalnya bersentuhan atau berjabat tangan.\n\n" +
                        "Virus Corona dapat menginfeksi siapa saja, tetapi efeknya akan lebih berbahaya atau bahkan fatal bila terjadi pada orang lanjut usia, ibu hamil, orang yang sedang sakit, atau orang yang daya tahan tubuhnya lemah.",
                R.drawable.ic_pemicu,
                R.drawable.covid_spread
            )
        )

        infoCovidList.add(
            InfoCovid(
                4,
                "Diagnosis COVID-19",
                "Untuk menentukan apakah pasien terinfeksi virus Corona, dokter akan menanyakan gejala yang dialami pasien. Dokter juga akan bertanya apakah pasien bepergian atau tinggal di daerah yang memiliki kasus infeksi virus Corona sebelum gejala muncul.\n\n" +
                        "Guna memastikan diagnosis COVID-19, dokter akan melakukan pemeriksaan lanjutan di antaranya: uji sampel darah, tes usap tenggorokan untuk meneliti sampel dahak (tes PCR) dan rontgen dada untuk mendeteksi infiltrat atau cairan di paru-paru",
                R.drawable.ic_search,
                R.drawable.diagnose_image
            )
        )

        infoCovidList.add(
            InfoCovid(
                5,
                "Pengobatan COVID-19",
                "Infeksi virus Corona atau COVID-19 belum bisa diobati, tetapi ada beberapa langkah yang dapat dilakukan dokter untuk meredakan gejalanya dan mencegah penyebaran virus, diantaranya: merujuk penderita COVID-19 untuk menjalani perawatan dan karatina di rumah sakit yang ditunjuk, memberikan obat pereda demam dan nyeri yang aman dan sesuai kondisi penderita, menganjurkan penderita COVID-19 untuk melakukan isolasi mandiri dan istirahat yang cukup, menganjurkan penderita COVID-19 untuk banyak minum air putih untuk menjaga kadar cairan tubuh.",
                R.drawable.ic_obat,
                R.drawable.drug_image
            )
        )

        infoCovidList.add(
            InfoCovid(
                6,
                "Komplikasi COVID-19",
                "Pada kasus yang parah, infeksi virus Corona bisa menyebabkan beberapa komplikasi serius diantaranya: Pneumonia, infeksi sekunder pada organ lain, gagal ginjal, Acute cardiac injury, Acute respiratory distress syndrome dan kematian",
                R.drawable.ic_split,
                R.drawable.complication_image
            )
        )

        infoCovidList.add(
            InfoCovid(
                7,
                "Pencegahan COVID-19",
                "Sampai saat ini, belum ada vaksin untuk mencegah infeksi virus Corona atau COVID-19. Oleh sebab itu, cara pencegahan yang terbaik adalah dengan menghindari faktor-faktor yang bisa menyebabkan Anda terinfeksi virus ini, diantaranya: hindari bepergian ke tempat-tempat umum yang ramai pengunjung (social distancing), gunakan masker saat beraktivitas di tempat umum atau keramaian, rutin mencuci tangan dengan air dan sabun atau hand sanitizer yang mengandung alkohol minimal 60% setelah beraktivitas di luar rumah atau di tempat umum, jangan menyentuh mata, mulut, dan hidung sebelum mencuci tangan, hindari kontak dengan hewan, terutama hewan liar. Bila terjadi kontak dengan hewan, cuci tangan setelahnya, masak daging sampai benar-benar matang sebelum dikonsumsi, tutup mulut dan hidung dengan tisu saat batuk atau bersin, kemudian buang tisu ke tempat sampah, hindari berdekatan dengan orang yang sedang sakit demam, batuk, atau pilek, jaga kebersihan benda yang sering disentuh dan kebersihan lingkungan.\n\n" +
                        "Untuk orang yang diduga terkena COVID-19 atau termasuk kategori ODP (orang dalam pemantauan), ada beberapa langkah yang bisa dilakukan agar virus Corona tidak menular ke orang lain, diantaranya: jangan keluar rumah, kecuali untuk mendapatkan pengobatan, periksakan diri ke dokter hanya bila Anda mengalami gejala gangguan pernapasan yang disertai demam atau memenuhi kriteria PDP (pasien dalam pengawasan), usahakan untuk tinggal terpisah dari orang lain untuk sementara waktu. Bila tidak memungkinkan, gunakan kamar tidur dan kamar mandi yang berbeda dengan yang digunakan orang lain, larang dan cegah orang lain untuk mengunjungi atau menjenguk Anda sampai Anda benar-benar sembuh, sebisa mungkin jangan melakukan pertemuan dengan orang yang sedang sedang sakit, hindari berbagi penggunaan alat makan dan minum, alat mandi, serta perlengkapan tidur dengan orang lain, pakai masker dan sarung tangan bila sedang berada di tempat umum atau sedang bersama orang lain, gunakan tisu untuk menutup mulut dan hidung bila batuk atau bersin, lalu segera buang tisu ke tempat sampah.",
                R.drawable.ic_check,
                R.drawable.checklist_image
            )
        )

        return infoCovidList
    }
}