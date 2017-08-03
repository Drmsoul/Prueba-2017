package soul.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Game extends AppCompatActivity {


    public static final String EXTRA_COUNTER = "MESSAGE";
    int count1;
    int count2;
    int count3;
    int count4;
    int count5;

    public static final String EXTRA_MESSAGE = "MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        String name =((prueba)this.getApplication()).getName();

        int count1;
        int count2;
        int count3;
        int count4;
        int count5;

        TextView NameTxt = (TextView) findViewById(R.id.textView2);
        NameTxt.setText(name);

    }


    public void res1 (View v) {

        count1 +=1;

    }

    public void res2 (View v) {count2 +=1;}

    public void res3 (View v) {count3 +=1;}

    public void res4 (View v) {count4 +=1;}

    public void res5 (View v) {count5 +=1;}

    public void gameresult (View v) {

        // get values and then displayed in a toast
        Intent intent2 = new Intent(this,endgame.class);
        String name =  ((TextView)findViewById(R.id.textView2)).getText().toString();
        //((prueba) this.getApplication()).setName(name);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        String message = name;
        String counter =  Integer.toString(count1);
        intent2.putExtra(EXTRA_MESSAGE, message);
        intent2.putExtra(EXTRA_COUNTER, counter);
        startActivity(intent2);


    }

}
