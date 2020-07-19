package com.example.submissiondicoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<TourData> listTourData = new ArrayList<>();
    private final int endIndex = 300;
    private String[] caption = {
            "Jembatan Barelang (singkatan dari Batam, Rempang, dan Galang) adalah sekumpulan jembatan yang menghubungkan pulau-pulau yaitu Pulau Batam, Pulau Tonton, Pulau Nipah, Pulau Rempang, Pulau Galang dan Pulau Galang Baru di daerah Batam, provinsi Kepulauan Riau, Indonesia. Masyarakat setempat menyebutnya \"Jembatan Barelang\". Ada juga yang menyebutnya \"Jembatan Habibie\" sebagai bentuk penghargaan atas jasa beliau dalam mengembangkan pulau Batam sebagai pulau industri serta mempelopori pembangunan jembatan ini.\n" +
            "Jembatan Barelang merupakan ikon Kota Batam yang populer, khususnya bagi masyarakat Kepulauan Riau. Jembatan ini menjadi salah satu tujuan utama dalam berwisata di Pulau Batam. Jembatan Barelang terdiri dari enam buah jembatan, yaitu:\n" +
            "    1. Jembatan Tengku Fisabilillah (Jembatan I/Jembatan Barelang), jembatan terbesar & terpanjang\n" +
            "    2. Jembatan Nara Singa (Jembatan II)\n" +
            "    3. Jembatan Raja Ali Haji (Jembatan III)\n" +
            "    4. Jembatan Sultan Zainal Abidin (Jembatan IV)\n" +
            "    5. Jembatan Tuanku Tambusai (Jembatan V)\n" +
            "    6. Jembatan Raja Kecik (Jembatan VI)\n\n\n" +
            "Source : https://id.wikipedia.org/wiki/Jembatan_Barelang",

            "Pengungsian Rakyat Vietnam di Indonesia adalah pengungsian dari negara vietnam karena perang saudara di Vietnam. Perang yang berlangsung panjang pada akhirnya selalu menyebabkan kesengsaraan. Masyarakat umum yang sering tidak mengerti apa-apa akhirnya yang selalu menjadi korban. Untuk menyelamatkan diri, daripada bertahan di Vietnam. \n"+
            "Pulau Galang, salah satu wilayah Kepulauan Riau, ternyata menyimpan cerita menarik. Di sini, beberapa puluh tahun lalu, tepatnya tahun 1975 hingga 1996 berdiri kamp pengungsian Vietnam yang menyeberang menjadi manusia perahu akibat perang saudara.\n\n\n" +
                    "Source : https://id.wikipedia.org/wiki/Pengungsian_Rakyat_Vietnam_di_Indonesia",

            "Megawisata Ocarina Batam adalah sebuah tempat wisata pantai yang terletak di Pulau Batam, Kepulauan Riau. Tempat wisata ini diresmikan oleh Presiden Susilo Bambang Yudhoyono pada bulan Januari 2009[1]. Ocarina berada di lahan seluas 40 hektare berada di tepian Teluk Kering, dan komplek perumahan mewah Coastarina. terdapat pantai berpasir putih yang cantik dengan kerindangan pohon pinus, area taman bermain nak, panggung terbuka dengan kapasitas 10.000 orang dan taman menghijau dilengkapi gazebo dan jogging track.\n\n"+
            "Fasilitas\n" +
            " • Giant Wheel\n" +
            " • 360 Madness\n" +
            " • Spin Tower\n" +
            " • Happy Rocking bus\n" +
            " • Robot Rail\n" +
            " • Sky Runner\n" +
            " • Climbing Net\n" +
            " • Dizzy Paradise\n" +
            " • Aero Rail\n" +
            " • Bicycle rental\n" +
            " • Merry Go Round\n" +
            " • Flying Elephant\n" +
            " • Istana Balon\n" +
            " • Park Train\n" +
            " • Waterpark\n\n\n" +
            "Sumber : https://id.wikipedia.org/wiki/Mega_Wisata_Ocarina",

    "Pantai Tanjung Pinggir merupakan objek wisata dengan keindahan pantai yang dapat Anda temui di Indonesia. Tepatnya, pantai ini ada di kawasan Sekupang, Batam, Kepulauan Riau, Indonesia. Mungkin, beberapa dari Anda sudah ada yang tahu mengenai keberadaan pantai ini karena sering melakukan perjalanan ke negara tetangga, Singapura."+
    "Pertama, yang perlu dipahami adalah Batam masuk ke dalam area Kepulauan Riau dan sebagai daerah Kepulauan, wajar saja jika terdapat banyak pantai di dalamnya. Mungkin, sebelumnya Anda juga pernah mendengar Pantai Sekilak, Pantai Tanjung Bemban atau pantai – pantai lainnya yang juga ada di tempat yang sama, yaitu di Batam, Kepulauan Riau, Indonesia.\n" +
            "Akan tetapi, meski menawarkan objek wisata serupa, keindahan yang dirasakan tidak akan sama. Ini seperti Anda yang ditawari banyak minuman, namun dengan pilihan rasa yang berbeda, mulai dari rasa coklat, anggur, pisang, atau bahkan jeruk. Pantai juga kurang lebih sama seperti itu, karena sumber daya alamnya juga berbeda."+
    "Selain pemandangan yang nampak berasal dari Singapura, pemandangan alam yang dapat dinikmati pengunjung adalah pantai itu sendiri dengan pasirnya yang berwarna kecokatan namun bersih dan membentang sepanjang 250 meter mulai dari Timur hingga ke Barat. Belum lagi pemandangan laut dan langitnya yang tidak kalah cantik. Lengkap sudah keindahan pantai ini."+
    "Fasilitas Pantai Tanjung Pinggir\n" +
    "Fasilitas yang ditawarkan di pantai ini tidak begitu banyak. Kecuali bila Anda mau sedikit menyeberang ke Singapura, di sana fasilitas untuk wisatawan sangat lengkap dan tergolong mewah. Di pantai ini, Anda akan diajarkan untuk lebih menyatu dengan alam.\n" +
    "Hunting Foto di Wisata Ini\n" +
    "Baik dalam keadaan pasang maupun surut, pantai ini tetap menunjukkan pesonanya yang menggelitik untuk diabadikan dalam gallery kamera. Saat kondisi sedang surut, pantai akan terlihat lebih berbatu – batu dan akan terasa lebih lebar dan sangat lepas, sehingga timingnya pas untuk mencuri – curi barang beberapa gambar untuk dicetak ke dalam bentuk foto."+
    "Menikmati Keindahan Pantai Tanjung Pinggir\n" +
            "Jika tujuan Anda dapat ke pantai ini untuk mendapatkan ketentraman, Anda harus datang pagi – pagi. Karena saat pagi, terutama saat jam buka pantai, kondisi masih tidak terlalu ramai dan ombaknya juga cenderung tenang ditambah langit pagi juga masih terlihat sendu sehingga suasana akan terasa sangat damai.\n" +
            "Kemudian, saat hari beranjak agak siang, di mana matahari mulai meninggi, tentu waktu yang pas untuk berjemur ditemani semilir angin yang sesekali bertiup. Terkadang, pemandangan anak – anak yang saling berkejaran atau sekadar bermain istana pasir juga turut melengkapi pemandangan di Pantai Tanjung Pinggir.\n\n"+
            "Sumber: https://www.tempatwisata.pro/wisata/Pantai-Tanjung-Pinggir",

    "Kota Batam menyandang imej sebagai kota industrial, mulai dari garmen, elektronik, sampai galangan kapal. Ia juga menjadi kota pusat belanja murah, seperti barang-barang elektronik, hingga sebutan sebagai kota ‘ruli‘ (rumah liar) akibat tingginya arus migrasi dari berbagai daerah di Nusantara untuk mencari pekerjaan di kota ini. Namun, pada kenyataanya Kota Batam memiliki kawasan wisata alam yang layak diperhitungkan keberadaannya. Yakni, sebuah pantai yang terletak di bagian timur laut Pulau Batam. Pantai Nongsa namanya.\n" +
            "\n" +
            "Pantai Nongsa merupakan salah satu potensi wisata alam yang mampu menyedot wisatawan domestik maupun mancanegara untuk datang ke Kota Batam. Karena, pantai yang terletak di bagian timur laut Pulau Batam ini memadukan keindahan pantai dengan nuansa kota modern. Nama ‘nongsa‘ diadopsi dari nama seorang tokoh."+
    "Kini, Pantai Nongsa Tua telah menjelma sebagai kawasan rekreasi yang prestisius. Tempat ini juga merupakan sebuah kawasan yang selalu diperebutkan oleh para investor untuk membangun resort. Tak jarang penduduk lokal hanya bisa melihat resort eksklusif yang tak terjangkau harganya. \n\n\n" +
            "Sumber : https://www.wisatago.com/pantai-nongsa/",

    "Salah satu objek wisata yang memiliki panorama indah di Kota Batam, Kepulauan Riau adalah Bukit Senyum. Bukit yang berada di Tanjung Uncang, Kota Batam ini merupakan daerah perbukitan yang memiliki pemandangan memukau\n" +
            "Kota Batam memang kota yang kaya akan destinasi wisata. Hal inilah yang menjadi daya tarik tersendiri bagi wisatawan domestik dan luar negeri untuk mengunjungi Kota Batam. Dan hal ini juga yang menjadikan Kota Batam layak disebut sebagai Kota Wisata.\n" +
            "Panorama yang dihadirkan oleh bukit ini begitu memukau. Sejauh mata memandang, Anda yang sedang mengunjungi bukit ini akan melihat pemandangan seluruh Kota Batam yang terlihat dari atas bukit."+
    "Anda juga dapat menyaksikan bangunan-bangunan tinggi Singapura, kapal dan pesawat terbang yang lalu lalang dari Pelabuhan dan Bandara yang ada di Batam baik itu untuk menuju ke Batam ataupun dari Batam.\n" +
            "Selain itu, untuk pemandangan malam hari yang dihadirkan Bukit Senyum lebih memukau dari pada siang hari. Anda dapat melihat gemerlap Kota Batam dan Singapura dari atas ketinggian bukit.\n" +
            "Lampu-lampu yang dihasilkan dari kapal dan pesawat yang lalu lalang melewati bukit ini menambah kesan eksotis atas pemandangan malam hari yang dihadirkan oleh bukit ini."+
    "Fasilitas di Bukit Senyum\n" +
            "Fasilitas yang disediakan di bukit ini merupakan sejenis fasilitas nongkrong saja. Untuk fasilitas penginapan yang berada di sekitar daerah bukit ini masih belum ada. Jadi wisatawan yang mengunjungi bukit ini harus mencari penginapan yang sedikit agak jauh dari lokasi bukit.\n" +
            "Fasilitas nongkrong yang ada di Bukit Senyum diantaranya yaitu the peak pujasera, rumah makan tahu sumedang dan padang pusako, serta café dengan nama Sofonta. Anda bisa memilih tempat ternyaman sambil menikmati hidangan yang dipesan di beberapa warung yang ada di sekitar bukit."+
    "Hunting Foto di Bukit Senyum\n" +
            "Pemandangan memukau yang dihadirkan oleh tempat wisata ini bisa menjadi tempat yang tepat untuk dijadikan sebagai background foto Anda. Pemandangan gemerlap yang dihadirkan dari atas bukit bisa menjadi objek foto yang tepat.\n" +
            "Apalagi saat ini sedang marak upload foto-foto di tempat wisata keren di media sosial. Dan foto yang dihasilkan dari bukit yang berada di Kepulauan Riau ini bisa menjadi destinasi hunting foto yang bagus untuk Anda post di media sosial yang Anda miliki."+
    "Bukit Senyum terletak di Kota Batam, Kepulauan Riau. Untuk lebih tepat bukit ini berada di Kelurahan Tanjung Uncang, Kecamatan Batu Aji, Batam- Kepulauan Riau\n" +
            "Untuk menuju kawasan wisata ini bisa dengan mudah ditemukan lokasinya. Karena memang wisata ini sudah cukup terkenal di kalangan masyarakat setempat. Banyak kendaraan umum ataupun kendaraan warga setempat yang melintasi bukit ini.\n" +
            "Dan bagi Anda yang berasal dari luar kota ataupun luar negeri, untuk menuju bukit ini bisa dengan menggunakan kapal ataupun pesawat terbang yang nantinya akan berakhir di pelabuhan ataupun bandara yang berada di Batam.\n\n\n" +
            "Sumber :https://www.tempatwisata.pro/wisata/Bukit-Senyum\n",

    "Pantai Marina Batam adalah sebuah obyek wisata yang lokasinya terletak di dalam sebuah resort mewah, yakni di area Marina Water Front City. Resort tersebut juga merupakan kawasan resort termewah yang ada di pulau Batam, Kepulauan Riau.\n" +
            "Bagi Anda yang ingin melepas kepenatan serta ingin merefresh beban fikiran atau hanya sekedar bersantai sambil menikmati keindahan pantai, maka Pantai Marina di Batam ini bisa menjadi salah satu destinasi tujuan wisata Anda bersama keluarga. Terdapat beberapa arena permainan yang dapat Anda nikmati, juga tersedia beraneka macam sarana untuk olahraga."+
            "Pantai Marina di Batam menyediakan panorama keindahan pantai yang berpasir putih. Anda akan dimanjakan saat berlibur di pantai tersebut karena tempat wisata tersebut sudah di desain dengan baik serta sudah terkelola dengan baik yang siap untuk memanjakan para pengunjung yang datang. Selain menawarkan panorama keindahan pasir putih pantainya yang putih berkilauan, terdapat juga nyiur-nyiur yang melambai – lambai yang semakin menambah keindahan pantai tersebut.\n\n" +
            "Lokasi\n" +
            "Pantai Marina Batam terletak di Kawasan Marina Water Front City, Jalan KH Ahmad Dahlan, Kelurahan Tanjung Riau, Kecamatan Sekupang, Kota Batam, Kepulauan Riau 29432.\n\n\n" +
            "Sumber :https://wisatasumatera.com/pantai-marina-batam/",

    "Hutan Wisata Mata Kucing merupakan kebun binatang yang berada di kawasan Sekupang ini menjadi tempat wisata yang bisa dikunjungi oleh wisatawan. Kebun binatang ini sangat berbeda dengan kebanyakan kebun binatang yang pernah dikunjungi oleh wisatawa karena letaknya yang cukup istimewa" +
            "Pesona yang dimiliki oleh Hutan Wisata Mata Kucing ini sangat berbeda dengan wisata yang lain. Hutan ini juga dikenal sebagai kebun binatang yang berada ditengah hutan atau penduduk lokal mengenalnya dengan kebun binatang mini.\n" +
            "Kebun binatang ini menjadi sangat berbeda dengan kebun binatang biasanya, yakni letaknya yang berada ditengah hutan ditambah dengan kealamian dari hutan yang masih terjaga menjadi daya pikat untuk wisatawan. Daya pikat ini mengundang wisatawan untuk mengunjunginya dan menikmati wisata yang disediakan." +
            "Fasilitas di Hutan Wisata Mata Kucing\n" +
            "Wisata ini cukup memiliki fasilitas yang mendukung wisatawan saat berkunjung ke kebun binatang yang terletak di Hutan Wisata Mata Kucing. Terdapat gazebo untuk wisatawan beristirahat setelah menikmati keindahan yang tersaji di kebun binatang ini, meskipun dengan jumlah yang terbatas." +
            "Tips Berwisata ke Hutan Wisata Mata Kucing\n" +
            "Saat berkunjung ke Hutan Wisata Mata Kucing maka wisatawan juga perlu meyiapkan beberapa hal yang harus dibawa. Wisatawan perlu membawa perbekalan sendiri untuk dinikmati setelah mengelilingi kebun binatang ditengah hutan ini.\n" +
            "Meskipun kebun binatang menyediakan gazebo untuk wisatawan bersantai, wisatawan juga perlu untuk membawa tikar unutk digunakan saat istirahat dan juga saat wisatawan tidak memiliki kesempatan untuk menggunakan gazebo.\n" +
            "Jangan merusak lingkungan yang sudah terjaga dengan baik. Bukan hal yang mudah untuk tetap menjaga kondisi lingkungan agar tetap alami, maka wisatawan jangan merusaknya lindungilah dan jagalah agar tetap dengan kondisi alami.\n" +
            "Jam Buka dan Harga Tiket Masuk ke Hutan Wisata Mata Kucing\n" +
            "Pastikan wisatawan berkunjung saat dijam yang ditentukan, meskipun kebun binatang ini buka setiap hari hanya saja memiliki jadwal jam yakni buka ham 08.30 pagi dan tutup saat jam menunjukan 18.00 malam. Sediakan juga uang untuk membeli tiket masuk kebun binatang, dan cukup terjangkau yakni Rp 10.000 untuk dewasa dan Rp 5.000 untuk anak-anak.\n\n\n" +
            "Sumber : https://www.tempatwisata.pro/wisata/Hutan-Wisata-Mata-Kucing",

            "Kepulauan Riau (Kepri) punya destinasi wisata baru, Kebun Raya Batam, yang didirikan sekaligus untuk melindungi keanekaragaman hayati. " +
                    "Kebun Raya Batam diresmikan pada Sabtu sebagai rangkaian perayaan HUT Kota Batam ke-189. Acara peresmian ditandai dengan penanaman pohon nibun sebagai maskot Kebun Raya Batam serta pelepasan 189 ekor burung merpati.\n\n\n" +
                    "Sumber : https://www.cnnindonesia.com/gaya-hidup/20181223164446-269-355877/kebun-raya-batam-destinasi-wisata-baru-di-kepulauan-riau",

            "Telaga Bidadari sebagai objek wisata penuh misteri, legenda dan sejarah di Muka Kuning, Kota Batam, Kepulauan Riau di Sumatera. Berikut ringkasan singkat mengenai informasi tempat wisata alam tersebut mulai dari fasilitas hingga rute." +
                    "Fasilitas dan Akomodasi\n" +
                    "\n" +
                    "Telaga Bidadari di Batam merupakan sebuah kolam dengan pancuran alami, memungkinkan pengunjung untuk berenang dan bermain air sambil menikmati keindahan panoramanya yang alami. Tempat wisata ini masih tersembunyi di tengah sibuk dan teriknya Kota Batam, menjadikan tempat ini lebih spesial." +
                    "Objek wisata yang satu ini sendiri masih tersembunyi sehingga tidak banyak fasilitas yang ditawarkan karena daerah sekitar pun berupa pepohonan rimbun dan hutan rindang dengan kesan sejuk. Air terjun yang lebih mirip pancuran kecil di telaga ini pun masih terjaga keasriannya karena ada di hutan lindung." +
                    "Air terjun di telaga ini memiliki tinggi 3 meter sehingga wisatawan dapat melompat dari atas kebawah dengan lebih aman, namun tetap disarankan untuk berhati-hati karena tempat ini sendiri masih kurang pengawasan keamanan. Airnya sangat sejuk, jernih, segar dan bening, masih terjaga kebersihannya.\n" +
                    "\n\n" +
                    "Harga Tiket Masuk\n" +
                    "\n" +
                    "Kawasan yang masih alami dengan tempat yang cukup terpencil dan tersembunyi membuat area ini pun bebas dimasuki siapapun tanpa pungutan biaya masuk. Piknik dan menginap di area ini menggunakan tenda pun tidak dikenakan biaya asalkan pengunjung tidak meninggalkan banyak sampah di sekitar area.\n" +
                    "\n" +
                    "Selain itu karena tidak adanya penjual makanan atau warung-warung yang buka di wilayah sekitar air terjun membuat para wisatawan harus membawa makanan dan bekal sendiri. Fasilitas parkir kendaraan pun tidak ada sehingga pengunjung harus berjalan kaki menyusuri hutan lindung Mukakuning dahulu.\n" +
                    "\n" +
                    "Karena tak adanya fasilitas parkir yang memadai, pengunjung harap tidak memarkirkan kendaraannya di sembarang tempat. Atau supaya lebih aman dapat menitipkan kendaraan di area perumahan warga di Kampung Aceh dimana perkampungan ini berjarak sekitar 2 sampai 3 kilometer menuju lokasi air terjun." +
                    "Letak dan Lokasi\n" +
                    "\n" +
                    "Letak pancuran dan air terjun Telaga Bidadari ini berada di dalam hutan lindung Mukakuning, lebih tepatnya di daerah bernama Simpang Dam. Namun ada juga yang menyebutnya sebagai salah satu kawasan di Desa Kabil dengan nama kelurahan yang sama, di dalam Kecamatan Nongsa, Kota Batam." +
                    "Rute Menuju Pancur Telaga Bidadari\n" +
                    "\n" +
                    "Jalur menuju Telaga Bidadari ini sebenarnya tidak sulit tetapi mendekati hutan lindung, perjalanan akan semakin menantang karena melewati hutan dimana hanya ada jalur setapak. Pelancong yang membawa kendaraan bisa menuju Rusun Muka Kuning terlebih dahulu sebelum melanjutkan lagi dengan jalan kaki.\n\n" +
                    "Sumber :https://jejakpiknik.com/telaga-bidadari/"


    };







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvTour_id);
        recyclerView.setHasFixedSize(true);

        listTourData.add(new TourData("1. Jembatan Barelang",caption[0].substring(0,endIndex)+"...",caption[0],R.drawable.jembatan_balerang_batam));
        listTourData.add(new TourData("2. Camp Vietnam",caption[1].substring(0,endIndex)+"...",caption[1],R.drawable.camp_vietnam));
        listTourData.add(new TourData("3. Pantai Ocarina",caption[2].substring(0,endIndex)+"...",caption[2],R.drawable.ocarina));
        listTourData.add(new TourData("4. Pantai Tanjung Pinggir",caption[3].substring(0,endIndex)+"...",caption[3],R.drawable.pantai_tanjung_pinggir));
        listTourData.add(new TourData("5. Pantai Nongsa",caption[4].substring(0,endIndex)+"...",caption[4],R.drawable.pantai_nongsa));
        listTourData.add(new TourData("6. Bukit Senyum",caption[5].substring(0,endIndex)+"...",caption[5],R.drawable.bukit_senyum));
        listTourData.add(new TourData("7. Pantai Marina",caption[6].substring(0,endIndex)+"...",caption[6],R.drawable.pantai_marina));
        listTourData.add(new TourData("8. Wisata Mata Kucing",caption[7].substring(0,endIndex)+"...",caption[7],R.drawable.wisata_mata_kucing));
        listTourData.add(new TourData("9. Kebun Raya Batam",caption[8].substring(0,endIndex)+"...",caption[8],R.drawable.kebun_raya_batam));
        listTourData.add(new TourData("10. Telaga Bidadari",caption[9].substring(0,endIndex)+"...",caption[9],R.drawable.telaga_bidadari));

      //  private ArrayList<TourData> listTourData = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListTourAdapter listTourAdapter = new ListTourAdapter(listTourData);
        recyclerView.setAdapter(listTourAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.title_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.userDetails_id:
                userDetails();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void userDetails(){
        Intent userdetails = new Intent(MainActivity.this, UserDetails.class);
        startActivity(userdetails);
    }
}
