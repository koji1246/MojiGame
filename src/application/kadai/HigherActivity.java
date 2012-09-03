package application.kadai;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HigherActivity extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.higher);
        
       
        
        
        Intent higher = getIntent();
        higher.putExtra("data", "è„ãâ!");
        String msg = higher.getStringExtra("data");
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
         
      /*  Button button1 = (Button)findViewById(R.id.beginner_button);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.middle_button);
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
            Intent middle = new Intent(HigherActivity.this, application.kadai.BeginnerActivity.class);
            //middle.putExtra("data", "èâãâ!");
            startActivity(middle);
            break;
         
        case R.id.middle_button:
            Intent higher = new Intent(HigherActivity.this, application.kadai.MiddleActivity.class);
            //higher.putExtra("data", "íÜãâ!");
            startActivity(higher);
            break;
    }
	}
}
