package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
        import android.os.Bundle;
import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;

        import com.example.shayari.R;

        import Adapter.Category_List_Adapter;

public class List_Activity extends AppCompatActivity {

    ListView listView;

    Category_List_Adapter adapter;

    String shubhkamna[] = {"ये इश्क भी एक अजीब एहसास होता है…","ज़िंदगी में अगर तुम अकेले हो तो प्यार ","वफ़ा का दरिया कभी रुकता नही,","मत मुस्कुराओ इतना की फूलो को खबर",
            "बीते साल को विदा इस तरह करते है.","हर पल मे खुशी देती है मा,अपनी ज़िंदगी","बरसात आये तो ज़मीन गीली न हो,","जा SMS जा मेरे sweetheart"};
    String dosti[] = {"लोग रूप देखते है ,हम दिल देखते है ,","करो कुछ ऐसा दोस्ती में","इश्क़ और दोस्ती मेरी ज़िन्दगी के दो जहाँ है",
            "इश्क ओर दोस्ती मेरे दो जहान है","दिल मे एक शोर सा हो रहा है.","मौत एक सच्चाई है उसमे कोई ऐब ",
            "आँखों से बरसात होती हैंजब आपकी ","घर से बाहर कोलेज जाने के लिए वो "};
    String majedar[] = {"आँखों से बरसात होती हैंजब आपकी ","जिस हॉस्पिटल के हम डॉक्टर हैं,","तुम आये तो लगा हर खुशी आ गईयू ","पागल हे वो लोग जो अपने लवर ",
            "मजनू को लैला का SMS ","सितारो मे आप, हवाओ मे आप","धोखा मिला जब प्यार में;ज़िंदगी","शादी एक ऐसा मिलन है…जो अच्छे"};
    String bhagavan[] = {"शिव की ज्योति से प्रकाश बढ़ता है,","सारा जहाँ है जिसकी शरण मैंनमन है","ज़िन्दगी हसीन है , ज़िन्दगी से प्यार करो","भगवान का दिया कभी अल्प नहीं होता",
            "अकाल मृत्यु वो मरे जो कार्य करे ","सितारो मे आप, हवाओ मे आप,फ़िज़ाओ","हज़ारो की किस्मत तेरे हाथ","दुनिया मे बेवफाओ की कमी "};
    String prerana[] = {"आज़ाद हैं तोह आसमान छु ही आएंगे","हर रिश्ते में विश्वास रहने दो;जुबान","छू ले आसमान ज़मीन की तलाश ","कली बेंच देगें चमन बेंच देगें,",
            "कोन जाने कब मौत का पैगाम","ज़िंदगी में बार बार सहारा नही","कर्म तेरे अच्छे हे तोकिस्मत","पी.एम्. की कुर्सी पे मोदी का नाम"};
    String jivan[] = {"मौत एक सच्चाई है उसमे कोई ","वक्त बदल जाता है जिंदगी के ","अपनी तक़दीर में तो कुछ ऐसा ","अपनी तक़दीर में तो कुछ ऐसा ",
            "छू ले आसमान ज़मीन की तलाश ","ज़िंदगी में अगर तुम अकेले ","ज़िंदगी में बार बार सहारा नही ","खूबसूरत है वो लब……जिन पर,दूसरों "};
    String mohabbat[] = {"घर से बाहर कोलेज जाने के लिए ","मोहबत को जो निभाते हैं उनको मेरा","वो रात दर्द और सितम की","दिल पे क्या गुज़री वो अनजान",
            "मजनू को लैला का SMS","मोहबत को जो निभाते हैं ","कौन कहता है हम उसके बिना","तू चाँद मे सितारा होताआसमान"};
    String yade[] = {"कोई खुशियों की चाह में रोयाकोई","मोहबत को जो निभाते हैं उनको ","छू ले आसमान ज़मीन की तलाश","तू चाँद मे सितारा होताआसमान ",
            "शायर तो हम है शायरी बना देंगेआपको","तेरा दिल उदास क्यों है?तेरी आँखों ","हर नई सुबह का नया नज़ारा,ठंडी","हमने भी कभी प्यार किया था,थोड़ा"};
    String other[] = {"उठा कर तलवार जब घोड़े पे ","किसी को ये सोचकर साथ","दिल पे क्या गुज़री वो अनजान कए जाने","प्यार को जब प्यार से प्यार हुवातो प्यारने",
            "जब आपका नाम ज़ुबान पर आता है,","हमारे बिन अधूरे तुम रहोगे,कभी ","अपनोकी ईनायत कभी खतम ","यह खर्चा बहुत करवाती हैंरिचार्ज"};
    String rajaniti[] = {"आज कल हर जगह वोटों के भिखारी ","कितने ही वादे करवालो, नेताओं","इंडिया की राजनीति में मचा हुआ ","वो मौतों का खेल खेलते हैं बस",
            "Boredom hits India!","Mahatma Gandhi made ","Mahatma Gandhi never","An autorickshaw in Ahmedabad"};
    String love[] = {"वो बेवफा हमारा इम्तेहा क्या ","घर से बाहर कोलेज जाने के","उस जैसा मोती पूरे समंद्र में नही है","जादू है उसकी हर एक बात मे",
            "कौन कहता है हम उसके बिना मर ","शायर तो हम है शायरी बना","मंज़िलो से अपनी डर ना जाना,","ना हम कुछ कह पाते हे, ना वोह कुछ"};
    String sed[] = {"टूटे हुए प्याले में जाम नहीं आता","वो बेवफा हमारा इम्तेहा क्या लेगी…","मोहब्बत का नतीजा,दुनिया में ","फूल सबनम में डूब जाते है,",
            "मोहबत को जो निभाते हैं उनको","वक्त नूर को बेनूर कर देता है","जिंदगी हे सफर का सील सिला,","ना सोचा था जिनके लिए हम मर"};
    String sarab[] = {"मे तोड़ लेता अगर तू गुलाब होती मे","रात गुमसूँ है मगर चेन खामोश नही","आप को इस दिल में उतार लेने","तेरा दिल उदास क्यों है? तेरी आँखों",
            "बैठे हैं दिल में ये अरमां जगाये,","जाने कभी गुलाब लगती हेजाने","हवा में सिक्का उछाला और बोला","पानी में विस्की मिलाओ तो नशा"};
    String bevfa[] = {"कतरा कतरा आग बन के जला","नाजानेक्यों ये दिल इतना नादान","हर किसी के नसीब में कहा लिखी ","जरा परदे मेँ रहकर बाहोँ मेँ समाओ","इस दुनिया मेँ अजनबी रहना ही ठीक है…",
            "उसकी दर्द भरी आँखों ने जिस","बेहद हदें पार की थी हमने कभी","इन्सान सब कुछ भूल सकता हैं सिवये "};
    String birthday[] = {"जन्मदिन के ये ख़ास लम्हें मुबारक,","तोहफा मैं तुझे आज मेरा दिल ही देता हूँ","आसमान की बुलंदियों पर नाम हो ","दुआ मिले बन्दों से खुशियां मिले जग से",
            "खुदा बुरी नज़र से बचाए आप को,चाँद सितारों","उगता हुआ सूरज दुआ दे आपको","यही दुआ करता हूँ खुद से,आपकी जिंदिगी","मारी तो दुआ है, कोई गिला नहीं,",};
    String holi[] = {"बाँहो‬ मे भरकर पूछा था ‪उन्होंने‬....","नेचर का हर रंग आप पर बरसे हर कोई ","सभी रंगों का रास है होली, मन का ","होली के इस पर्व पर लगे रंग हर",
            "तेरे अंग अंग में रंग लगा दें, ","हमेशा मीठी रहे आपकी बोली ","लाल गुलाबी रंग है झूम रहा संसार ","खा के गुजिया, पी के भंग, लगा के "};


