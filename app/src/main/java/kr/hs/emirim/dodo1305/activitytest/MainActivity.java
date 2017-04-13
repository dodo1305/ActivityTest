package kr.hs.emirim.dodo1305.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain = (Button)findViewById(R.id.but_main);
        butMain.setOnClickListener(butMaininHandler);
    }

    View.OnClickListener butMaininHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            //메소드를 통해서 반환 mainactivity에서 SECOND로 시작한다
            startActivity(intent);
        }
    };
}
