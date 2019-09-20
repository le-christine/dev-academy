package com.school;

class mathClassroom implements Classroom {

    public int numTeachers() {
        return 2;
    }

    public int numStudents() {
        return 20;
    }

    public String getDetails() {
        return ("This classroom has " + numTeachers() + " teachers"
                + "and " + numStudents() + " students");
    }

    public static void main(String[] args) {
        mathClassroom math = new mathClassroom();
        System.out.println(math.getDetails());
    }
}
