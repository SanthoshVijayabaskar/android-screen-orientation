package screenorientation.santhoshthepro.com.screenorientation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button btnLogin;
    private TextView welcomeMsg;
    private EditText edtName;

    private final String KEY_MESSAGE    = "welcome_msg";
    private final String KEY_BTN_TEXT   = "btn_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate()");

        btnLogin=(Button)findViewById(R.id.btnLogin);
        welcomeMsg=(TextView)findViewById(R.id.txtMsg);
        edtName=(EditText)findViewById(R.id.edtName);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                welcomeMsg.setText("Welcome "+ edtName.getText().toString());
                btnLogin.setText("Logout");
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState()");

        if(savedInstanceState != null){
            btnLogin.setText(savedInstanceState.getString(KEY_BTN_TEXT));
            welcomeMsg.setText(savedInstanceState.getString(KEY_MESSAGE));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState()");

        outState.putString(KEY_MESSAGE,welcomeMsg.getText().toString());
        outState.putString(KEY_BTN_TEXT,btnLogin.getText().toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy()");
    }
}
