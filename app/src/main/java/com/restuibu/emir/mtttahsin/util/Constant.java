package com.restuibu.emir.mtttahsin.util;

import com.restuibu.emir.mtttahsin.R;

import java.util.ArrayList;

public class Constant {
    public static int SPLASH_TIME_OUT = 3000;

    // hijaiyah layout
    public static final Integer[] index = {
            0, 1, 2, 3, 4, 5, 6,
            7, 8, 9, 10, 11, 12, 13,
            14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27
    };

    public static final Integer[] kalimat = {
            R.drawable.a_kalimat, R.drawable.ba_kalimat, R.drawable.ta_kalimat, R.drawable.tsa_kalimat, R.drawable.ja_kalimat, R.drawable.ha_kalimat, R.drawable.kho_kalimat,
            R.drawable.da_kalimat, R.drawable.dza_kalimat, R.drawable.dho_kalimat, R.drawable.ra_kalimat, R.drawable.za_kalimat, R.drawable.sa_kalimat, R.drawable.sya_kalimat, R.drawable.sho_kalimat,
            R.drawable.to_kalimat, R.drawable.zo_kalimat, R.drawable.ain_kalimat, R.drawable.go_kalimat, R.drawable.fa_kalimat, R.drawable.ko_kalimat,
            R.drawable.ka_kalimat, R.drawable.la_kalimat, R.drawable.ma_kalimat, R.drawable.na_kalimat, R.drawable.habesar_kalimat, R.drawable.wa_kalimat, R.drawable.ya_kalimat
    };

    public static final Integer[] record = {
            R.raw.alif_hamzah, R.raw.ba, R.raw.ta, R.raw.tsa, R.raw.ja, R.raw.ha_kecil, R.raw.kho,
            R.raw.dal, R.raw.dza, R.raw.ra, R.raw.za, R.raw.sa, R.raw.sya, R.raw.sho,
            R.raw.dho, R.raw.tho, R.raw.dzho, R.raw.aa, R.raw.gho, R.raw.fa, R.raw.qo,
            R.raw.kaf, R.raw.la, R.raw.mim, R.raw.na, R.raw.ha_besar, R.raw.waw, R.raw.yay
    };


    public static final Integer[] hijaiyah = {
            R.drawable.hamzah2, R.drawable.ba, R.drawable.ta, R.drawable.tsa, R.drawable.jim, R.drawable.ha, R.drawable.kha,
            R.drawable.dal, R.drawable.dzal, R.drawable.ra, R.drawable.za, R.drawable.sin, R.drawable.syin, R.drawable.sad,
            R.drawable.dad, R.drawable.tha, R.drawable.dhat, R.drawable.ain, R.drawable.ghain, R.drawable.fa, R.drawable.qaf,
            R.drawable.kaf, R.drawable.lam, R.drawable.mim, R.drawable.nun, R.drawable.haa, R.drawable.waw, R.drawable.ya,
    };

    public static final String[] nama_hijaiyah = {
            "Alif", "Ba", "Ta", "Tsa", "Jim", "ha", "Kho",
            "Dal", "Dzal", "Ro", "Zai", "Sin", "Syin", "Shod",
            "Dhod", "Tho", "Dzo", "Ain", "Ghoin", "Fa", "Qof",
            "Kaf", "Lam", "Mim", "Nun", "Ha", "Waw", "Ya"

    };

