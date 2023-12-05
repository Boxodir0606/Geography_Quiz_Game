package uz.boxodir.testapp.testmvp.mvp.test.repasitoriya;

import android.util.Log;

import uz.boxodir.testapp.testmvp.mvp.test.data.QuestionData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppReposition {

    private ArrayList<QuestionData>questions = new ArrayList<>();
    private static AppReposition instans;

//    private AppReposition() {
//        loadTests();
//    }

    public static AppReposition getInstance(){
        if (instans==null){
            instans=new AppReposition();
        }
        return instans;
    }

    private void loadTests() {
            questions.add(new QuestionData("Amerikani poytaxti", "Moskova", "New York", "Vashington", "Los angeles", "Vashington"));
            questions.add(new QuestionData("Maydoni jihatdan eng katta davlat", "Rossiya", "Amerika", "Xitoy", "Braziliya", "Rossiya"));
            questions.add(new QuestionData("Eng katta materik","Afrika qitasi","Yevrosiyo","Yevropa","Osiyo","Yevrosiyo"));
            questions.add(new QuestionData("Eng kichik materik","Afrika qitasi","Yevrosiyo","Avstraliya","Osiyo","Avstraliya"));
            questions.add(new QuestionData("Eng sernam materik ","Janubiy Amerika","Yevrosiyo","Avstraliya","Osiyo","Janubiy Amerika"));
            questions.add(new QuestionData("Eng issiq materik","Janubiy Amerika","Hindiston","Avstraliya","Osiyo"," Afrika"));
            questions.add(new QuestionData("Eng sovuq materik","Shvetsariya","Siber","Rossiya","Antarktida","Antarktida"));
            questions.add(new QuestionData("Eng baland materik ","Misr","Hindiston","Antarktida","Osiyo","Antarktida"));
            questions.add(new QuestionData("Eng katta qit`a ","Afrika","Yevropa","Antarktida","Osiyo","Osiyo"));
            questions.add(new QuestionData("Eng katta orol ","Afrika","Grenlandiya","Madakaskar","Antarktida","Grenlandiya"));
            questions.add(new QuestionData("Eng katta daryo oroli","Amazonka","Grenlandiya","Morajo","Antarktida","Morajo"));
            questions.add(new QuestionData("Eng uzun tog` tizmasi","Himolay tog'i","And tog` tizmasi","Katta Kavkaz tog tizmasi","Ural tog' tizmasi","And tog` tizmasi"));
            questions.add(new QuestionData("Eng baland cho`qqi","Himolay tog'i","And tog` tizmasi","Katta Kavkaz tog tizmasi","Everest (Jamolungma)","Everest (Jamolungma)"));
            questions.add(new QuestionData("Eng baland harakatdagi vulqon ","Kilimanjaro","Meru","Lyupyaylyako","Semeru","Lyupyaylyako"));
            questions.add(new QuestionData("Eng katta cho`l ","Kilimanjaro","Sahroi Kabir","Lyupyaylyako","Mirza cho'l","Sahroi Kabir"));
            questions.add(new QuestionData("Eng uzun g`or  ","Kilimanjaro","Sahroi Kabir"," Flint Mamont","Mamont g'ori"," Flint Mamont"));
            questions.add(new QuestionData("Eng uzun daryo","Amazonka daryosi","Kagera daryosi"," Nil daryosi","Neva daryosi","Nil daryosi"));
            questions.add(new QuestionData("Eng chuqur ko`l","Kaspiy ko'li","Baykal ko'li","Koʻksuv ko'li","Bodak ko'li","Baykal ko'li"));
            questions.add(new QuestionData("Eng sho`r ko`l","Kaspiy ko'li","Baykal ko'li","Qora ko'li","Bodak ko'li","Qora ko'li"));
            questions.add(new QuestionData("Eng baland sharshara ","Niagara sharshara","Anxel sharshara","Qora ko'li","Bodak ko'li","Anxel sharshara"));
            questions.add(new QuestionData("Eng katta okean ","Atlantika okeani","Hind okeani","Tinch okeani","Shimoliy muz okeani","Tinch okeani"));
            questions.add(new QuestionData("Eng kichik okean  ","Atlantika okeani","Hind okeani","Tinch okeani","Shimoliy muz okeani","Shimoliy muz okeani"));
            questions.add(new QuestionData("Eng uzun okean  ","Hind okeani","Atlantika okeani","Tinch okeani","Shimoliy muz okeani","Atlantika okeani"));
            questions.add(new QuestionData("Eng katta dengiz  ","Kaspiy dengizi","O'rta yer dengizi","Qora dengiz","Filippin dengizi","Filippin dengizi"));
            questions.add(new QuestionData("Eng sovuq odam yashaydigan hudud ","Siber","Shimoliy muz okeani","Antarktida","Oymyakon","Oymyakon"));
            questions.add(new QuestionData("Eng katta o`rmon","Tayga","Jungli","Madakaskar","Hammasi to'g'ri","Tayga"));
            questions.add(new QuestionData("Eng katta gul ","Xrizantema","Volffiya","Raffleziya","Nilufar gul","Raffleziya"));
            questions.add(new QuestionData("Eng katta qush","Burgut","Tuyaqush","Lochin","Barcha javoblar to'g'ri","Tuyaqush"));
            questions.add(new QuestionData("Eng katta in quradigan qush ","Burgut","Tuyaqush","Kolibri","Qaldirg'och","Kolibri"));
            questions.add(new QuestionData("Eng katta quruqlikdagi hayvon","Ayiq","Jirafa","Begimot","Fil","Fil"));
            questions.add(new QuestionData("Eng katta suvlikdagi hayvon ","Akula","Delfin","Skat","Ko'k kit","Ko'k kit"));
            questions.add(new QuestionData("Eng katta sut emizuvchi hayvon ","Begimot","Jirafa","Kit","Ayiq","Kit"));
            questions.add(new QuestionData("Eng chopqir hayvon","Yo'lbars","Sher","Qoplon","Gepard","Gepard"));
            questions.add(new QuestionData("Eng sovuqqa chidamli hayvon","Pingvin","Oq ayiq","Morj","Hamma javob to'g'ri","Pingvin"));
            questions.add(new QuestionData("Eng yirtqich baliq","Akula","Piraniya","Kashalot","Piraniya","Piraniya"));
            questions.add(new QuestionData("Eng uzun ilon","Kobra","Shaqildoq ilon","Anakonda","Bog'ma ilon","Anakonda"));
            questions.add(new QuestionData("Eng mitti shahar","Istanbul","Skora-Bre","Munbay","Shimkent","Skora-Bre"));
            questions.add(new QuestionData("Dunyoning eng baland bino","Taybey "," Gonkong Xalqaro savdo markazi","Burj Xalifa","Uillis Minorasi","Burj Xalifa"));
            questions.add(new QuestionData("Quyosh yadrosidagi harorat necha gradusni tashkil qiladi"," 2,4 million °C "," 1 million °C"," 4.4 million °C"," 2 million °C"," 2 million °C"));
            questions.add(new QuestionData("Quyoshdan Yerga quyosh nurlai necha soniyada  yetib keladi","500 soniyada","800 soniyada","1700 soniyada","20 soniyada","500 soniyada"));
            questions.add(new QuestionData("Yerning yadrosida harorat necha °C tashkil qiladi","5000 °C","10 000 °C","5500 °C","15 505 °C","5500 °C"));
            questions.add(new QuestionData("Sayyoramizdagi Eng kichik davlat","Monako","Vatikan","Nauru","Lixtenshteyn","Vatikan"));
            questions.add(new QuestionData("Aholis eng zich bo'lgan mamlakat","Xitoy","Hindiston","AQSH","Indoneziya","Xitoy"));
            questions.add(new QuestionData("Vulkan atamasi qanday ma’noni bildiradi","Yer xudosi","Olov xudosi","Dengiz xudosi ","Shamol xudosi","Olov xudosi"));
            questions.add(new QuestionData("Atmosfera deganda nimani tushunasiz?","Yerning suv  qobig’ini","Yerning tosh  qobig’ini","Yerning havo  qobig’ini","Yerning hayot  qobig’ini","Yerning havo  qobig’ini"));
            questions.add(new QuestionData("Iqlimning asosiy  unsurlarini  belgilang.","Harorat va bosim","Yog’in","Shamol","Hammasi","Hammasi"));
            questions.add(new QuestionData("Dastlabki xarita qachon tuzilgan?","15 asr muqaddam","13 asr muqaddam","16 asr muqaddam","14 asr muqaddam","15 asr muqaddam"));
            questions.add(new QuestionData("Geografiya” atamasini birinchi bo’lib fanga kim kiritgan?","Falas","Pifagor","Arastu","Eratosfen","Eratosfen"));
            questions.add(new QuestionData("Yerning qattiq yoki tosh” qobig’ini  aniqlang?","Gidrosfera","Atmosfera","Litosfera","Biosfera","Litosfera"));
            questions.add(new QuestionData("Yerning o`rtacha radiusi necha km?","6371 km","5424 km","10551 km","20 000 km","6371 km"));
            questions.add(new QuestionData("Merkuriy quyoshdan qancha uzoqda joylashgan?","72 mln km","58 mln km","105 mln km","42 mln km","58 mln km"));
            questions.add(new QuestionData("Qutb yulduzi har doim qaysi yo‘nalishni ko‘rsatib turadi?","Janub","Sharq","G'arb","Shimol","Shimol"));
            questions.add(new QuestionData("«Kеnglik» va «uzunlik» tushunchalarini birinchi bo‘lib fanga kim kiritgan?","Eratosfen","Arestotel","Ptolemey","Beruniy","Eratosfen"));
            questions.add(new QuestionData("Sayyoralarning yulduzlardan farqi nima?","o`z o`qi atrofida aylanadi","nur sochmaydi","tabiiy yo`ldoshlari bor","g`arbdan sharqqa aylanadi","nur sochmaydi"));
            Collections.shuffle(questions);
            Collections.shuffle(questions);
    }

    public List<QuestionData> getTests(){
        questions.clear();
        loadTests();
        Log.d("TTT",questions.size()+"");
        return questions.subList(0,10);
    }

}
