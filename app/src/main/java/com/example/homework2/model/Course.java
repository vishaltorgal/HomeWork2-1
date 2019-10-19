package com.example.homework2.model;


    public class Course {
        protected String mCWID;
        protected String mCourseID;
        protected String mGrade;

        public Course(String CWID, String CourseID, String Grade) {
            mCWID = CWID;
            mCourseID = CourseID;
            mGrade = Grade;
        }

        public String getCourseID() {
            return mCourseID;
        }

        public void setCourseID(String CourseID) {
            mCourseID = CourseID;
        }

        public String getGrade() {
            return mGrade;
        }

        public void setGrade(String Grade) {
            mGrade = Grade;
        }

        public String getCWID() {
            return mCWID;
        }

        public void setCWID(String CWID) {
            mCWID = CWID;
        }

    }