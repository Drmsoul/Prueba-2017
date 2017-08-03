package soul.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class endgame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_endgame);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String counter = intent.getStringExtra(Game.EXTRA_COUNTER);
        TextView tv =((TextView)findViewById(R.id.textView3) );
        tv.append(message);
        TextView vt = ((TextView)findViewById(R.id.textResult));
        vt.append(" "+counter);




    }



}
