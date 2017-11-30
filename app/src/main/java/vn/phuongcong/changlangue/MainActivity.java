package vn.phuongcong.changlangue;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
  Button button;
  Button btn;
  TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LanguageUtils.loadLocale();
        textView=(TextView)findViewById(R.id.text_content);
        button= ((Button) findViewById(R.id.button_change_language));
        btn= ((Button) findViewById(R.id.btn_show_dialog));
        textView.setText(getString(R.string.demo));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLanguageScreen();
            }
        });
    }

    private void showDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog);
        dialog.setTitle("Title...");
        TextView text = (TextView) dialog.findViewById(R.id.tv_dialog);
        text.setText(getString(R.string.demo));
        dialog.show();
    }

    public void openLanguageScreen() {
        Intent intent = new Intent(MainActivity.this, ChangeLanguageActivity.class);
        startActivityForResult(intent, Constants.RequestCode.CHANGE_LANGUAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case Constants.RequestCode.CHANGE_LANGUAGE:
                if (resultCode == RESULT_OK) {
                    updateViewByLanguage();
                }
                break;
        }
    }

    private void updateViewByLanguage() {
        textView.setText(getString(R.string.demo));
    }

}
