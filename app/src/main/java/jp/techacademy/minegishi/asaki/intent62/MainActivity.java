package jp.techacademy.minegishi.asaki.intent62;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // コンストラクタ  Intentクラスのインスタンスを生成
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);  // setActionメソッドの引数にIntent.ACTION_SENDを与える
                intent.setType("text/plain");  // プレーンなテキスト。MIMEタイプ：特定の拡張子を持つファイルについて、それがどのような種類のファイルであるのかをサーバー側で定めたもの
                intent.putExtra(Intent.EXTRA_TEXT, mEditText.getText().toString());
                startActivity(intent);
            }
        });
    }
}