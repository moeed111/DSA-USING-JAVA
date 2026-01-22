package OOPS;

import java.util.Arrays;

public class marks {
    public static class StudentData{
        String name;
        int rno;
        int marks[];
        StudentData(int s[]){
            marks=Arrays.copyOf(s, s.length);
        }
        StudentData(int s){
            marks=new int[s];
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,3,1,3,2};

        StudentData s1 = new StudentData(arr);
        StudentData s2 = new StudentData(2);
        // s1.marks[0]=89;
        // s1.marks[1]=88;
        // s1.marks[2]=87;
        // s1.marks[3]=86;
    }
}
