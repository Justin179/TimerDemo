package tw.com.nec.justin_chen.timerdemo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 第一個參數: 總秒數; 第二個參數: 一次倒數幾秒
        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long millisUntilFinished) {

                // countdown is counting down (every second)
                Log.i("Seconds left: ", String.valueOf(millisUntilFinished/1000));

            }
            @Override
            public void onFinish() {

                // counter is finished (after 10 seconds)
                Log.i("DONE","Countdown timer finished!!");

            }
        }.start();

        /*
        // allow chunk of code to be run in a delay way, in every 5 seconds for example
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {

                Log.i("Runnable has run", "a second must has passed");
                // insert code to be run every second
                // this refers to the run method
                handler.postDelayed(this,1000);

            }
        };

        handler.post(run);
        */

    }
}
