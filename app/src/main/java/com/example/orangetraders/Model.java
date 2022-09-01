package com.example.orangetraders;

public class Model {

    String studentId,id;
    public Model(String studentId, String id){
        this.studentId=studentId;
        this.id=id;
    }

    public String getstudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

}
