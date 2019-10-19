package com.example.homework2;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import com.example.homework2.adapter.CustomList;
import com.example.homework2.model.Course;
import com.example.homework2.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   static ArrayList<Student> dataModels;
    CustomList adapter;
    ListView listview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.list);
        dataModels= new ArrayList<Student>();
        adapter = new CustomList(dataModels,getApplicationContext());
        listview.setAdapter(adapter);

        new Task().execute();

    }

    public ArrayList<Student> getStudentList() {
        return dataModels;
    }



    private class Task extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @SuppressLint("CommitTransaction")
        protected Void doInBackground(Void... params) {

//         public Course(String CWID, String CourseID, String Grade)
            Student stud = new Student("88","James", "Shen");
            ArrayList<Course> course = new ArrayList<Course>();
            course.add(new Course("88","CPSC 123", "A"));
            course.add(new Course("88","CPSC 134", "B"));
            stud.setCourse(course);
            dataModels.add(stud);

            stud = new Student("99","John", "Chang");
            course = new ArrayList<Course>();
            course.add(new Course("99","CPSC 234", "B"));
            course.add(new Course("99","CPSC 235", "C"));
            course.add(new Course("99","CPSC 236", "A"));
            stud.setCourse(course);
            dataModels.add(stud);

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

          //  Log.d("vt","yahoo 0 "+dataModels.get(0).getCourse().get(0).getCourseID());
            adapter.notifyDataSetChanged();

        }


    }

}