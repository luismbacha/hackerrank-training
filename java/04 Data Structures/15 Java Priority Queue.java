// https://www.hackerrank.com/challenges/java-priority-queue/problem

import java.util.PriorityQueue;
class Student implements Comparable {
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID() { return this.id; }
    public String getName() { return this.name; }
    public double getCGPA() { return this.cgpa; }
    public int compareTo(Object s) {
        Student b = (Student) s;
        double cgpa = b.getCGPA() - this.getCGPA();
        if(cgpa < 0) return -1;
        if(cgpa > 0) return 1;
        int returnValue = this.getName().compareTo(b.getName());
        if(returnValue == 0) {
            returnValue = this.getID() - b.getID();
        }
        return returnValue;
    }
}
class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> students = new PriorityQueue<Student>();
        for(String event : events) {
            if(event.contains("SERVED"))
                students.poll();
            else {
                String[] studentInfo = event.split(" ");
                students.offer(new Student(Integer.parseInt(studentInfo[3]), studentInfo[1], Double.parseDouble(studentInfo[2])));
            }
        }
        ArrayList<Student> studentsArray = new ArrayList<Student>();
        while(students.size()>0)
            studentsArray.add(students.poll());
        return studentsArray;
    }
}