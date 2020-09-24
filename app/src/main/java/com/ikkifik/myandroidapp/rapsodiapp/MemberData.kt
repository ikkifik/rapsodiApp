package com.ikkifik.myandroidapp.rapsodiapp

object MemberData {
    private val memberNames = arrayOf(
        "Riska Amelia Putri",
        "Nurhayati",
        "Beby Chaesara Anadila",
        "Tan Zhi Hui Celine",
        "Cindy Hapsari Maharani Pujiantoro Putri",
        "Helisma Putri",
        "Feni Fitriyanti",
        "Shania Gracia",
        "Jinan Safa Safira",
        "Melati Putri Rahel Sesilia",
        "Nadila Cindi Wantari",
        "Shani Indira Natio")

    private val memberDetails = arrayOf(
        "Riska Amelia Putri (リスカ・アメリア・プトゥリ) (lahir di Banyumas, Jawa Tengah, 18 Maret 2000 (umur 20)[1] atau biasa dipanggil Amel adalah salah seorang anggota JKT48 asal Purwokerto yang saat ini berada di Team J.",
        "Nurhayati (lahir di Palembang, 18 Oktober 1997; umur 22 tahun) yang akrab dipanggil Aya (juga dikenal sebagai Aya JKT48 (selama menjadi anggota JKT48)) adalah salah seorang penyanyi Indonesia dan anggota generasi kelima tertua dari JKT48 yang berasal dari Palembang, Sumatra Selatan, Indonesia. Sebelumnya, Aya pernah gagal mengkuti audisi Generasi ke-4 dari JKT48. Saat ini, Aya resmi bergabung di Tim KIII sejak 21 Juli 2019.",
        "Beby Chaesara Anadila, S.Psi. (lahir di Bandung, 18 Maret 1998; umur 22 tahun) atau akrab dipanggil Beby, juga dikenal sebagai Beby JKT48 selama menjadi anggota JKT48 adalah salah seorang penyanyi dan penari Indonesia yang juga merupakan anggota JKT48 generasi pertama dan anggota tari dari sub-unit JKT48 Dance Project (sebagai leader) yang saat ini berada di Tim KIII sejak 1 Desember 2016.[1] Pada konser kelulusan Shania Junianatha 27 April 2019 lalu, Beby resmi menggantikan posisi Shania sebagai Kapten JKT48.",
        "Tan Zhi Hui Celine (Hanzi: 陈紫薇; Pinyin: Chén Zǐwēi; lahir di Johor Bahru, Johor, Malaysia, 21 Agustus 2001; umur 18 tahun) yang akrab dipanggil Celine (juga dikenal sebagai Celine JKT48 (selama menjadi anggota JKT48)) adalah seorang idol Malaysia-Indonesia dan anggota generasi keempat dari JKT48 yang berasal dari Johor, Malaysia. Saat ini, Celine resmi bergabung di Tim J sejak 1 Januari 2020 setelah di Tim T sejak 1 Desember 2016.",
        "Cindy Hapsari Maharani Pujiantoro Putri (lahir di Banyumas, Jawa Tengah, 13 September 1998; umur 21 tahun) atau disingkat sebagai Cindy Hapsari yang akrab dipanggil Cindy atau Cinhap (juga dikenal sebagai Cindy JKT48 (selama menjadi anggota JKT48)) adalah seorang penyanyi Indonesia dan anggota generasi keempat dari JKT48 yang saat ini resmi bergabung di Tim J sejak 1 Februari 2018. Waktu mengikuti audisi, Cindy berteman dekat dengan Jinan (dengan sebutan \"CiNan\"). Cindy, bersama Christi dan Jinan menyebutnya geng JCC, dan kerap membawakan cover dance.",
        "Helisma Mauludzunia Putri Kurnia atau singkatnya Helisma Putri (lahir di Bandung, 15 Juni 2000; umur 19 tahun) [1] yang akrab dipanggil Eli atau Ceu Eli adalah seorang anggota grup idola JKT48 dari generasi ketujuh. Saat ini, Eli berada di Team KIII.[2]\n" + "\n" + "Jikoushokai (perkenalan) Eli di JKT48 adalah Pang ! Pang ! – Si gadis penuh kejutan, penyebar virus kebahagiaan, panggil aku Eli!. Eli memiliki basis penggemar yang disebut Helismiley.",
        "Feni Fitriyanti lahir di Cianjur, 16 Januari 1999; umur 21 tahun yang akrab dipanggil Feni (juga dikenal sebagai Feni JKT48 (selama menjadi anggota JKT48)) adalah salah seorang penyanyi Indonesia dan anggota grup idola JKT48 Generasi ke-3 yang saat ini berada di Tim J sejak 1 Desember 2016. Feni memiliki postur 158 cm / 44 kg ini juga sebagai anggota sub-unit 4 Gulali.",
        "Shania Gracia atau akrab dipanggil Gracia (lahir di Jakarta, 31 Agustus 1999; umur 20 tahun) (juga dikenal sebagai Gracia JKT48 (selama menjadi anggota JKT48)) adalah salah seorang penyanyi Indonesia dan anggota grup idola JKT48 Generasi ketiga yang berasal dari Jakarta, Indonesia. Anggota JKT48 pengidola Álvaro Morata ini yang saat ini berada di Tim KIII sejak 1 Desember 2016. Gracia membuat video project dengan nama \"Sister Pro7ect\" bersama satu geng dengan Elaine dan Sofia, tetapi sayangnya Gracia ditinggal Elaine dan Sofia yang telah graduate dari JKT48 karena Sister Pro7ect resmi dibubarkan. Gracia yang memiliki postur 160 cm / 48 kg ini mempunyai banyak penggemar, salah satu yang mengidolakan Gracia adalah Stand Up Comedian Raditya Dika.",
        "Jinan Safa Safira (lahir di Jakarta, 8 Juni 1999; umur 21 tahun) atau akrab dipanggil Jinan (juga dikenal sebagai Jinan JKT48 (selama menjadi anggota JKT48)) adalah seorang penyanyi Indonesia dan anggota generasi keempat dari JKT48 yang saat ini resmi bergabung di Tim T sejak 1 Desember 2016. Waktu mengikuti audisi JKT48 Generasi keempat, Jinan berteman dekat bersama Cindy dengan sebutan \"CiNan\". Jinan menyukai musik, termasuk yang beraliran K-Pop, dan selalu mendengarkan musik setiap Sabtu dengan bertajuk Hashtag #SaturdayMusic melalui akun Twitter-nya. Jinan ini bersama Cindy dan Christi menyebutnya geng JCC dengan membawakan cover dance-nya.",
        "Melati Putri Rahel Sesilia (lahir di Jakarta, 1 Januari 2000; umur 20 tahun) yang akrab dipanggil Melati atau Meme (juga dikenal sebagai Melati JKT48 (selama menjadi anggota idol grup JKT48)) adalah seorang penyanyi Indonesia dan anggota generasi keempat dari idol grup JKT48 yang resmi bergabung di Tim T sejak 1 Desember 2016. Saat ini berada di Tim J sejak 1 Januari 2020.",
        "Nadila Cindi Wantari (lahir di Bogor, 23 September 1998; umur 21 tahun) atau akrab juga dipanggil Nadila atau Paw-Paw (juga dikenal sebagai Nadila JKT48 (selama menjadi anggota JKT48)) adalah salah seorang penyanyi Indonesia dan anggota dari grup idola JKT48 yang berasal dari Bogor, Jawa Barat. Nadila merupakan anggota generasi kedua JKT48 yang saat ini menjadi anggota resmi Tim J sejak tanggal 21 Juli 2019.",
        "Shani Indira Natio (lahir di Kebumen, 5 Oktober 1998; umur 21 tahun) atau akrab dipanggil Shani (juga dikenal sebagai Shani JKT48 (selama menjadi anggota JKT48)) adalah salah seorang penyanyi Indonesia dan anggota JKT48 yang berasal dari Yogyakarta, Indonesia. Shani yang mempunyai tinggi badan 166 cm dan berat 51 kg ini merupakan anggota generasi ketiga JKT48, yang saat ini berada di Tim KIII sejak 1 Desember 2016."
    )

    private val memberImages = intArrayOf(
        R.drawable.amel,
        R.drawable.aya,
        R.drawable.beby,
        R.drawable.celine,
        R.drawable.cindy,
        R.drawable.eli,
        R.drawable.feni,
        R.drawable.gracia,
        R.drawable.jinan,
        R.drawable.melati,
        R.drawable.nadila,
        R.drawable.shani
    )

    val listData: ArrayList<Member>
        get() {
            val list = arrayListOf<Member>()
            for (position in memberNames.indices) {
                val hero = Member()
                hero.name = memberNames[position]
                hero.detail = memberDetails[position]
                hero.photo = memberImages[position]
                list.add(hero)
            }
            return list
        }
}