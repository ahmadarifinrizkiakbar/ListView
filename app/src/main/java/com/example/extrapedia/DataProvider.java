package com.example.extrapedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.extrapedia.model.Hewan;
import com.example.extrapedia.model.KuraKura;
import com.example.extrapedia.model.Lebah;
import com.example.extrapedia.model.LumbaLumba;


public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<KuraKura> initDataKuraKura(Context ctx) {
        List<KuraKura> Kura = new ArrayList<>();
        Kura.add(new KuraKura("Kura - Kura Australia", "Aldabra",
                " Menjadi salah satu jenis kura-kura darat terbesar di Dunia, ukuran tubuh dari kura-kura yang memiliki tempurung kehitaman ini bisa mencapai 1.5 meter", R.drawable.kura_aldabra));
        Kura.add(new KuraKura("Kura - Kura Indonesia", "Asian Forest Tortoise",
                "jenis kura-kura satu ini termasuk jenis kura-kura peliharaan yang perawatannya cukup mudah. Ciri khas dari kura-kura ini adalah tempurungnya yang besar dan berwarna gelap serta memiliki permukaan yang licin.", R.drawable.kura_asian_forest_tortoise));
        Kura.add(new KuraKura("Kura - Kura Paraguay", "Cherry Head",
                "jenis kura-kura peliharaan yang berasal dari Brazil dan Paraguay ini terkenal akan kepalanya yang bulat dan berwarna jingga kemerahan seperti buah ceri.", R.drawable.kura_cherry_head));
        Kura.add(new KuraKura("Kura - Kura Afrika", "Leopard Tortoise",
                "Jenis kura-kura selanjutnya ini berasal dari Afrika dan terkenal akan kecantikan tempurungnya, kura-kura ini sangat sensitif terhadap perubahan cuaca dan iklim serta menyukai tempat-tempat yang hangat", R.drawable.kura_leopard_tortoise));
        Kura.add(new KuraKura("Kura - Kura India", "Indian Star",
                "kura-kura yang berasal dari India ini sangat mencolok karena pola tempurungnya yang membentuk pola seperti bintang.", R.drawable.kura_indian_star));
        Kura.add(new KuraKura("Kura - Kura Madagaskar", "Radiata",
                "Daya tarik utama kura-kura Radiata adalah pola tempurungnya yang merupakan perpaduan warna hitam dan warna kecokelatan yang kontras. ", R.drawable.kura_radiata));
        return Kura;
    }

    private static List<Lebah> initDataLebah(Context ctx) {
        List<Lebah> lebahs = new ArrayList<>();
        lebahs.add(new Lebah("Lebah Asia Selatan", "Apis Cerana",
                "Apis Cerana ini memiliki sifat yang agresif, dan produksi madu tidak banyak", R.drawable.apis_cerana));
        lebahs.add(new Lebah("Lebah Asia Timur", "Apis Mellifera",
                "Per tahun lebah madu Mellifera ini bisa memproduksi madu sampai 40 kg per tahun per koloni.", R.drawable.apis_mellifera));
        lebahs.add(new Lebah("Lebah Indonesia", "Apis Dorsata",
                "Apis Dorsata ini memiliki ukuran fisik yang lebih besar dan memiliki sengatan yang lebih kuat", R.drawable.apis_dorsata));
        lebahs.add(new Lebah("Lebah Flores", "Apis Florea",
                "Ini termasuk lebah yang langka. Ukurannya memang lebih kecil dibanding lebah madu lainnya, dan termasuk lebah liar. Sehingga tidak banyak yang bisa membudidayakannya.", R.drawable.apis_florea));
        lebahs.add(new Lebah("Lebah Indonesia", "Trigona Sp",
                "Lebah madu ini memiliki bentuk fisik yang berbeda, baik dari warna maupun ukurannya. Selain itu lebah Trigona termasuk lebah madu yang tidak memiliki sengat.", R.drawable.trigona_sp));
        return lebahs;
    }

    private static List<LumbaLumba> initDataLumbaLumba(Context ctx) {
        List<LumbaLumba> lumba = new ArrayList<>();
        lumba.add(new LumbaLumba("Lumba - Lumba Malaysia", "Lagenodelphis hosei Fraser",
                "Lumba-lumba Fraser memiliki ukuran tubuh antara 2-2,7 meter dengan berat 160-210 kg.", R.drawable.lumba_fraser));
        lumba.add(new LumbaLumba("Lumba - Lumba Australia", "Steno bredanensi",
                "Lumba-lumba ini merupakan genus Steno ini berukuran mencapai 2,6 meter dengan berat sekitar 160 kg.", R.drawable.lumba_gigikasar));
        lumba.add(new LumbaLumba("Lumba - Lumba Indonesia", "Stenella coeruleoalba",
                " Hewan berukuran 2,7 meter dengan berat mencapai 160 kg ini berstatus Least Concern.", R.drawable.lumba_hidungbelang));
        lumba.add(new LumbaLumba("Lumba - Lumba Amerika", "Tursiops truncatus",
                "Panjang tubuhnya sekitar 2-4 meter dengan berat antara 135-635 kg.", R.drawable.lumba_hidungbotol));
        lumba.add(new LumbaLumba("Lumba - Lumba Indo-Pasifik", "Stenella longirostris",
                " Memiliki tubuh relatif kecil dengan panjang sekitar 2 meter dan berat antara 59-77 kg.", R.drawable.lumba_pemintal));
        lumba.add(new LumbaLumba("Lumba - Lumba Samudra Atlantik", "Grampus griseus",
                "Jenis lumba-lumba ini cukup besar dengan panjang tubuh antara 2,6 – 4 meter dan berat antara 300 – 500 kg. ", R.drawable.lumba_risso));
        return lumba;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKuraKura(ctx));
        hewans.addAll(initDataLumbaLumba(ctx));
        hewans.addAll(initDataLebah(ctx));

    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
