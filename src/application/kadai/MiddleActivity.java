package application.kadai;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MiddleActivity extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.middle);
        
        Intent middle = getIntent();
        middle.putExtra("data", "íÜãâ!");
        String msg = middle.getStringExtra("data");
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
         /*
        Button button1 = (Button)findViewById(R.id.beginner_button);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.higher_button);
        button2.setOnClickListener(this);
        */
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		switch(v.getId()){
        case R.id.beginner_button:
            Intent beginner = new Intent(MiddleActivity.this, application.kadai.BeginnerActivity.class);
            //beginner.putExtra("data", "èâãâ!");
            startActivity(beginner);
            break;
         
        case R.id.higher_button:
            Intent higher = new Intent(MiddleActivity.this, application.kadai.HigherActivity.class);
            //higher.putExtra("data", "è„ãâ!");
            startActivity(higher);
            break;
		}
	 }		
	
	
}
