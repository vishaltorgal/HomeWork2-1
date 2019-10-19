package com.example.homework2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;


public class StudentDetails  extends AppCompatActivity {

    TextView sd_cwid,sd_courselist;
    EditText sd_fname,sd_lname;
    int pos,courselength;
    MainActivity m;
    String cou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_studentdetails);

        sd_courselist = (TextView)findViewById(R.id.sd_courselist);
        sd_cwid = (TextView)findViewById(R.id.sd_cwid);
        sd_fname = (EditText)findViewById(R.id.sd_fname);
        sd_lname = (EditText)findViewById(R.id.sd_lname);

        sd_fname.setEnabled(false);
        sd_lname.setEnabled(false);

        m = new MainActivity();

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras != null) {

              sd_cwid.setText(extras.getString("cwid"));
              sd_fname.setText(extras.getString("fname"));
              sd_lname.setText(extras.getString("lname"));
              pos = extras.getInt("pos");

              courselength = m.dataModels.get(pos).getCourse().size();


                for(int i=0;i<courselength;i++){
                  //  Log.d("vt","yahoo 1-2 "+m.dataModels.get(pos).getCourse().get(i).getCourseID());
                    cou = m.dataModels.get(pos).getCourse().get(i).getCourseID();
                    sd_courselist.append(cou+ "\n");

                }


            }
        }

    }
}