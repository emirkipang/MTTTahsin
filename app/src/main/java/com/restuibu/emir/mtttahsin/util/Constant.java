package com.restuibu.emir.mtttahsin.util;

import com.restuibu.emir.mtttahsin.R;

import java.util.ArrayList;

public class Constant {
    public static int SPLASH_TIME_OUT = 3000;

    // hijaiyah layout
    public static final Integer[] index = {
            6, 5, 4, 3, 2, 1, 0,
            13, 12, 11, 10, 9, 8, 7,
            20, 19, 18, 17, 16, 15, 14,
            27, 26, 25, 24, 23, 22, 21,
    };

    public static final Integer[] kalimat = {
            R.drawable.kho_kalimat, R.drawable.ha_kalimat, R.drawable.ja_kalimat, R.drawable.tsa_kalimat, R.drawable.ta_kalimat, R.drawable.ba_kalimat, R.drawable.a_kalimat,
            R.drawable.sho_kalimat, R.drawable.sya_kalimat, R.drawable.sa_kalimat, R.drawable.za_kalimat, R.drawable.ra_kalimat, R.drawable.dza_kalimat, R.drawable.da_kalimat,
            R.drawable.ko_kalimat, R.drawable.fa_kalimat, R.drawable.go_kalimat, R.drawable.ain_kalimat, R.drawable.zo_kalimat, R.drawable.to_kalimat, R.drawable.dho_kalimat,
            R.drawable.ya_kalimat, R.drawable.wa_kalimat, R.drawable.habesar_kalimat, R.drawable.na_kalimat, R.drawable.ma_kalimat, R.drawable.la_kalimat, R.drawable.ka_kalimat
    };

    public static final Integer[] record = {
            R.raw.kho, R.raw.ha_kecil, R.raw.ja, R.raw.tsa, R.raw.ta, R.raw.ba, R.raw.alif_hamzah,
            R.raw.sho, R.raw.sya, R.raw.sa, R.raw.za, R.raw.ra, R.raw.dza, R.raw.dal,
            R.raw.qo, R.raw.fa, R.raw.gho, R.raw.aa, R.raw.dzho, R.raw.tho, R.raw.dho,
            R.raw.yay, R.raw.waw, R.raw.ha_besar, R.raw.na, R.raw.mim, R.raw.la, R.raw.kaf

    };
    public static final Integer[] hijaiyah = {
            R.drawable.kha, R.drawable.ha, R.drawable.jim, R.drawable.tsa, R.drawable.ta, R.drawable.ba, R.drawable.hamzah2,
            R.drawable.sad, R.drawable.syin, R.drawable.sin, R.drawable.za, R.drawable.ra, R.drawable.dzal, R.drawable.dal,
            R.drawable.qaf, R.drawable.fa, R.drawable.ghain, R.drawable.ain, R.drawable.dhat, R.drawable.tha, R.drawable.dad,
            R.drawable.ya, R.drawable.waw, R.drawable.haa, R.drawable.nun, R.drawable.mim, R.drawable.lam, R.drawable.kaf
    };

    public static final String[] nama_hijaiyah = {
            "Kho", "ha", "Jim", "Tsa", "Ta", "Ba", "Alif",
            "Shod", "Syin", "Sin", "Zai", "Ro", "Dzal", "Dal",
            "Qof", "Fa", "Ghoin", "Ain", "Dzo", "Tho", "Dhod",
            "Ya", "Waw", "Ha", "Nun", "Mim", "Lam", "Kaf"
    };

    public static final String[] makhraj = {
            "keluar dari ujung tenggorokan (dekat rongga mulut)", "bagian tengah tenggorokan", "lidah bagian tengah bertemu langit-langit atas", "ujung lidah bertemu dengan ujung gigi seri atas", "keluar dari ujung lidah bertemu gusi gigi seri atas", "keluar dari kedua bibir tertutup rapat", "keluar dari pangkal tenggorokan setelah pita suara",
            "keluar dari ujung lidah dan ujung gigi seri bawah (tidak bersentuan)", "keluar dari lidah bagian tengah bertemu langit-langit atas (tidak bersentuhan)", "keluar dari ujung lidah dan ujung gigi seri bawah ( tidak bersentuhan)", "keluar dari ujung lidah dan ujung gigi seri bawah (tidak menyentuh)", "keluar dari ujung lidah masuk sedikit ke punggung lidah bertemu gusi atas", "keluar dari ujung lidah bertemu ujung gigi seri atas", "keluar dari ujung lidah, serta menepati dengan pangkal dua gigi seri yang atas",
            "keluar dari pangkal lidah bagian atas bertemu langit-langit yg atas bagian daging lunak", "keluar dari ujung gigi atas bertemu dengan bibir bawah bagian dalam", "keluar dari ujung tenggorokan (dekat rongga mulut)", "keluar dari tenggorokan bagian tengah", "keluar dari ujung lidah bertemu ujung gigi seri atas", "keluar dari ujung lidah bertemu dengan gusi gigi seri bagian atas (langit-langit)", "keluar dari sisi lidah(kiri atau kanan atau keduanya) dengan gigi -gigi graham dalam bagian atas",
            "keluar dari bagian tengah lidah bertemu dengan langit-langit (tidak menyentuh)", "keluar dari dua bibir terbuka dan monyong berbentuk bulat", "keluar dari pangkal tenggorokan seperti hamzah (ء)", "keluar dari ujung lidah bertemu gusi atas bagian depan", "keluar dari kedua bibir tertutup", "keluar dari ujung sisi lidah bertemu dengan gusi atas ( langit-langit atas bagian depan)", "keluar dari pangkal lidah bagian bawah (dibawah makhroj qof) bertemua dengan langit atas yg lunak dan juga yg bertulang"


    };