    String shubhkamnaFull[] = {"ये इश्क भी एक अजीब एहसास होता है…अल्ज़फों से ज्यादा निगाहोसे बया होता है…हर पल बस उसके गम और खुशी की फ़िक्र होती है…इसी एहसास से तो हमको जीने का गुमान होता है…",
            "ज़िंदगी में अगर तुम अकेले हो तो प्यार करना सिख़लो,और प्यार कर लिया हैं तो इज़हार करने भी सिख़लो.अगर इज़हार करना नही सीखा तो,ज़िंदगी भर प्यार के यादों में रोना सिख़लो…",
            "वफ़ा का दरिया कभी रुकता नही,इश्क़ में प्रेमी कभी झुकता नही,खामोश हैं हम किसी के खुशी के लिए,ना सोचो के हमारा दिल दुःखता नहीं!",
            "मत मुस्कुराओ इतना की फूलो को खबर लग जाये,हम करें आपकी तारीफ और आपको नजर लग जायेखुदा करे बहुत लम्बी हो आपकी जिंदगी ,और उस पर भी हमारी उम्र लग जाये….",
            "बीते साल को विदा इस तरह करते है.जो नहीं किया अब तक वो भी कर गुजरते है.नया साल आने के खुशिया तो सब मानते है.एक बार हम इते साल कि जस्न मानते है.",
            "हर पल मे खुशी देती है मा,अपनी ज़िंदगी से जीवन देती है मा,भगवान क्या है!!! मा की पूजा करो जनाब,क्यूकी भगवान को भी जनम देती है मा…",
            "बरसात आये तो ज़मीन गीली न हो,धूप आये तो सरसों पीली न हो,ए दोस्त तूने यह कैसे सोच लिया कि,तेरी याद आये और पलकें गीली न हों।",
            "जा SMS जा मेरे sweetheart के पास,धीरे से जाना शोर न मचाना,busy हो तो चुप रहनाfree हो तो आई मिस यू कहना .."};
    String dostifull[] = {"लोग रूप देखते है ,हम दिल देखते है ,लोग सपने देखते है हम हक़ीकत देखते है,…लोग दुनिया मे दोस्त देखते है,हम दोस्तो मे दुनिया देखते है.",
            "करो कुछ ऐसा दोस्ती मेंकी ‘Thanks & Sorry’ words बे-ईमान लगेनिभाओ यारी ऐसे के ‘यार को छोड़ना मुश्किल’और दुनिया छोड़ना आसान लगे…",
            "इश्क़ और दोस्ती मेरी ज़िन्दगी के दो जहाँ हैइश्क़ मेरा रूह तो दोस्ती मेरा इमां हैइश्क़ पे कर दूँ फ़िदा अपनी ज़िन्दगीमगर दोस्ती पे तो मेरा इश्क़ भी कुर्बान है",
            "इश्क ओर दोस्ती मेरे दो जहान है,इश्क मेरी रुह, तो दोस्ती मेरा ईमान है,इश्क पर तो फिदा करदु अपनी पुरी जिंदगी,पर दोस्ती पर, मेरा इश्क भी कुर्बान है",
            "दिल मे एक शोर सा हो रहा है.बिन आप के दिल बोर हो रहा है.बहुत कम याद करते हो आप हमे.कही ऐसा तो नही की…ये दोस्ती का रिस्ता कंज़ोर हो रा है.",
            "मौत एक सच्चाई है उसमे कोई ऐब नहींक्या लेके जाओगे यारों कफ़न में कोई जेब नहीं",
            "आँखों से बरसात होती हैंजब आपकी याद साथ होती है,जब भी busy रहे मेरा cellतो समझ लेनाआपकी होने वाली भाभी से मेरी बात होती हैं",
            "घर से बाहर कोलेज जाने के लिए वो नकाब मे निकली….सारी गली उनके पीछे निकली…इनकार करते थे वो हमारी मोहबत से……….और हमारी ही तसवीर उनकी किताब से निकली………"};
    String majedarfull[] = {"आँखों से बरसात होती हैंजब आपकी याद साथ होती है,जब भी busy रहे मेरा cellतो समझ लेनाआपकी होने वाली भाभी से मेरी बात होती हैं",
            "जिस हॉस्पिटल के हम डॉक्टर हैं,हमारी पत्नी वहा की नर्स हैंक्या अजीब ज़ुल्म सहना पड़ता हैंअपनी ही बीवी को सिस्टर कहना पड़ता हें",
            "तुम आये तो लगा हर खुशी आ गईयू लगा जैसे ज़िन्दगी आ गईथा जिस घड़ी का मुझे कब से इंतज़ारअचानक वो मेरे करीब आ गई …………",
            "पागल हे वो लोग जो अपने लवर को मिस किया करते हेअरे!! मिस करना हे तो मच्छर को करोजो अपनी जान पर खेल कर आप को किस किया करते हे|",
            "मजनू को लैला का SMS नही आया..मजनू ने 3 दिन से खाना नहीं खाया..मजनू मरने वाला था लैला के प्यार मेंऔर लैला बेती थी SMS FREE होने के इंतेज़ार में..",
            "सितारो मे आप, हवाओ मे आप,फ़िज़ाओ मे आप,बहारो मे आप,धूप मे आप,छावो मे आप,सच ही सुना है की बुरी आत्माओ का कोई ठिकाना नही होता",
            "धोखा मिला जब प्यार में;ज़िंदगी में उदासी छा गयी;सोचा था छोड़ दें इस राह को;कम्बख़त मोहल्ले में दूसरी आ गयी!",
            "शादी एक ऐसा मिलन है…जो अच्छे मित्रों की तरह रहने के इरादे से शुरू किया जाता हैऔर दिन-ब-दिन ये इरादे बदलते जाते हैं।",};
    String bhagavanfull[] = {"शिव की ज्योति से प्रकाश बढ़ता है,जो भी जाता है भोले के द्वार,कुछ ना कुछ उससे ज़रूर मिलता है!",
            "सारा जहाँ है जिसकी शरण मैंनमन है उस शिव के चरण मेंबने उस शिव के चरणो की धूलआओ मिलकर चढ़ाये हम श्रद्धा के फूल",
            "ज़िन्दगी हसीन है , ज़िन्दगी से प्यार करो …..हो रात तो सुबह का इंतज़ार करो …..वो पल भी आएगा, जिस पल का इंतज़ार हैं आपको….बस रब पर भरोसा और वक़्त पे ऐतबार करो ….",
            "भगवान का दिया कभी अल्प नहीं होता,जो टूट जाये वो संकल्प नहीं होता,हार को जीत से दूर ही रखना,क्योकि जीत का कोई विकल्प नहीं होता |…",
            "अकाल मृत्यु वो मरे जो कार्य करे चांडाल का,कल भी उसका क्या करे जो भक्त हो महाकाल का",
            "सितारो मे आप, हवाओ मे आप,फ़िज़ाओ मे आप,बहारो मे आप,धूप मे आप,छावो मे आप,सच ही सुना है की बुरी आत्माओ का कोई ठिकाना नही होता",
            "हज़ारो की किस्मत तेरे हाथ थी अगर पास कर देता तो क्या बात थी? God:गर्लफ्रेंड थोड़ी कम बनता तो क्या बात थी?किताबे तो सारी तेरे पास थी !!",
            "दुनिया मे बेवफाओ की कमी नही अब सूरज को देख लोआता है उशा के साथरहता है किरण के साथऔर जाता है संधया के साथ…."};
    String preranafull[] = {"आज़ाद हैं तोह आसमान छु ही आएंगे ज़िंदा है तो हर जंग जीत जायेंगेसाथ हैं हम तो दुनिया को दिखा आएंगेतिरंगे के तीन रंगों में देश को समा जायेंगे",
            "हर रिश्ते में विश्वास रहने दो;जुबान पर हर वक़्त मिठास रहने दो;यही तो अंदाज़ है जिंदगी जीने का;न खुद रहो उदास, न दूसरों को रहने दो..!",
            "छू ले आसमान ज़मीन की तलाश ना कर,जी ले ज़िंदगी खुशी की तलाश ना कर,तकदीर बदल जाएगी खुद ही मेरे दोस्त,मुस्कुराना सीख ले वजह की तलाश ना कर.",
            "कली बेंच देगें चमन बेंच देगें,धरा बेंच देगें गगन बेंच देगें,कलम के पुजारी अगर सो गये तो…ये धन के पुजारी वतन बेंच देगें।",
            "कोन जाने कब मौत का पैगाम आ जाए, ज़िंदगी की आखरी शाम आ जाए,हमे तो इंतजार है उस शाम काजब हमारी ज़िंदगी किसी के काम आ जाए..",
            "ज़िंदगी में बार बार सहारा नही मिलता, बार बार कोई प्यार से प्यारा नही मिलता,है जो पास उसे संभाल के रखना,खो कर वो फिर कभी दुबारा नही मिलता…",
            "कर्म तेरे अच्छे हे तोकिस्मत तेरी दासी है! नियत तेरी अच्छी है तोघर तेरा मथुरा कशी है!",
            " पी.एम्. की कुर्सी पे मोदी का नाम लिखूं ? अब आप ही बता दो मैंइस जलती कलम से क्या लिखूं”"};
    String jivanfull[] = {"मौत एक सच्चाई है उसमे कोई ऐब नहींक्या लेके जाओगे यारों कफ़न में कोई जेब नहींएब = weakness",
            "वक्त बदल जाता है जिंदगी के साथजिंदगी बदल जाती है वक्त के साथवक्त नहीं बदलता दोस्तों के साथबस दोस्त बदल जाते हैं वक्त के साथ…",
            "अपनी तक़दीर में तो कुछ ऐसा ही सिलसिला लिखा है,किसी ने वक़्त गुजारने के लिए अपना बनाया,तो किसी ने अपना बना कर वक़्त गुज़ार लिया……..",
            "अपनी तक़दीर में तो कुछ ऐसा होता है,कोन किसका हबीब (friend) होता हैबन जाते रिश्ते -नाते जहाजिसका नसीब होता है|",
            "छू ले आसमान ज़मीन की तलाश ना कर,जी ले ज़िंदगी खुशी की तलाश ना कर,तकदीर बदल जाएगी खुद ही मेरे दोस्त,मुस्कुराना सीख ले वजह की तलाश ना कर.",
            "ज़िंदगी में अगर तुम अकेले हो तो प्यार करना सिख़लो,और प्यार कर लिया हैं तो इज़हार करने भी सिख़लो.अगर इज़हार करना नही सीखा तो,ज़िंदगी भर प्यार के यादों में रोना सिख़लो….",
            "ज़िंदगी में बार बार सहारा नही मिलता,बार बार कोई प्यार से प्यारा नही मिलता,है जो पास उसे संभाल के रखना,खो कर वो फिर कभी दुबारा नही मिलता…",
            "खूबसूरत है वो लब……जिन पर,दूसरों के लिए कोई दुआ आ जाए!!खूबसूरत है वो दिल जो किसी के,दुख मे शामिल हो जाए !"};
    String mohabbatfull[] = {"घर से बाहर कोलेज जाने के लिए वो नकाब मे निकली….सारी गली उनके पीछे निकली…इनकार करते थे वो हमारी मोहबत से……….और हमारी ही तसवीर उनकी किताब से निकली………",
            "मोहबत को जो निभाते हैं उनको मेरा सलाम है,और जो बीच रास्ते में छोड़ जाते हैं उनको, हुमारा ये पेघाम हैं,“वादा-ए-वफ़ा करो तो फिर खुद को फ़ना करो,वरना खुदा के लिए किसी की ज़िंदगी ना तबाह करो”",
            "वो रात दर्द और सितम की रात होगी,जिस रात रुखसत उनकी बारात होगी,उठ जाता हु मैं ये सोचकर नींद से अक्सर,के एक गैर की बाहों में मेरी सारी कायनात होगी…..",
            "दिल पे क्या गुज़री वो अनजान क्या जानेप्यार किसे कहते है वो नादान क्या जाने;हवा के साथ उड़ गया घर इस परिंदे का;कैसे बना था घोसला वो तूफान क्या जाने……………",
            "मजनू को लैला का SMS नही आया..मजनू ने 3 दिन से खाना नहीं खाया..मजनू मरने वाला था लैला के प्यार मेंऔर लैला बेती थी SMS FREE होने के इंतेज़ार में..",
            "मोहबत को जो निभाते हैं उनको मेरा सलाम है,और जो बीच रास्ते में छोड़ जाते हैं उनको, हुमारा ये पेघाम हैं,“वादा-ए-वफ़ा करो तो फिर खुद को फ़ना करो,वरना खुदा के लिए किसी की ज़िंदगी ना तबाह करो”",
            "कौन कहता है हम उसके बिना मर जायेंगेहम तो दरिया है समंदर में उतर जायेंगेवो तरस जायेंगे प्यार की एक बून्द के लिएहम तो बादल है प्यार के…किसी और पर बरस जायेंगे|",
            "तू चाँद मे सितारा होताआसमान के एक आशियाना मेंएक आशियाना हमारा होतालोग तुम्हे दूर से देखतेनज़दीक से देखने का हक़ बस हमारा होता|",};
    String yadefull[] = {"कोई खुशियों की चाह में रोयाकोई दुखों की पनाह में रोया..अजीब सिलसिला हैं ये ज़िंदगी का..कोई भरोसे के लिए रोया..कोई भरोसा कर के रोया..",
            "मोहबत को जो निभाते हैं उनको मेरा सलाम है,और जो बीच रास्ते में छोड़ जाते हैं उनको, हुमारा ये पेघाम हैं,“वादा-ए-वफ़ा करो तो फिर खुद को फ़ना करो,वरना खुदा के लिए किसी की ज़िंदगी ना तबाह करो”",
            "छू ले आसमान ज़मीन की तलाश ना कर,जी ले ज़िंदगी खुशी की तलाश ना कर,तकदीर बदल जाएगी खुद ही मेरे दोस्त,मुस्कुराना सीख ले वजह की तलाश ना कर",
            "तू चाँद मे सितारा होताआसमान के एक आशियाना मेंएक आशियाना हमारा होतालोग तुम्हे दूर से देखतेनज़दीक से देखने का हक़ बस हमारा होता|",
            "शायर तो हम है शायरी बना देंगेआपको शायरी मे क़ैद कर लेंगे|कभी सूनाओ हमे अपनी आवाज़आपकी आवाज़ को हम ग़ज़ल बना देंगे.|",
            "तेरा दिल उदास क्यों है?तेरी आँखों में प्यास क्यों है?जो छोड़ गया तुझे मझदार में ,उससे मिलने की आस क्यों है ?जो दे गया दर्द ज़िन्दगी भर का,वही तेरे लिए ख़ास क्यों है ??",
            "हर नई सुबह का नया नज़ारा,ठंडी हवा लेके आई पैगाम हमारा,जागो,उठो,तैयार हो जाओ,खुशियो से भरा रहे आज का दिन तुम्हारा.",
            "हमने भी कभी प्यार किया था,थोड़ा नही बेशुमार किया था,दिल टूट कर रह गया,जब उसने कहा, अरे मैने तो मज़ाक किया था…",};
    String otherfull[] = {"उठा कर तलवार जब घोड़े पे सवार होते बाँध के साफ़ा जब तैयार होतेदेखती है दुनिया छत पे चढ़केकहते है की काश हम भी ऐसे होशियार होते…",
            "किसी को ये सोचकर साथ मत छोड़ना की उसके पास कुछ नहीं तुम्हे देने के लिएबस ये सोचकर साथ निभाने की उसके पास कुछ नहीं है तुम्हारे सिवा खोने के लिए",
            "दिल पे क्या गुज़री वो अनजान कए जाने,प्यार किसे कहते है वो नादान क्या जाने,हवा के साथ उड़ गये घर इस परिंदे का,कैसे बना था घोसला वो तूफान क्या जाने !“प्रमोद नौटियाल”",
            "प्यार को जब प्यार से प्यार हुवातो प्यारने प्यारको प्यारसे पुछाःप्यार केसा होता है ?तो प्यारने प्यारको प्यारसे कहाःजो ईश प्यारीसी शायरी को पढ रहा हैप्यार उनके जैसा प्यारा होता है ।",
            "जब आपका नाम ज़ुबान पर आता है,पता नही दिल क्यों मुस्कुराता है,तसल्ली होती है हमारे दिल को,कि चलो कोई तो है अपना, जोहर वक़्त याद आता है.",
            "हमारे बिन अधूरे तुम रहोगे,कभी चाहा था किसी ने,तुम ये खुद कहोगे,न होगे हम तो किसी ने ,तुम ये खुद कहोगे,मिलेगे बहुत से लेकिन कोई हम सा पागल ना होगा.",
            "अपनोकी ईनायत कभी खतम नही होतीरीस्तोकी महेक भी कभी कम नही होतीजीवनमें साथ हो गर कीसी सच्चे रीस्तोकातो ये जींदगी कीसी जन्नंतसे कम नही लगती",
            "यह खर्चा बहुत करवाती हैंरिचार्ज तुम करवा के देते होरिचार्ज तुम करवा के देते हो",};
    String rajanitifull[] = {"आज कल हर जगह वोटों के भिखारी निकल पड़े हैंकुटिल राजनीति के मझे हुए खिलाडी निकल पड़े हैंगलतियों का दोष औरों पर मढने का जो चलन हैउसे निभाने के लिये बहुत से अनाड़ी निकल पड़े हैंजनता को वो झूंठे वादे अब फिर से मिलने वाले हैंहम जनता के सेवक हैं झांसे फिर से मिलने वाले हैंदुनिया की सारी सुख सुबिधायें अब जनता की हैसावधान जनता अब वोटों के भिक्षुक मिलने वाले हैं",
            "कितने ही वादे करवालो, नेताओं का क्या जाने वालाअभी जैसा चाहो उन्हें नचाओ, उनका क्या जाने वालाकुछ दिन और बचे हैं जितनी चाहो खुशी मनालोफिर तो रोना ही रोना है ईश्वर भी नहीं बचाने वाला",
            "इंडिया की राजनीति में मचा हुआ घमासान हैलोक सभा की सीट ही जैसे हर नेता का अरमान हैटिकेट पाने होड़ में रिश्ते नाते भूल रह्रे हैपुरानी पार्टी छोड़ कर नए गठबंधन जोड़ रहे हैंमहाराष्ट्र हो या बिहार हर रिश्ते पड़ी दरारवोट पाने की चाह में कर रहे एक दूजे पर वार",
            "वो मौतों का खेल खेलते हैं बस राजनीति चमकाने कोवो जनता को गोट समझते हैं अपनी शतरंज बिछाने कोवो क्या जाने जनता की पीढ़ा,जो जनता को केवल मोहरा समझें, जो होते हैं पिटवाने को",
            "Boredom hits India!Elections are over!Modi busy with his work,Rahul Gandhi isn’t giving any interviews,No AAP guy slapped, No IPL match,Aise thodi na chalta hai desh year!!!!",
            "Mahatma Gandhi made the freedom struggle a mass movement. Let’s make development a mass movement.",
            "Mahatma Gandhi never compromised on cleanliness. He gave us freedom. We should pay tribute to him by delivering a Clean India.",
            "An autorickshaw in Ahmedabad costs 10 rupees per km. India’s mission to Mars cost seven rupees per km.",};
    String lovefull[] = {"वो बेवफा हमारा इम्तेहा क्या लेगी…मिलेगी नज़रो से नज़रे तो अपनी नज़रे ज़ुका लेगी…उसे मेरी कबर पर दीया मत जलाने देना…वो नादान है यारो… अपना हाथ जला लेगी.",
            "घर से बाहर कोलेज जाने के लिए वो नकाब मे निकली….सारी गली उनके पीछे निकली…इनकार करते थे वो हमारी मोहबत से……….और हमारी ही तसवीर उनकी किताब से निकली………",
            "उस जैसा मोती पूरे समंद्र में नही है,वो चीज़ माँग रहा हूँ जो मुक़्दर मे नही है,किस्मत का लिखा तो मिल जाएगा मेरे ख़ुदा,वो चीज़ अदा कर जो किस्मत में नही है…",
            "जादू है उसकी हर एक बात मे,याद बहुत आती है दिन और रात मे,कल जब देखा था मैने सपना रात मे,तब भी उसका ही हाथ था मेरे हाथ मे…",
            "कौन कहता है हम उसके बिना मर जायेंगे हम तो दरिया है समंदर में उतर जायेंगेवो तरस जायेंगे प्यार की एक बून्द के लिएहम तो बादल है प्यार के…किसी और पर बरस जायेंगे|",
            "शायर तो हम है शायरी बना देंगेआपको शायरी मे क़ैद कर लेंगे| कभी सूनाओ हमे अपनी आवाज़आपकी आवाज़ को हम ग़ज़ल बना देंगे.||",
            "मंज़िलो से अपनी डर ना जाना,रास्ते की परेशानियों से टूट ना जाना,जब भी ज़रूरत हो ज़िंदगी मे किसी अपने की,हम आपके अपने है ये भूल ना जाना.",
            "ना हम कुछ कह पाते हे, ना वोह कुछ कह पाते हे.एक दूसरे को देखकर गुजर जाया करते हे.कब तक चलता रहेंगा ये सिलसिला,ये सोचकर दिन गुजर जाया करते हे."};
    String sedfull[] = {"टूटे हुए प्याले में जाम नहीं आता इश्क़ में मरीज को आराम नहीं आताये बेवफा दिल तोड़ने से पहले ये सोच तो लिया होताके टुटा हुआ दिल किसी के काम नहीं आता ……..",
            "वो बेवफा हमारा इम्तेहा क्या लेगी…मिलेगी नज़रो से नज़रे तो अपनी नज़रे ज़ुका लेगी…उसे मेरी कबर पर दीया मत जलाने देना…वो नादान है यारो… अपना हाथ जला लेगी.",
            "मोहब्बत का नतीजा,दुनिया में हमने बुरा देखा,जिन्हे दावा था वफ़ा का,उन्हें भी हमने बेवफा देखा.",
            "फूल सबनम में डूब जाते है,झख्म मरहम में डूब जाते है |जब आते है खत तेरे, हम तेरे गम में डूब जाते है.|",
            "मोहबत को जो निभाते हैं उनको मेरा सलाम है,और जो बीच रास्ते में छोड़ जाते हैं उनको, हुमारा ये पेघाम हैं,“वादा-ए-वफ़ा करो तो फिर खुद को फ़ना करो,वरना खुदा के लिए किसी की ज़िंदगी ना तबाह करो”",
            "वक्त नूर को बेनूर कर देता है,छोटे से जख्म को नासूर कर देता है,कौन चाहता है अपने से दूर होना,लेकिन वक्त सबको मजबूर कर देता है !",
            "जिंदगी हे सफर का सील सिला,कोइ मिल गया कोइ बिछड़ गया,जिन्हे माँगा था दिन रत दुआ ओमे,वो बिना मांगे किसी और को मिल गया.",
            "ना सोचा था जिनके लिए हम मर मिटे,एक दिन वही हमसे दूर हो जाएँगे,जीने की तमन्ना तो हम भी रखते थे,अब तेरे बिना कैसे जी पाएगे…",};
    String sarabfull[] = {"मे तोड़ लेता अगर तू गुलाब होती मे जवाब बनता अगर तू सबाल होतीसब जानते है मैं नशा नही करता,मगर में भी पी लेता अगर तू शराब होती!………………",
            "रात गुमसूँ है मगर चेन खामोश नही,कैसे कहदू आज फिर होश नही,ऐसा डूबा तेरी आखो की गहराई मैं,हाथ में जाम है मगर पीने का होश नही.",
            "आप को इस दिल में उतार लेने को जी चाहता है,खूबसूरत से फूलो में डूब जाने को जी चाहता है,आपका साथ पाकर हम भूल गए सब मैखाने,क्योकि उन मैखानो में भी आपका ही चेहरा नज़र आता है….",
            "तेरा दिल उदास क्यों है?तेरी आँखों में प्यास क्यों है?जो छोड़ गया तुझे मझदार में ,उससे मिलने की आस क्यों है ?जो दे गया दर्द ज़िन्दगी भर का,वही तेरे लिए ख़ास क्यों है ??",
            "बैठे हैं दिल में ये अरमां जगाये,के वो आज नजरों से अपनी पिलाये |मजा तो तब ही पीने का यारो,इधर हम पियें और नशा उनको आये ||",
            "जाने कभी गुलाब लगती हेजाने कभी शबाब लगती हेतेरी आखें ही हमें बहारों का ख्बाब लगती हेमें पिए रहु या न पिए रहु,लड़खड़ाकर ही चलता हुक्योकि तेरी गली कि हवा ही मुझे शराब लगती हे",
            "हवा में सिक्का उछाला और बोला HEADS आया तो WHISKEY,Tails आया तो VODKA,जमीन पर खड़ा रहा तो RUM,औरहवा में ही रहा तो माँ कि कसम31st से दारु बंद!",
            "पानी में विस्की मिलाओ तो नशा चड़ता है,पानी में रम मिलाओ तो नशा चड़ता है,पानी में ब्रेंड़ी मिलाओ तो नशा चड़ता है,साला पानी में ही कुछ गड़बड़ है…"};
    String bevfafull[] = {"कतरा कतरा आग बन के जला रही है यादे तेरी•••बरस के इश्क तू भी दिल की लगी बुझा",
            "नाजानेक्यों ये दिल इतना नादान बेवफा के लिए ही रोता है अश्क बहाता है आँखों से पर लब खामोश",
            "हर किसी के नसीब में कहा लिखी होती हे चाहतेंकुछ लोग दुनिया में आते हे सिर्फ तन्हाइयों के लिए.",
            "जरा परदे मेँ रहकर बाहोँ मेँ समाओ किसी गैर की,कहीँ कोई देख ना ले तुम्हेँ,मेरी खुशियोँ का कत्ल करते हुये...!!",
            "इस दुनिया मेँ अजनबी रहना ही ठीक है….लोग बहुत तकलीफ देते है अक्सर अपना बना कर !!",
            "उसकी दर्द भरी आँखों ने जिस जगह कहा था अलविदाआज भी वही खड़ा है दिल उसके आने के इंतज़ार में.",
            "बेहद हदें पार की थी हमने कभी किसी के लिए,आज उसी ने सिखा दिया हद में रहना....!!",
            "इन्सान सब कुछ भूल सकता हैं सिवये उन पलों के जब उसे अपनो की ज़रूरत थी और वे साथ नहीँ थे ....."};
    String birthdayfull[] = {"जन्मदिन के ये ख़ास लम्हें मुबारक,आँखों में बसे नए ख्वाब मुबारक,जिंदगी जो लेकर आई है आपके लिए आज..वो तमाम खुशियों की हंसीं सौगात मुबारक!!!",
            "तोहफा मैं तुझे आज मेरा दिल ही देता हूँ,ये हसीन मोका गवाना नहीं चाहता हूँ,अपने दिल की बात तुम्हारे सामने बतलाता हूँ,और तुम्हारे जन्म दिन की शुभ कामनाये देता हूँ.",
            "आसमान की बुलंदियों पर नाम हो आपका,चाँद की धरती पर मुकाम हो आपका,हम तो रहते है छोटी सी दुनिया में,पर खुदा करे सारा जहाँ हो आपका.",
            "दुआ मिले बन्दों से खुशियां मिले जग से,साथ मिले अपनों से रेहमत मिले रब से,ज़िन्दगी में आप को बे पनाह प्यार मिले,खुश रहे आप दुनिया में ज्यादा सुब से.",
            "खुदा बुरी नज़र से बचाए आप को,चाँद सितारों से सजाए आप को,गम क्या होता है ये आप भूल ही जाओ,खुदा ज़िन्दगी मे इतना हँसाए आप को.",
            "उगता हुआ सूरज दुआ दे आपको,खिलता हुआ फूल खुशबु दे आपको,हम तो कुछ देने के काबिल नहीं है,देने वाला हज़ार खुशिया दे आपको.",
            "यही दुआ करता हूँ खुद से,आपकी जिंदिगी में कोई गम न हो,जन्मदिन पर मिले हज़ारो खुशियां,चाहे उनमें शामिल हम न हो.HAPPY BIRTHDAY",
            "मारी तो दुआ है, कोई गिला नहीं,वो गुलाब जो आज तक खिला नहीं,आज के दिन आपको वो सब कुछ मिले,जो आज तक किसी को कभी मिला नहीं."};
    String holifull[] = {"बाँहो‬ मे भरकर पूछा था ‪उन्होंने‬....!!! ‪कौन‬ सा रंग लगाँऊ ‪‎तुमहे‬...!!! हमने भी ‪कह‬ दिया ...!! ‪‎मुझे‬ Sirf...!!! Tumhare ‪होठो‬ का रंग पसंद है..!!!",
            "नेचर का हर रंग आप पर बरसे हर कोई आपसे होली खेलने को तरसे रंग दे आपको सब मिलकर इतना कि वह रंग उतरने को तरसे....",
            "सभी रंगों का रास है होली, मन का उल्लास है होली, जीवन में खुशियाँ भर देती है, बस इसीलिए ख़ास है होली।",
            "होली के इस पर्व पर लगे रंग हर गाल राष्ट्र रंग सब में रमे हर घर हो खुशहाल",
            "तेरे अंग अंग में रंग लगा दें, आजा गोरी होली मना ले, फिर होली जल्दी न आएगी, बाद में फिर तू पछताएगी।",
            "हमेशा मीठी रहे आपकी बोली खुशियों से भर जाए आपकी झोली आप सबको मेरी तरह से हैप्पी होली",
            "लाल गुलाबी रंग है झूम रहा संसार सूरज की किरण खुशियों की बहार चाँद की चांदनी अपनों का प्यार मुबारक हो आपको होली का त्यौहार",
            "खा के गुजिया, पी के भंग, लगा के थोडा थोडा सा रंग,बजा के ढोलक और मृदंग, खेलें होली हम तेरे संग. होली मुबारक"};
    String temp[];
    String temp1[];
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.otherlist);
        position = getIntent().getIntExtra("pos", 0);
        int img = getIntent().getIntExtra("img", 0);
        if(position==0)
        {
            temp=shubhkamna;
            temp1=shubhkamnaFull;


        }
        if(position==1)
        {
            temp=dosti;
            temp1=dostifull;

        }
        if(position==2)
        {
            temp=majedar;
            temp1=majedarfull;

        }
        if(position==3)
        {
            temp=bhagavan;
            temp1=bhagavanfull;
        }
        if(position==4)
        {
            temp=prerana;
            temp1=preranafull;
        }
        if(position==5)
        {
            temp=jivan;
            temp1=jivanfull;
        }
        if(position==6)
        {
            temp=mohabbat;
            temp1=mohabbatfull;
        }
        if(position==7)
        {
            temp=yade;
            temp1=yadefull;
        }
        if(position==8)
        {
            temp=other;
            temp1=otherfull;
        }
        if(position==9)
        {
            temp=rajaniti;
            temp1= rajanitifull;
        }
        if(position==10)
        {
            temp=love;
            temp1=lovefull;
        }
        if(position==11)
        {
            temp=sed;
            temp1=sedfull;
        }
        if(position==12)
        {
            temp=sarab;
            temp1=sarabfull;
        }
        if(position==13)
        {
            temp=bevfa;
            temp1=bevfafull;
        }
        if(position==14)
        {
            temp=birthday;
            temp1=birthdayfull;
        }
        if(position==15)
        {
            temp=holi;
            temp1=holifull;
        }
        adapter= new Category_List_Adapter(List_Activity.this,temp,img,temp1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Intent intent = new Intent(List_Activity.this, Full_activity.class);
                intent.putExtra("pos", position);
                intent.putExtra("temp",temp);
                intent.putExtra("temp1",temp1);
                startActivity(intent);
            }
        });
    }
}