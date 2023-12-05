package uz.boxodir.testapp.testmvp.mvp.test.mvp;


import java.util.ArrayList;

public class TestPresentor implements TestContract.Presenter {

    private TestContract.Model model;
    private TestContract.View view;
    public int currentPos;
    public int correctCount;
    public int wrongCount;

    public ArrayList<String> UserBelgilaganJavoblar = new ArrayList<>();


    TestPresentor(TestContract.View view) {
        model = new TestModel();
        this.view = view;
    }

    @Override
    public void showTestByPosition() {
        if (currentPos < model.getTest().size()) view.showTest(model.getTest().get(currentPos));
        else view.showResult(correctCount, wrongCount);
    }

    @Override
    public void checkUserAnswer(String userAnswer) {
        if (model.getTest().get(currentPos).getAnswer().equals(userAnswer)) {
            correctCount++;
            UserBelgilaganJavoblar.add(userAnswer);
        } else wrongCount++;
        UserBelgilaganJavoblar.add(userAnswer);

        currentPos++;
        showTestByPosition();

    }

    @Override
    public int getWron() {
        return wrongCount;
    }

    @Override
    public int getCurrent() {
        return correctCount;
    }



    @Override
    public void getRestart() {
        currentPos = 0;
        wrongCount = 0;
        correctCount = 0;
        model.getRestart();
        model.getTest();
    }


    @Override
    public void showTestByPostion() {
        if (currentPos < model.getTest().size()) view.showTest(model.getTest().get(currentPos));
        else view.showResult(correctCount, wrongCount);
    }

    @Override
    public void skipCurrentTest() {
        UserBelgilaganJavoblar.add("Skip qilingan");
        currentPos++;
        showTestByPosition();
    }

}