    public static final String[] sifat = {
            "1. hams\n2. rokhowah\n3. isti'la'\n4. infitah\n5. ishmat", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat\n6. qolqolah", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat", "1. hams\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. syiddah\n3. istifal\n4. infitah\n5. idzlaq\n6. qolqolah", "1. jahr\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat",
            "1. hams\n2. rokhowah\n3. isti'la\n4. ithbaq\n5. ishmat\n6. shofir", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. tafasysyi", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. shofir", "1. jahr\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. shofir", "1. jahr\n2. tawassuth\n3. istifal/isti'la'\n4. infitah\n5. idzlaq\n6. inhirof\n7. takrir", "1. jahr\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat\n6. qolqolah",
            "1. jahr\n2. syiddah\n3. isti'la\n4. infitah\n5. ishmat\n6. qolqolah", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. idzlaq", "1. jahr\n2. rokhowah\n3. isti'la\n4. infitah\n5. ishmat", "1. jahr\n2. tawassuth\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2.rokhowah\n3. ist'la'\n4. ithbaq\n5. ishmat", "1. jahr\n2. syiddah\n3. isti'la'\n4. ithbad\n5. ishmat\n6. qolqolah", "1. jahr\n2. rokhowah\n3. isti'la'\n4. ithbaq\n5. ishmat\n6. istitholah",
            "1. jahr\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. lin", "1. jahr\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. lin", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. tawassuth\n3. istifal\n4. infitah\n5. idzlaq", "1. jahr\n2. tawassuth\n3. istifal\n4. infitah\n5. idzlaq", "1. jahr\n2. tawassuth\n3. istifal\n4. infitah\n5. idzlaq\n6. inhirof", "1. hams\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat"
    };

    // sosmed layout
    public static final String[] sosmed_desc_about = {
            "fb.com/majelistaklimtelkomsel", "@mttelkomsel", "mt_telkomsel", "www.youtube.com/taklimtelkomsel", "www.mtt.or.id"
    };
    public static final Integer[] sosmed_img_about = {
            R.drawable.ic_facebook, R.drawable.ic_twitter, R.drawable.ic_instagram, R.drawable.ic_youtube, R.drawable.ic_browser
    };
    public static final String[] sosmed_url_about = {
            "https://www.facebook.com/majelistaklimtelkomsel", "https://twitter.com/mttelkomsel", "https://www.instagram.com/mt_telkomsel/", "http://www.youtube.com/taklimtelkomsel", "http://www.mtt.or.id"
    };

    // konten layout
    public static final String[] konten_desc_about = {
            "Ust. Nurkholis Asy'ary, Lc. Al-Hafidz"
    };
    public static final Integer[] konten_img_about = {
            R.drawable.ic_ustadz
    };

    // donasi layout
    public static final String[] donasi = {
            "Zakat BNI Syariah 811813812",
            "Infaq BNI Syariah 8118118139",
            "USSD Tcash *800*688#"
    };


    // help sifat pop up dialog
    public static final String[] detil_sifat = {
            "Hams; keluar nafas ketika mengucapkan huruf, untuk memastikan keluar nafas atau tdk, cobalah huruf-huruf hams dibaca sukun dan di dahului dengan huruf Hamzah berharakat (أ ف). huruf hams ada 10. (ف ح ث ه ش خ ص س ك ت )",
            "Jahr; lawan sifat hams, adalah tertahannya nafas/udara ketika mengucapkan huruf-huruf jahr. Khususnya ketika huruf-huruf tersebut sukun pastikan tdk ada nafas yg keluar, huruf-huruf jahr adalah selain huruf hams yg sepuluh",
            "Syiddah; tekanan ke makroj kuat sehingga tidak menimbulkan durasi suara yg lama",
            "Rokhowah; lawan dari syiddah, tekanan ke makhroj tidak  kuat/lemah sehingga menimbulkan durasi suara yag lama",
            "Tawassuth; adalah sifat antara syiddah dan rokhowah tidak kuat dan tidak lemah",
            "Isti'la; pangkal lidah diangkat menuju langit-langit sehingga menimbulkan suara tebal",
            "Istifal; adalah lawan sifat isti'la, yaitu pangkal lidah tidak naik atau sejajar dengan ujung lidah sehingga menimbulkan suara tipis",
            "Ithbaq; suara terkurung antara lidah dan langit-langit karena sebagian besar anggota lidah naik ke langit-langit",
            "Infitah; lawan dari ithbaq, yaitu bagian depan lidah tidak terangkat ke langit-langit",
            "adapun sifat idzlaq dan ithbaq bukan sifat cara pengucapan huruf tapi sifat lughowi (sifat untuk mengidentifikasi apakah kata tersebut bahasa arab atau bukan)",
            "Shofir; adalah suara yang muncul dari ujung lidah dan ujung gigi bawah terdengar seperti suara burung",
            "Qolqolah; suara memantul namun tidak sampai membuka mulut",
            "Liin; pengucapan waw dan ya sukun di dahului huruf berharakat fathah dengan lunak",
            "Inhirof; berbelok/ miring, yaitu berbeloknya udara yang akan keluar. untuk ro, udara berbelok dari sisi lidah menuju ujung lidah, sementara lam udara berbelok dari ujung lidah menuju sisi lidah",
            "Tafasy-syi; udara memnuhi rongga mulut disebabkan tengah lidah naik",
            "Isthitholah; memanjangnya suara dho (ض) disebabkan karena pergerakan sisi lidah bagian belakang menyentuh gigi graham dalam atas yg berjumlah lima buah"
    };



}
