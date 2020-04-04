package com.mramirid.cegahcovid_19.helper

import com.mramirid.cegahcovid_19.model.CheckupQuestion

object CheckupQuestions {

    fun getCheckupQuestions(): ArrayList<CheckupQuestion> {
        val questions = arrayListOf<CheckupQuestion>()

        questions.add(
            CheckupQuestion(
                0,
                "Saya pergi keluar rumah",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                1,
                "Saya menggunakan transportasi umum: online, angkot, bus, taksi, kereta api",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                2,
                "Saya tidak memakai masker saat berkumpul dengan orang lain",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                3,
                "Saya berjabat tangan dengan orang lain",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                4,
                "Saya tidak membersihkan tangan dengan hand sanitizer / tisu basah sebelum pegang kemudi mobil / motor",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                5,
                "Saya menyentuh benda / uang yang juga disentuh orang lain",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                6,
                "Saya tidak menjaga jarak 1,5 meter dengan orang lain ketika: belanja, bekerja, belajar, ibadah",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                7,
                "Saya makan diluar rumah (warung / restoran)",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                8,
                "Saya tidak minum hangat & cuci tangan dengan sabun setelah tiba di tujuan",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                9,
                "Saya berada di wilayah kelurahan tempat pasien tertular",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                10,
                "Saya tidak pasang hand sanitizer di depan pintu masuk, untuk membersihkan tangan sebelum pegang gagang (handle) pintu masuk rumah",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                11,
                "Saya tidak mencuci tangan dengan sabun setelah tiba di rumah",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                12,
                "Saya tidak menyediakan: tisu basah / antiseptik, masker, sabun antiseptik bagi keluarga di rumah",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                13,
                "Saya tidak merendam baju & celana bekas pakai di luar rumah ke dalam air panas / sabun",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                14,
                "Saya tidak segera mandi keramas setelah saya tiba di rumah",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                15,
                "Saya tidak mensosialisasikan check list penilaian resiko pribadi ini kepada keluarga di rumah",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                16,
                "Saya dalam sehari tidak kena cahaya matahari minimal 15 menit",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                17,
                "Saya tidak jalan kaki / berolah raga minimal 30 menit setiap hari",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                18,
                "Saya jarang minum vitamin C & E serta kurang tidur",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                19,
                "Usia saya di atas 60 tahun",
                false,
                hasAnswered = false
            )
        )

        questions.add(
            CheckupQuestion(
                20,
                "Saya mempunyai penyakit: jantung / diabetes / gangguan pernafasan kronik",
                false,
                hasAnswered = false
            )
        )

        return questions
    }
}