// https://www.hackerrank.com/challenges/java-sort/problem

import java.util.*;

class Student implements Comparable<Student> {
   private int id;
   private String fname;
   private double cgpa;
   public Student (int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
   public int compareTo(Student compareStudent) {
       int compared;
       if((compareStudent.getCgpa() - this.cgpa) > 0)
           compared = 1;
       else if ((compareStudent.getCgpa() - this.cgpa) < 0)
           compared = -1;
       else
           compared = 0;
       if(compared == 0)
           compared = this.fname.compareTo(compareStudent.getFname());
       if(compared == 0)
           compared = compareStudent.getId() - this.id;
       return compared;
   }
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
        Collections.sort(studentList);
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}