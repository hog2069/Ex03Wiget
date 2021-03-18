package com.hog2020.ex03wiget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //화면에 보여지는 view들을 제어하는 참조변수를 멤버변수로

    TextView tv;
    Button btn;
    EditText et;
    TextView tv2;

    String[] qs=new String[]{"사과","집","자동차"};
    String[] as=new String[]{"apple","house","car"};
    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //참조변수에 객체 연결해주기
        //xml에서 만들어진 view 객체를 찾아와서 참조변수에 대입
        //엑티비티 클래스 객체는 본인이 보여주는 xml의 뷰들을
        //찾아오는 기능 매소드가 이미 보유되어 있음
        tv= this.findViewById(R.id.aa);
        btn= findViewById(R.id.bb);
        et= findViewById(R.id.et);
        tv2=findViewById(R.id.tv2);

        tv.setText(qs[num]);

        //버튼이 클릭되는 것을 듣는 리스너 객체 생성 및 설정
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditText에 써있는 글씨를 얻어오기
                String s= et.getText().toString();
                //얻어온 글씨를 TextView 에 보여 주기
                //tv.setText(s);

                //EditText의 글씨를 지우고 싶다면
               // et.setText("");//빈 문자열을
                if(s.equals(as[num])){
                    tv2.setText("정답");
                    num++;
                    tv.setText(qs[num]);
                }else{
                    tv2.setText("오답");
                }
            }
        });

    }
}