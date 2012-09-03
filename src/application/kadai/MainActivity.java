package application.kadai;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	public MainActivity(){
		
	}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button1 = (Button)findViewById(R.id.beginner_button);
        button1.setOnClickListener(this);//�����{�^��
        
        Button middle = (Button)findViewById(R.id.middle_button);
        middle.setOnClickListener(this);//�����{�^��
        
        Button higher = (Button)findViewById(R.id.higher_button);
        higher.setOnClickListener(this);//�㋉�{�^��
        
        Intent top = getIntent();
        top.putExtra("data", "TOP!");
        String msg = top.getStringExtra("data");
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show(); 
        
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
                Intent beginner = new Intent(this, application.kadai.BeginnerActivity.class);
                //beginner.putExtra("data", "����!");
                startActivity(beginner);
                break;
            case R.id.middle_button:
                Intent middle = new Intent(MainActivity.this, application.kadai.MiddleActivity.class);
                //middle.putExtra("data", "����!");
                startActivity(middle);
                break;
             
            case R.id.higher_button:
                Intent higher = new Intent(MainActivity.this, application.kadai.HigherActivity.class);
                //higher.putExtra("data", "�㋉!");
                startActivity(higher);
                break;
        }
	}

	
	
		
	
}
