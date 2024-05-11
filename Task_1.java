//@CodeAlpha
//Task-1
//Student Grade Tracker

import java.util.*;

public static void  main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number of students in the class:");
    int numStud=sc.nextInt();

    int[] grades=new int[numStud];
    int sum=0;

    for(int i=0;i<numStud;i++){
        System.out.println("Enter grade for students"+(i+1)+":");
        grades[i]=sc.nextInt();
        sum= sum+grades[i];

    }
    int highGrade=grades[0];

    int lowGrade=grades[0];

    for(int i=0;i<numStud;i++){
        if(grades[i]>highGrade){
            highGrade=grades[i];
        }
        if (grades[i]<lowGrade) 
        {
            lowGrade=grades[i];
            
        }
    }
    double average=(double)sum/numStud;

    System.out.println("Average Grade:"+average);

    System.out.println("Highest Grade:"+highGrade);

    System.out.println("Lowest Grade:"+lowGrade);

    sc.close();
}

