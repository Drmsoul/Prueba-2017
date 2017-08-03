package soul.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void gamestart (View v) {

        // get values and then displayed in a toast
        Intent intent = new Intent(this,Game.class);
        String name =  ((TextView)findViewById(R.id.editText)).getText().toString();
        ((prueba) this.getApplication()).setName(name);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        String message = name;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);


    }

}
