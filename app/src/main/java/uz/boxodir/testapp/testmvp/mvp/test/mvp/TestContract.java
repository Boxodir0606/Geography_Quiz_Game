package uz.boxodir.testapp.testmvp.mvp.test.mvp;

import uz.boxodir.testapp.testmvp.mvp.test.data.QuestionData;

import java.util.List;

public interface TestContract {

    interface Model{
        List<QuestionData> getTest();
        void getRestart();
    }
    interface View{
       void showTest(QuestionData data);
        void showResult(int correctCount, int wrongCount);
    }
    interface Presenter{
        void showTestByPosition();

        void showTestByPostion();

        void skipCurrentTest();
        void checkUserAnswer(String userAnswer);
        int getWron();
        int getCurrent();

        void getRestart();
    }
}
