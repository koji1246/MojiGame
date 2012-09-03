package application.kadai;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class BeginnerActivity extends Activity implements OnClickListener{
	
    public String moji2;
    //public Button start_btn;
    //public Button left_btn;
    //public Button center_btn;
    //public Button right_btn;

    BeginnerActivity(String moji2){
    	this.moji2 = moji2;
    }

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginner);
        
        Button start_btn = (Button)findViewById(R.id.start_button);
        start_btn.setOnClickListener(this);
        Button left_btn = (Button)findViewById(R.id.left_button);
        left_btn.setClickable(false);//�{�^������
        Button center_btn = (Button)findViewById(R.id.center_button);
        center_btn.setClickable(false);//�{�^������()
        Button right_btn = (Button)findViewById(R.id.right_button);
        right_btn.setClickable(false);//�{�^������()
        Intent beginner = getIntent();
        beginner.putExtra("data", "����!");
        String msg = beginner.getStringExtra("data");
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show(); 
    }

    

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		Button start_btn = (Button)findViewById(R.id.start_button);
		
			start_btn.setClickable(false);
			new CountDownTimer(60000,1000){
	        	TextView second_text_view = (TextView)findViewById(R.id.textView2);
	            public void onTick(long millisUntilFinished){
	            second_text_view.setText("�c��"+millisUntilFinished/1000);
	            }
	            public void onFinish(){
	            second_text_view.setText("�I��");
	            }
	        }.start();
	        showMoji(this.moji2);
	        
	        Button left_btn = (Button)findViewById(R.id.left_button);
	        left_btn.setClickable(true);//�{�^������
	        Button center_btn = (Button)findViewById(R.id.center_button);
	        center_btn.setClickable(true);//�{�^������
	        Button right_btn = (Button)findViewById(R.id.right_button);
	        right_btn.setClickable(true);//�{�^������

	}//onClick�I��
	
	public void showMoji(String strMoji){//View1�ɕ�����\��
		 Random rnd =new Random();
        String[] moji = {"��","�E","��"};
        int index = rnd.nextInt(moji.length);
        TextView textView= (TextView)findViewById(R.id.textView1);
        textView.setText(moji[index]);//�����_���łP�����\��	
        this.moji2 = moji[index];
	}
	

	 
	 public void MojiOnClick(View v){
		 if(this.moji2=="��"){
				switch(v.getId()){
					case R.id.left_button:
						showMoji(moji2);
						break;
					case R.id.center_button:
						break;
					case R.id.right_button:
						break;
				}
			}else if(this.moji2=="��"){
				switch(v.getId()){
				case R.id.left_button:
					break;
				case R.id.center_button:
					showMoji(moji2);
					break;
				case R.id.right_button:
					break;
				}
			}else if(this.moji2=="�E"){
				switch(v.getId()){
				case R.id.left_button:
					break;
				case R.id.center_button:
					break;
				case R.id.right_button:
					showMoji(moji2);
					break;
				}
			}
	 }
}
/*final Button btnView = (Button) findViewById(R.id.start_button);
        final Button btnChanger = (Button) findViewById(R.id.left_button);
        btnChanger.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                if (btnView.getVisibility() == View.VISIBLE){
                    // ��\���Ȃ�\������
                    btnView.setVisibility(View.INVISIBLE);
                } else if (btnView.getVisibility() == View.INVISIBLE){
                    // �\������Ă��鎞�ɔ�\����
                    btnView.setVisibility(View.VISIBLE);
                } 
            }
        });
 */
	
	
