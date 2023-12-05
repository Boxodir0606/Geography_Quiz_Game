package uz.boxodir.testapp.testmvp.mvp.test.mvp;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.testapp.R;

import uz.boxodir.testapp.testmvp.mvp.test.data.QuestionData;

import java.util.ArrayList;


public class TestActivity extends AppCompatActivity implements TestContract.View {
    private AppCompatTextView textQuestion;
    private ArrayList<RadioButton> radioButtons;
    private ArrayList<AppCompatTextView> variants;
    private AppCompatButton buttonSkip;
    private AppCompatButton buttonNext;
    private TestContract.Presenter presenter;
    private AppCompatImageView buttonBack;
    private AppCompatTextView TestByPostionn;
    private int counter = 1;

    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        animation = AnimationUtils.loadAnimation(this, R.anim.myanimation);


        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.gameactivity));


        presenter = new TestPresentor(this);
        loadViews();
        clickEvents();
        presenter.showTestByPostion();

    }

    public void loadViews() {
        TestByPostionn = findViewById(R.id.allAnswer);
        Log.d("TTT", "loadView ishladi");
        textQuestion = findViewById(R.id.textQuestion);
        buttonSkip = findViewById(R.id.buttonSkip);
        buttonNext = findViewById(R.id.buttonNext);
        buttonBack = findViewById(R.id.buttonBack);

        radioButtons = new ArrayList<>(4);
        radioButtons.add(findViewById(R.id.radio1));
        radioButtons.add(findViewById(R.id.radio2));
        radioButtons.add(findViewById(R.id.radio3));
        radioButtons.add(findViewById(R.id.radio4));

        variants = new ArrayList<>(4);
        variants.add(findViewById(R.id.text1));
        variants.add(findViewById(R.id.text2));
        variants.add(findViewById(R.id.text3));
        variants.add(findViewById(R.id.text4));


        TestByPostionn.setText(counter + "/" + "10");

    }


    @SuppressLint("SetTextI18n")
    public void clickEvents() {
        buttonSkip.setOnClickListener(v -> {
            counter++;
            TestByPostionn.setText(counter + "/" + "10");
            presenter.skipCurrentTest();

        });
        buttonNext.setOnClickListener(v -> {
            counter++;
            TestByPostionn.setText(counter + "/" + "10");
            presenter.checkUserAnswer(findUserAnswer());

        });

        for (int i = 0; i < radioButtons.size(); i++) {
            radioButtons.get(i).setOnClickListener(v -> {
                clearOldState();
                ((RadioButton) v).setChecked(true);
                buttonNext.setEnabled(true);
            });
        }
        buttonBack.setOnClickListener(view -> {
            animation.start();
            showDialogBackButtonClick();
        });
    }

    private void clearOldState() {
        for (int i = 0; i < radioButtons.size(); i++) {
            radioButtons.get(i).setChecked(false);
        }
    }

    private String findUserAnswer() {
        for (int i = 0; i < radioButtons.size(); i++) {
            if (radioButtons.get(i).isChecked())
                return variants.get(i).getText().toString();
        }
        return "";
    }

    @Override
    public void showTest(QuestionData data) {
        Log.d("TTT", "testni ko'rsatish");
        textQuestion.setText(data.getQuestion());
        Log.d("TTT", textQuestion + "");
        variants.get(0).setText(data.getVariant1());
        variants.get(1).setText(data.getVariant2());
        variants.get(2).setText(data.getVariant3());
        variants.get(3).setText(data.getVariant4());

        clearOldState();
        buttonNext.setEnabled(false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void showResult(int correctCount, int wrongCount) {
        clearOldState();
        TestByPostionn.setText(counter-1 + "/" + "10");
        showDialogWin();
    }

    @SuppressLint("SetTextI18n")
    private void showDialogWin() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_win);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));


        dialog.getWindow().setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        TestByPostionn.setText(counter-1 + "/" + "10");



        ((AppCompatTextView) dialog.findViewById(R.id.togri)).setText(String.valueOf(presenter.getCurrent()));
        ((TextView) dialog.findViewById(R.id.notogri)).setText(String.valueOf(presenter.getWron()));

        int skip_resolt = presenter.getWron() + presenter.getCurrent();

        int skip = Math.abs(skip_resolt - 10);
        ((TextView) dialog.findViewById(R.id.skip)).setText(String.valueOf(skip));

        Log.d("TTT", String.valueOf((Math.abs(presenter.getCurrent() - presenter.getWron()))));

        dialog.findViewById(R.id.ok).setOnClickListener(view -> {


            counter = 1;
            TestByPostionn.setText(counter + "/" + "10");
            presenter.getRestart();
            clickEvents();
            presenter.showTestByPostion();
            dialog.dismiss();

        });

        dialog.show();
    }

    @SuppressLint("SetTextI18n")
    private void showDialogBackButtonClick() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.item_restart);
        dialog.setCancelable(true);


        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        dialog.getWindow().setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        dialog.findViewById(R.id.button).setOnClickListener(view -> {
            dialog.dismiss();
            finish();
        });

        dialog.findViewById(R.id.button2).setOnClickListener(view -> {
            dialog.dismiss();
        });

        dialog.show();
    }
}