    public static final String[] makhraj = {
            "keluar dari pangkal tenggorokan setelah pita suara", "keluar dari kedua bibir tertutup rapat", "keluar dari ujung lidah bertemu gusi gigi seri atas", "ujung lidah bertemu dengan ujung gigi seri atas", "lidah bagian tengah bertemu langit-langit atas", "bagian tengah tenggorokan", "keluar dari ujung tenggorokan (dekat rongga mulut)",
            "keluar dari ujung lidah", "keluar dari ujung lidah bertemu ujung gigi seri atas", "keluar dari ujung lidah masuk sedikit ke punggung lidah bertemu gusi atas", "keluar dari ujung lidah dan ujung gigi seri bawah (tidak menyentuh)", "keluar dari ujung lidah dan ujung gigi seri bawah ( tidak bersentuhan)", "keluar dari lidah bagian tengah bertemu langit-langit atas (tidak bersentuhan)", "keluar dari ujung lidah dan ujung gigi seri bawah (tidak bersentuan)",
            "keluar dari sisi lidah(kiri atau kanan atau keduanya) dengan gigi -gigi graham dalam bagian atas", "keluar dari ujung lidah bertemu dengan gusi gigi seri bagian atas (langit-langit)", "keluar dari ujung lidah bertemu ujung gigi seri atas", "keluar dari tenggorokan bagian tengah", "keluar dari ujung tenggorokan (dekat rongga mulut)", "keluar dari ujung gigi atas bertemu dengan bibir bawah bagian dalam", "keluar dari pangkal lidah bagian atas bertemu langit-langit yg atas bagian daging lunak",
            "keluar dari pangkal lidah bagian bawah (dibawah makhroj qof) bertemua dengan langit atas yg lunak dan juga yg bertulang", "keluar dari ujung sisi lidah bertemu dengan gusi atas ( langit-langit atas bagian depan)", "keluar dari kedua bibir tertutup", "keluar dari ujung lidah bertemu gusi atas bagian depan", "keluar dari pangkal tenggorokan seperti hamzah (ء)", "keluar dari dua bibir terbuka dan monyong berbentuk bulat", "keluar dari bagian tengah lidah bertemu dengan langit-langit (tidak menyentuh)"
    };

    public static final String[] sifat = {
            "1. jahr\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. syiddah\n3. istifal\n4. infitah\n5. idzlaq\n6. qolqolah", "1. hams\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat\n6. qolqolah", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat", "1. hams\n2. rokhowah\n3. isti'la'\n4. infitah\n5. ishmat",
            "1. jahr\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat\n6. qolqolah", "1. jahr\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. tawassuth\n3. istifal/isti'la'\n4. infitah\n5. idzlaq\n6. inhirof\n7. takrir", "1. jahr\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. shofir", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. shofir", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. tafasysyi", "1. hams\n2. rokhowah\n3. isti'la\n4. ithbaq\n5. ishmat\n6. shofir",
            "1. jahr\n2. rokhowah\n3. isti'la'\n4. ithbaq\n5. ishmat\n6. istitholah", "1. jahr\n2. syiddah\n3. isti'la'\n4. ithbad\n5. ishmat\n6. qolqolah", "1. jahr\n2.rokhowah\n3. ist'la'\n4. ithbaq\n5. ishmat", "1. jahr\n2. tawassuth\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. rokhowah\n3. isti'la\n4. infitah\n5. ishmat", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. idzlaq", "1. jahr\n2. syiddah\n3. isti'la\n4. infitah\n5. ishmat\n6. qolqolah",
            "1. hams\n2. syiddah\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. tawassuth\n3. istifal\n4. infitah\n5. idzlaq\n6. inhirof", "1. jahr\n2. tawassuth\n3. istifal\n4. infitah\n5. idzlaq", "1. jahr\n2. tawassuth\n3. istifal\n4. infitah\n5. idzlaq", "1. hams\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat", "1. jahr\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. lin", "1. jahr\n2. rokhowah\n3. istifal\n4. infitah\n5. ishmat\n6. lin"

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
            "adapun sifat idzlaq dan ishmat bukan sifat cara pengucapan huruf tapi sifat lughowi (sifat untuk mengidentifikasi apakah kata tersebut bahasa arab atau bukan)",
            "Shofir; adalah suara yang muncul dari ujung lidah dan ujung gigi bawah terdengar seperti suara burung",
            "Qolqolah; suara memantul namun tidak sampai membuka mulut",
            "Liin; pengucapan waw dan ya sukun di dahului huruf berharakat fathah dengan lunak",
            "Inhirof; berbelok/ miring, yaitu berbeloknya udara yang akan keluar. untuk ro, udara berbelok dari sisi lidah menuju ujung lidah, sementara lam udara berbelok dari ujung lidah menuju sisi lidah",
            "Tafasy-syi; udara memnuhi rongga mulut disebabkan tengah lidah naik",
            "Isthitholah; memanjangnya suara dho (ض) disebabkan karena pergerakan sisi lidah bagian belakang menyentuh gigi graham dalam atas yg berjumlah lima buah"
    };


}
