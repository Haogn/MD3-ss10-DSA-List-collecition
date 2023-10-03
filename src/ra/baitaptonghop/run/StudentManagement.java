package ra.baitaptonghop.run;

import ra.baitaptonghop.service.Student;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

    public  static List<Student> students = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in) ;
    public static void main(String[] args) {

        Student studentManagement = new Student();
        int choice ;
        do {
            System.out.println("_________ StudentManagement __________");
            System.out.println("1. Them moi sinh vien");
            System.out.println("2. Sua thong tin sinh vien");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Tim kiem hoc sinh theo Id");
            System.out.println("5. Sap xep theo ten hoc sinh tu a-z");
            System.out.println("6. In ra danh sach hoc sinh");
            System.out.println("7. Sap xep diem tang dan");
            System.out.println("8. Sap xep diem giam dan");
            System.out.println("9. Thoat");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                    addStudent() ;
                    break;
                case 2 :
                    editStudent();
                    break;
                case 3 :
                    deleteStudent();
                    break;
                case 4 :
                    findById();
                    break;
                case 5 :
                    sortByName();
                    break;
                case 6 :
                    printStudent();
                    break;
                case 7 :
                    break;
                case 8 :
                    break;
                case 9 :
                    System.err.println("Thoat chuong trinh");
                    sc.close();
                    break;
                default:
                    System.out.println("Lua chon khong phu hop , Vui long chpn lai ");
            }
        } while (choice != 9) ;
    }

    public static void addStudent() {
        Student newStudent = new Student() ;
        newStudent.input(sc);
        students.add(newStudent) ;
    }

    public static void editStudent() {
        do {
            try {
                System.out.println("Nhap vao ma sinh vien can thay doi");
                int id = Integer.parseInt(sc.nextLine()) ;
                int indexEdit = -1 ;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getStudentId() == id ) {
                        indexEdit = i ;
                        break;
                    }
                }
                if (indexEdit != -1) {
                    students.get(indexEdit).input(sc);
                    break;
                } else {
                    System.err.println("Khong ton tai sinh vien trong danh sach");
                }
            } catch (Exception e) {
                System.err.println("Nhap sai dinh dang , vui long nhap lai ");
            }
        } while (true);
    }

    public  static void deleteStudent() {
        do {
            try {
                System.out.println("Nhap vao ma sinh vien can xoa ");
                int id = Integer.parseInt(sc.nextLine()) ;
                int indexDelete = -1 ;
                for (int i = 0; i < students.size(); i++) {
                    if ( students.get(i).getStudentId() == id ) {
                        indexDelete = i ;
                        break;
                    }
                }
                if ( indexDelete != -1 ) {
                    students.remove(indexDelete);
                }
            } catch (Exception e) {
                System.err.println("Nhap sai dinh dang, vui long nhap lai ");
            }
        } while (true) ;
    }

    public static void findById() {
        do {
            try {
                System.out.println("Nhap vao ma sinh vien can tim kiem");
                int id= Integer.parseInt(sc.nextLine());
                int index = -1 ;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getStudentId() == id) {
                        index = i ;
                        break;
                    }
                }
                if ( index != -1 ) {
                    System.out.println("SInh vien tim thay trong danh sach");
                    students.get(index).display();
                    break;
                } else {
                    System.err.println("Khong tim thay sinh vien trong danh sach");
                }
            } catch (Exception e) {
                System.err.println("Loi cu phap , vui long thu lai ");
            }
        } while (true);
    }

    public static void sortByName() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentName().compareTo(o2.getStudentName());
            }
        });

        System.out.println(students);
    }

    public static void printStudent() {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
        }
    }

    public static void sortMarkUp() {

    }
}

