package com.dicodingcourse.user.myappnegaraat;

import android.os.Parcel;

import java.util.ArrayList;

public class NegaraData {

    public static String[][] data = new String[][]{
            {"Indonesia", "Jakarta", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/450px-Flag_of_Indonesia.svg.png","Republik Indonesia atau Negara Kesatuan Republik Indonesia, atau lebih umum disebut Indonesia, adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia.","Indonesia Raya","Indonesia"},
            {"Malaysia", "Kuala Lumpur", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Flag_of_Malaysia.svg/125px-Flag_of_Malaysia.svg.png","Malaysia adalah sebuah negara federal[12] yang terdiri dari tiga belas negeri (negara bagian) dan tiga wilayah federal di Asia Tenggara dengan luas 329.847 km persegi.","Bersekutu Bertambah Mutu","Melayu"},
            {"Singapura", "Singapur", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Flag_of_Singapore.svg/125px-Flag_of_Singapore.svg.png","Singapura (nama resmi: Republik Singapura) adalah sebuah negara pulau di lepas ujung selatan Semenanjung Malaya, 137 kilometer (85 mi) di utara khatulistiwa di Asia Tenggara.","Majulah Singapura","Melayu"},
            {"Kamboja","Phnom Penh","https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Flag_of_Cambodia.svg/125px-Flag_of_Cambodia.svg.png","Kerajaan Kamboja adalah sebuah negara berbentuk monarki konstitusional di Asia Tenggara. Negara ini merupakan penerus Kekaisaran Khmer yang pernah menguasai seluruh Semenanjung Indochina antara abad ke-11 dan 14.","Nokor Reach","Khmer"},
            {"Laos","Vientiane","https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Flag_of_Laos.svg/125px-Flag_of_Laos.svg.png","Republik Demokratik Rakyat Laos adalah negara yang terkurung daratan di Asia Tenggara, berbatasan dengan Myanmar dan Republik Rakyat Tiongkok di sebelah barat laut, Vietnam di timur, Kamboja di selatan, dan Thailand di sebelah barat. Dari abad ke-14 hingga abad ke-18, negara ini disebut Lan Xang atau \"Negeri Seribu Gajah\".","Pheng Xat Lao","Lao"},
            {"Thailand","Bangkok","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Flag_of_Thailand.svg/125px-Flag_of_Thailand.svg.png","Kerajaan Thai (nama resmi Thai: ราชอาณาจักรไทย Ratcha Anachak Thai; atau Prathēt Thai), yang lebih sering disebut Thailand dalam bahasa Inggris, atau dalam bahasa aslinya Mueang Thai (dibaca: \"meng-thai\", sama dengan versi Inggrisnya, berarti \"Negeri Thai\"), adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat.","Phleng Chat Thai","Thai"},
            {"Vietnam","Hanoi","https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/125px-Flag_of_Vietnam.svg.png","Vietnam (Bahasa Vietnam: Việt Nam Chữ Nôm: 越南[viət˨ næm˧] ( simak)), bernama resmi Republik Sosialis Vietnam (Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam 共和社會主義越南) adalah negara paling timur di Semenanjung Indochina di Asia Tenggara. Vietnam berbatasan dengan Republik Rakyat Tiongkok di sebelah utara, Laos di sebelah barat laut, Kamboja di sebelah barat daya dan di sebelah timur terbentang Laut China Selatan.[9]"," Tiến Quân Ca","Kota Hồ Chí Minh"},
            {"Brunei Darussalam","Bandar Seri Begawan","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Flag_of_Brunei.svg/125px-Flag_of_Brunei.svg.png","Brunei Darussalam atau Brunei[10][11][12][13] Tentang suara ini dengarkan (bantuan·info) /bruːˈnaɪ/, nama resmi: Negara Brunei Darussalam, (bahasa Melayu: Negara Brunei Darussalam, Jawi: نڬارا بروني دارالسلام), adalah negara berdaulat di Asia Tenggara yang terletak di pantai utara pulau Kalimantan. Negara ini memiliki wilayah seluas 5.765 km² yang menempati pulau Borneo dengan garis pantai seluruhnya menyentuh Laut Cina Selatan. Wilayahnya dipisahkan ke dalam dua negara bagian di Malaysia yaitu Sarawak dan Sabah.","Allah Peliharakan Sultan","Melayu"},
            {"Filipina","Manila","https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_the_Philippines.svg/125px-Flag_of_the_Philippines.svg.png","Filipina atau Republik Filipina (bahasa Tagalog: Republika ng Pilipinas) adalah sebuah negara republik di Asia Tenggara, sebelah utara Indonesia, dan Malaysia. Filipina merupakan sebuah negara kepulauan yang terletak di Lingkar Pasifik Barat, negara ini terdiri dari 7.641 pulau. Selama ribuan tahun, warga kepulauan Filipina , dan pekerja keras ini telah mengembangkan sistem cocok tanam Padi yang sangat maju, yang menyediakan makanan pokok bagi masyarakatnya.","Lupang Hinirang","Filipino"},
            {"Timor Leste","Dili" ,"Pátria" ,"https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Flag_of_East_Timor.svg/125px-Flag_of_East_Timor.svg.png","Republik Demokratik Timor Leste (juga disebut Timor Lorosa'e), yang sebelum merdeka bernama Timor Timur, adalah sebuah negara kecil di sebelah utara Australia dan bagian timur pulau Timor. Selain itu wilayah negara ini juga meliputi pulau Kambing atau Atauro, Jaco, dan enklave Oe-Cusse Ambeno di Timor Barat.","Tetun"}
    };

    public static ArrayList<Negara> getListData(){
        Negara negara = null;
        ArrayList<Negara> list = new ArrayList<>();
        for (String[] aData : data) {
            negara = new Negara(Parcel.obtain());
            negara.setNegara(aData[0]);
            negara.setKota(aData[1]);
            negara.setBendera(aData[2]);
            negara.setContentDetail(aData[3]);
            negara.setLagukebangsaan(aData[4]);
            negara.setBahasakebangsaan(aData[5]);
            list.add(negara);
        }
        return list;
    }
}
