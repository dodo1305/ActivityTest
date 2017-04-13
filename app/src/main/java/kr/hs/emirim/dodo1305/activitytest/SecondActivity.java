package kr.hs.emirim.dodo1305.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button butback = (Button)findViewById(R.id.but_second);
        butback.setOnClickListener(butBackHandler);
    }

    View.OnClickListener butBackHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish(); //현재 액티비티 소멸 secondactivity도 사라짐
        }
    };
}
