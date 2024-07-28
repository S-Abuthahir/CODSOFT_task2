import java.util.*;
public class Task2 {
    static char showGrade(double pct){
        char grade;
        if(pct >= 95) grade='A';
        else if(pct>=80 && pct<95) grade='B';
        else if(pct>=60 && pct<80) grade='C';
        else if(pct>=40 && pct<60) grade='D';
        else grade='E';
        return grade;
    }
    public static void main(String[] args) {
        int no_of_subjects,total=0,marks[];
        double avg;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of subjects:\t");
        no_of_subjects = in.nextInt();
        marks = new int[no_of_subjects];
        System.out.println("\nEnter the respective subject marks(Out of 100)\n");
        for(int i=1;i<=no_of_subjects;i++){
            System.out.print("Enter Suject #"+i+" mark:\t"); marks[i-1] = in.nextInt();
            if(marks[i-1] > 100 || marks[i-1] < 0){System.out.println("Invalid mark!");return;}
        }
        for(int i:marks){total += i;}
        avg = (double)total/no_of_subjects;
        System.out.println("\n##############Student Grade###################");
        System.out.println("Total_marks\tAverage\t\tGrade");
        System.out.printf("%d\t\t\t%.2f\t\t\t%c\n",total,avg,showGrade(avg));
        
    }
}
