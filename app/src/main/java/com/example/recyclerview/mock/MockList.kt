package com.example.recyclerview.mock

import com.example.recyclerview.R
import com.example.recyclerview.model.ItemModel

object MockList {

    fun getMockedItemList(): List<ItemModel> {
        val itemModel1 = ItemModel(
            R.drawable.facebook,
            "FACEBOOK",
            "2003 yılının sonlarına doğru Mark Zuckerberg tarafından yazılmaya başlanan Facebook'un ilk olarak amacı, " +
                    "Columbia Üniversitesi başta olmak üzere çeşitli Amerikan üniversitelerindeki öğrenciler arasındaki bağlantıyı güçlendirmekti." +
                    " Üniversitelere yayılmaya başladıktan sonra, finansman, medya gibi noktalara odaklanılarak Facebook'un güçlendirilmesi amaçlandı."
        )
        val itemModel2 = ItemModel(
            R.drawable.instagram,
            "INSTAGRAM",
            "Instagram, sosyal medyada ücretsiz fotoğraf ve video paylaşma uygulaması." +
                    " Ekim 2010'da kurulduğunda, kullanıcılarına çektikleri bir fotoğraf üzerinde dijital filtre kullanma ve bu fotoğrafı Instagram'ın da dahil olduğu, sosyal medya servisleri ile paylaşma imkanı tanımıştır." +
                    "Kevin Systrom ve Mike Krieger tarafından kurulan Instagram Nisan 2012 yılında sosyal medya devi Facebook tarafından 1 milyar dolara satın alındı. "
        )
        val itemModel3 = ItemModel(
            R.drawable.whatsapp,
            "WHATSAPP",
            "WhatsApp Messenger, akıllı telefonlar için geliştirilen, platformlararası çalışma özelliğine sahip bir mesajlaşma ve arama uygulamasıdır. " +
                    "Android, BlackBerry, iPhone, Windows Phone ve Nokia telefonlarıyla uyumlu olan uygulama; 2G, 3G, 4G ya da Wi-Fi İnternet bağlantısı aracılığıyla kullanıcıların birbirlerine fotoğraf, video, ücretsiz arama, sesli ve yazılı mesaj ve belge göndermesini sağlar. " +
                    "Aynı adı taşıyan şirket, eski Yahoo! çalışanları olan Biran Acton ve Jan Koum tarafından ABD'de, Kaliforniya eyaletindeki Santa Clara kentinde kurulmuştur."
        )
        val itemModel4 = ItemModel(
            R.drawable.youtube,
            "YOUTUBE",
            "YouTube, bir video barındırma web sitesidir. Merkezi Amerika Birleşik Devletleri'deki San Bruno, Kaliforniya şehrindedir. " +
                    "15 Şubat 2005'te 3 eski PayPal çalışanı tarafından kurulmuştur. Kasım 2006'da Google tarafından 1.65 milyar dolara satın alınmıştır. Günümüzde Google'ın yan kuruluşlarından biri olarak faaliyetine devam etmektedir." +
                    " Site, kullanıcılarına video yükleme, izleme ve paylaşma imkanı sunmaktadır. " +
                    "Medya şirketleri ve kullanıcı üretimi videoların gösterimi için WebM, H.264 ve Adobe Flash Video teknolojilerini kullanır. Genel olarak; Video klipler, televizyon klipleri, müzik videoları, video bloglar, kısa özgün videolar ve eğitim videoları gibi içerikler yayınlanmaktadır."
        )
        val itemModel5 = ItemModel(
            R.drawable.twitter,
            "TWITTER",
            "Twitter, kullanıcıların 280 karakter ile sınırlandırılmış \"tweet\" (Türkçe cıvıldama) adı verilen gönderiler yazabildiği bir sosyal ağ. Jack Dorsey, Noah Glass, Biz Stone, ve Evan Williams tarafından Mart 2006'da oluşturulup Temmuz 2006'da kullanıma açıldı. 2013'te en çok ziyaret edilen 10 internet sitesinden biri oldu ve \"internetin SMS'i\" olarak tanımlandı." +
                    "Mart 2016'da 310 milyon aktif kullanıcıya ulaştı."
        )
        val itemModel6 = ItemModel(
            R.drawable.linkedin,
            "LINKEDIN",
            " LinkedIn, iş dünyasındaki kişilerin diğer kişilerle iletişim kurmasını ve bilgi alışverişi yapmasını amaçlayan profesyonel sosyal paylaşım platformudur. Aralık 2002'de kurulan LinkedIn'in web sayfası 5 Mayıs 2003'te kullanıma açıldı.\n" +
                    "\n" +
                    "2006 yılında 20 milyon kez görüntülenen LinkedIn, Haziran 2013'te ise 200 farklı ülkeden 200 milyonun üzerinde kayıtlı kullanıcıya ulaştı.LinkedIn sitesi, aralarında Türkçenin de bulunduğu 20 dilde hizmet vermektedir.\n" +
                    "\n" +
                    "13.06.2016 tarihinde 26.2 milyar dolara Microsoft tarafından satın alındığı açıklandı.\n" +
                    "\n" +
                    "Son yıllarda iş verenler de iş ilanları için kariyer siteleri yerine sıklıkla bu platformu tercih etmeye başlamışlardır."
        )
        val itemModel7 = ItemModel(
            R.drawable.snapchat,
            "SNAPCHAT",
            " Snapchat; Evan Spiegel, Bobby Murphy ve Reggie Brown tarafından akıllı telefonlar için geliştirilmiş, " +
                    "platformlar arası çalışma özelliğine sahip bir anlık mesajlaşma uygulamasıdır. Kullanıcıların birbirlerine yazılı metin, fotoğraf, ses ve video göndermesini sağlar. Kişiye özel gönderilen dosyalar, gönderen kişinin daha önceden belirlediği süre boyunca (1 veya 10 saniye arası) 2 defa görüntülenebilir. " +
                    "Hikâyeye eklenen fotoğraf ve videolar ise gönderen kişinin daha önceden belirlediği süre boyunca (1 veya 10 saniye arası) istenildiği kadar görüntülenebilir. "
        )
        val itemModel8 = ItemModel(
            R.drawable.skype,
            "SKYPE",
            "Skype, İnternet üzerinden iletişim ve telefon görüşmesi yapılmasını sağlayan bir yazılımdır.\n" +
                    "\n" +
                    "VoIP teknolojisini kullanır. Yazılımının geliştiricileri tarafından kodlanmıştır. Özellikle Amerikalıların çok ucuza konuştuğu bu yazılımla dünyada milyonlarca insana internet veya telefonla konuşma imkânı sağlamaktadır. " +
                    "Ekim 2005'te E-kolay'ın başlattığı kampanyada Skype, eBay tarafından 2,6 milyar dolara satın alınmıştır. 10 Mayıs 2011'de Microsoft'a 8,5 milyar dolar karşılığında satılmıştır. "
        )

        val itemList: ArrayList<ItemModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        return itemList
    }

}