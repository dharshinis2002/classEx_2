package ArrayListEx;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {

        Student stu1 = new Student("Mabi", 987654399, 81, 5, true, 1, "female", false, "tnj");
        Student stu2 = new Student("Mani", 987654988, 98, 6, false, 8, "male", true, "pkt");
        Student stu3 = new Student("Tamil", 87654098, 88, 6, true, 8, "female", true, "ork");
        Student stu4 = new Student("Shuruthi", 637844743, 54, 2, false, 6, "male", true, "london");
        Student stu5 = new Student("Udhaya", 638268441, 7, 60, false, 5, "female", true, "ond");
        Student stu6 = new Student("Selvi", 87784854, 98, 4, false, 4, "female", false, "America");
        Student stu7 = new Student("Ahalya", 98765409, 89, 4, true, 6, "male", false, "lp");
        Student stu8 = new Student("madhu", 87654, 789, 8, true, 4, "male", false, "singapore");
        Student stu9 = new Student("Hani", 987654, 89, 3, false, 6, "male", false, "USA");
        Student stu10 = new Student("Seetha", 987698, 9876, 76, false, 5, "male", false, "mumbai");
        Student stu11 = new Student("Ammu", 987, 976, 716, false, 2, "female", true, "mumbai");
        Student stu12 = new Student("Siva", 98, 876, 726, true, 5, "male", false, "pla");
        Student stu13 = new Student("Asiha", 9878, 987, 736, false, 8, "female", true, "pups");
        Student stu14 = new Student("Sakthi", 98798, 96, 746, true, 4, "male", true, "ond");
        Student stu15 = new Student("Sharmi", 97698, 986, 6, false, 7, "female", false, "chennai");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);
        studentList.add(stu4);
        studentList.add(stu5);
        studentList.add(stu6);
        studentList.add(stu7);
        studentList.add(stu8);
        studentList.add(stu9);
        studentList.add(stu10);
        studentList.add(stu11);
        studentList.add(stu12);
        studentList.add(stu13);
        studentList.add(stu14);
        studentList.add(stu15);

        System.out.println("Student count standard :"+Student.studentsCountStandard(studentList,5));
        System.out.println(("Students total age :"+Student.standardTotalAge(studentList,6)));
        System.out.println(("Students total gender :"+Student.countGender(studentList,"male")));
        System.out.println(("Students total age :"+Student.countTheStandardGender(studentList,5,"male")));
        System.out.println("Students age range :"+Student.countTheAge(studentList,6));
        System.out.println("Student name s:"+Student. StartingLetterName(studentList));
        System.out.println("wear specs student name :"+Student.wearSpecsStudentsName(studentList));
    }
}