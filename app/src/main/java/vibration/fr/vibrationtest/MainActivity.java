package vibration.fr.vibrationtest;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    Button b1,b2,b3,b4,b5;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        b1 = (Button)findViewById( R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                customVibrate1();
                break;

            case R.id.button2:
                customVibrate2();
                break;

            case R.id.button3:
                customVibrate3();
                break;

            case R.id.button4:
                customVibrate4();
                break;

            case R.id.button5:
                customVibrate5();
                break;
        }

    }

    private void customVibrate1() {
        // 0 : Start without a delay
        // 400 : Vibrate for 400 milliseconds
        // 200 : Pause for 200 milliseconds
        // 400 : Vibrate for 400 milliseconds
        long[] mVibratePattern = new long[]{0, 400, 200, 400};
        vibrator.vibrate(mVibratePattern, -1);
    }

    private void customVibrate2() {
        long[] mVibratePattern = new long[]{0, 400, 200, 400};
        vibrator.vibrate(mVibratePattern, -1);
    }

    private void customVibrate3() {
        long[] mVibratePattern = new long[]{0, 400, 200, 400};
        vibrator.vibrate(mVibratePattern, -1);
    }

    private void customVibrate4() {
        long[] mVibratePattern = new long[]{0, 1000, 200, 400};
        vibrator.vibrate(mVibratePattern, -1);
    }

    private void customVibrate5() {
        long[] mVibratePattern = new long[]{0, 800, 200, 400};
        vibrator.vibrate(mVibratePattern, -1);
    }
}
