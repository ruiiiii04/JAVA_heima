package it.heima;

public class Student {
    private String studentId;
    private String studentName;
    private int studentAge;
    private String studentAddress;


    public Student(){};

    public Student(String studentId, String studentName, int studentAge, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentAddress = studentAddress;
    }

    public String getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentAge(){
        return studentAge;
    }

    public String getStudentAddress(){
        return studentAddress;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge){
        this.studentAge = studentAge;
    }

    public void setStudentAddress(String studentAddress){
        this.studentAddress = studentAddress;
    }





}
