package kr.hs.emirim.dodo1305.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editname, editTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain = (Button)findViewById(R.id.but_main);
        butMain.setOnClickListener(butMaininHandler);
        editname=(EditText) findViewById(R.id.edit_name);
        editTel=(EditText) findViewById(R.id.edit_tel);
    }

    View.OnClickListener butMaininHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            String name = editname.getText().toString();
            String tel = editname.getText().toString();
            intent.putExtra("name", name);
            intent.putExtra("tel", tel);
            startActivity(intent);
        }
    };
}
