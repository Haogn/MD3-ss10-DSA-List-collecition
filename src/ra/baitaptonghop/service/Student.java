package ra.baitaptonghop.service;

import java.util.List;
import java.util.Scanner;

public class Student implements StudentService<Student> {
    private int size ;
    private int nextId = 1 ;
    private int studentId ;
    private String studentName ;
    private String address ;
    private String phone ;
    private boolean gender ;
    private double mark ;

    Object[] elements ;

    public Student() {
        this.studentId = nextId++ ;

    }

    public Student(int studentId, String studentName, String address, String phone, boolean gender, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }


    @Override
    public void input(Scanner sc) {
        System.out.println("Nhap vao ten sinh vien ");
        this.studentName = sc.nextLine() ;
        System.out.println("Nhap vao dia chi");
        this.address = sc.nextLine() ;
        System.out.println("Nhap vao so dien thoai");
        this.phone = sc.nextLine() ;

        while (true) {
            System.out.println("Nhap vao gioi tinh");
            String sex = sc.nextLine();
            if (sex.equalsIgnoreCase("nam")) {
                this.gender = true ;
                break;
            } else if (sex.equalsIgnoreCase("nu")) {
                this.gender = false ;
                break;
            } else {
                System.err.println("Gioi tinh khong hop le , vui long nhap lai");
            }
        }
        System.out.println("Nhap vao diem so");
        this.mark = Float.parseFloat(sc.nextLine()) ;
        elements[size] = new Student(studentId, studentName,address,phone,gender,mark) ;
        size++ ;
    }

    @Override
    public void display() {
        System.out.println("__________ THONG TIN SINH VIEN _________");
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Ten sinh vien: " + studentName);
        System.out.println("Dia chi : " + address);
        System.out.println("So dien thoai: " + phone);
        System.out.println("Gioi tinh: " + (gender?"Nam":"Nu"));
        System.out.println("Diem so : " + mark);
    }


}
