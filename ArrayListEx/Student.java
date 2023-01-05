package ArrayListEx;

import java.util.ArrayList;

public class Student {
    private String name;
    private int mobileNum;
    private int id;
    private int age;
    private boolean isHostel;
    private int standard;
    private String gender;
    private boolean wearSpecs;
    private String city;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHostel() {
        return isHostel;
    }

    public void setHostel(boolean hostel) {
        isHostel = hostel;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isWearSpecs() {
        return wearSpecs;
    }

    public void setWearSpecs(boolean wearSpecs) {
        this.wearSpecs = wearSpecs;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    Student(String name, int mobileNum, int id, int age, boolean isHostel, int standard, String gender, boolean wearSpecs, String city) {
        this.name = name;
        this.mobileNum = mobileNum;
        this.id = id;
        this.age = age;
        this.isHostel = isHostel;
        this.standard = standard;
        this.gender = gender;
        this.city = city;
        this.wearSpecs = wearSpecs;

    }

    public static int studentsCountStandard(ArrayList<Student> studentList, int standard) {
        int count = 0;
        for (Student m : studentList) {
            if (m.getStandard() == standard) {
                count++;
            }
        }
        return count;
    }

    public static int standardTotalAge(ArrayList<Student> studentList, int standard) {
        int count = 0;
        int sum = 0;
        for (Student m : studentList) {
            if (m.getStandard() == standard) {
                count++;

                sum += m.getAge();
            }
        }
        return sum;
    }

    public static int countGender(ArrayList<Student> studentList, String gender) {
        int count = 0;
        for (Student m : studentList) {
            if (m.getGender() == gender) {
                count++;
            }
        }
        return count;
    }

    public static int countTheStandardGender(ArrayList<Student> studentList, int standard, String gender) {
        int count = 0;
        int sum = 0;
        for (Student m : studentList) {
            if (m.getStandard() == standard && m.getGender() == gender) {

                count++;
            }
        }
        return count;
    }

    public static int countTheAge(ArrayList<Student> studentList, int age) {
        int count = 0;
        for (Student m : studentList) {
            if (m.getAge() == age) {
                count++;
            }
        }
        return count;
    }

    public static int StartingLetterName(ArrayList<Student> studentList) {
        int count = 0;
        for (Student m : studentList) {
            if (m.getName().startsWith("S")) {
                System.out.println(m.getName());
                // name = m.getName();
                count++;
            }

        }
        return count;

    }

    public static boolean wearSpecsStudentsName(ArrayList<Student> studentList) {
        String name = "";
        for (Student m : studentList) {
            if (m.isWearSpecs()) {
                name = m.getName();

                System.out.println(name + "");

            }
        }
        return true;


    }
}