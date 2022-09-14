package com.example.latihantopic1chapter4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BeritaViewModel : ViewModel(){

    val listBerita = arrayListOf(
                DataClassBerita(R.drawable.kpu, "KPU Siap Jika Diadukan ke PTUN oleh 9 Parpol Tak Lolos Pemilu 2024", "Karin Nur Secha", "Selasa, 13 Sep 2022 16:56 WIB", "Bawaslu tak meloloskan sembilan partai politik ke proses pendaftaran Pemilu 2024. Menanggapi hal tersebut, Ketua Divisi Hukum dan Pengawasan KPU RI, Mochammad Afifuddin menyebut jika apa yang dilakukan KPU saat proses pendaftaran sudah benar."),
                DataClassBerita(R.drawable.brigadir, "Disanksi Demosi 2 Tahun Terkait Kasus Sambo, Brigadir Frillyan Tak Banding", "Azhar Bagas Ramadhan ", "Rabu, 14 Sep 2022 13:21 WIB", "Brigadir Frillyan Fitri Rosadi (FF) dijatuhi sanksi demosi 2 tahun karena terbukti tidak profesional terkait kasus pembunuhan Brigadir Nopriansyah Yosua Hutabarat (Brigadir J). Brigadir Frillyan tak mengajukan banding atas putusan tersebut."),
                DataClassBerita(R.drawable.pengacara,"Pihak Putri Candrawathi Jelaskan Fungsi Rekening Khusus Bripka RR-Brigadir J","Azhar Bagas Ramadhan","Rabu, 14 Sep 2022 12:38 WIB","Pengacara Putri Candrawathi, Arman Hanis, menjelaskan fungsi rekening khusus yang dibuat untuk para ajudan Irjen Ferdy Sambo. Rekening itu, menurut Arman, dibuat untuk keperluan tugas masing-masing ajudan."),
                DataClassBerita(R.drawable.sambo,"Terungkap Alasan Ferdy Sambo Kumpulkan Bawahan Usai Bunuh Brigadir J","tim detikNews ", "Rabu, 14 Sep 2022 05:46 WIB", "Terungkap alasan mantan Kadiv Propam Irjen Ferdy Sambo mengumpulkan bawahannya di Provos usai pembunuhan Brigadir Nofriansyah Yosua Hutabarat atau Brigadir J. Seperti diungkapkan pengacara Bripka Ricky Rizal (RR), Erman Umar." ),
                DataClassBerita(R.drawable.img, "Melihat Isi Garasi Menteri 'Termiskin' di Kabinet Jokowi","Tim detikOto","Selasa, 13 Sep 2022 05:00 WIB", "Menteri Koperasi dan UKM pada Kabinet Indonesia Maju, Teten Masduki, memiliki harta kekayaan Rp 4.289.787.787. Meski berharta miliaran, Teten masuk dalam daftar menteri Jokowi 'termiskin'. Berdasarkan penelusuran dari laman Laporan Kekayaan Penyelenggaran Negara (LHKPN) untuk seluruh menteri, harta yang dimiliki Teten memang yang paling sedikit."),
                DataClassBerita(R.drawable.img_1,"TNI Buka Rekrutmen Perwira Prajurit Karier 2022, Lulusan D4-S2 Merapat!","Tim detikFinance","Senin, 12 Sep 2022 13:05 WIB", "Peluang terbuka bagi detikers yang ingin berkarier menjadi bagian dari Tentara Nasional Indonesia (TNI). Saat ini, TNI tengah membuka penerimaan Perwira Prajurit Karier (Pa PK) reguler tahun angkatan (TA) 2022. Dinukil dari laman resmi Rekrutmen TNI (Senin, 12/9/2022), pendaftaran ini dibuka dari 9 September 2022 hingga 21 Oktober 2022."),
                DataClassBerita(R.drawable.anies,"Bulan Depan Lengser dari Gubernur DKI, Anies Dapat Uang Pensiun Segini","Ignacio Geordi Oswaldo","Rabu, 14 Sep 2022 13:33 WIB","Masa jabatan Gubernur DKI Jakarta Anies Baswedan akan selesai pada Oktober 2022 mendatang,. Anies sempat berkelakar bahwa dirinya mungkin tidak akan memperpanjang masa jabatannya."),
                DataClassBerita(R.drawable.img_2, "Terkuak Motif Hacker Bjorka Serang Indonesia!", "Tim detiknet", "Minggu, 11 Sep 2022 22:25 WIB","Hacker Bjorka mengungkapkan motifnya menyerang sistem Pemerintah Indonesia. Bjorka membeberkan motif dari aksinya itu lantaran orang terdekatnya menjadi korban kebijakan Orde Baru pasca 1965"),
                DataClassBerita(R.drawable.img_3,"Berulah lagi, hacker Bjorka senggol Puan Maharani-Erick Thohir!","Tim detiknet","Minggu, 11 Sep 2022 17:48 WIB","Hacker Bjorka kembali membuat gempar Indonesia. Tak cukup membocorkan data pribadi warga Indonesai hingga dokumen Presiden Jokowi hingga Badan Intelijen Negara (BIN), kini ia turut menyenggol para pejabat tinggi Indonesia"),
                DataClassBerita(R.drawable.img_4,"Diduga karena obat nyamuk, rumah pensiunan pns di jembrana terbakar","I Ketut Suardika","Rabu, 14 Sep 2022 14:14 WIB","Satu unit rumah milik warga seorang pensiunan PNS di Desa Gumbrig ludes terbakar, pada selasa (13/9/2022) sekitar pukul 12.10 Wita. Kebakaran diduga karena obat nyamuk bakar yang dinyalakan pada senin malam sejak pukul 23.00 Wita.")


    )

    val beritaList : MutableLiveData<List<DataClassBerita>> = MutableLiveData()

    fun getBerita(){
        var berita = listBerita
        beritaList.value = berita
    }

}