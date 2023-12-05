package uz.boxodir.testapp.testmvp.mvp.test.mvp;


import android.util.Log;

import uz.boxodir.testapp.testmvp.mvp.test.data.QuestionData;
import uz.boxodir.testapp.testmvp.mvp.test.repasitoriya.AppReposition;
import java.util.ArrayList;
import java.util.List;

public class TestModel implements TestContract.Model{

    ArrayList<QuestionData>list = new ArrayList<>();

    private AppReposition appReposition = AppReposition.getInstance();

    @Override
    public List<QuestionData> getTest() {

        if (list.isEmpty()) {
            list.addAll(appReposition.getTests());
            Log.d("TTT","model list size"+list.size());
            Log.d("TTT",list.get(list.size()-1).getQuestion());
            Log.d("TTT",list.get(list.size()-4).getQuestion());
        }
        return list;
    }

    @Override
    public void getRestart() {
        list.clear();
        Log.d("TTT",list.size()+"");
        list.addAll(appReposition.getTests());
        Log.d("TTT",list.get(list.size()-4).getQuestion());
        getTest();
    }
}
