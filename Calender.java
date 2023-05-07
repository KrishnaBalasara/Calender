//this is a calender of 2023 using java 
import java.util.Scanner;
public class Calender {
    public static void main(String[] args) {
        int m,h,i=1,j=0,b=1;
        int a=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Month number of the year 2023: ");
        m = obj.nextInt();
        switch (m)
        {
            case 1:
                //a is the number from where first day start 
                a=1;
                //j is the total number of days in that month 
                j=31;
                break;
            case 2:
                a=4;
                j=28;
                break;
            case 3:
                a=4;
                j=31;
                break;
            case 4:
                a=7;
                j=30;
                break;
            case 5:
                a=2;
                j=31;
                break;
            case 6:
                a=5;
                j=30;
                break;
            case 7:
                a=7;
                j=31;
                break;
            case 8:
                a=3;
                j=31;
                break;
            case 9:
                a=6;
                j=30;
                break;
            case 10:
                a=1;
                j=31;
                break;
            case 11:
                a=4;
                j=30;
                break;
            case 12:
                a=6;
                j=31;
                break;
            default:
            System.out.println("Invalid month");
            System.exit(0);
        } 
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\t\t\t Month - " + m + " -2023 \n\n");
        System.out.println("       SUN       MON       TUE      THU      FRI        SAT \n\n");
        //prints the blank spaces before 1st date
        // eg. _ _ _ 1 2 3 4 
        switch(a)
        {
            case 1:
                System.out.print("\t" + i);
                break;
            case 2:
                System.out.print("\t\t" + i);
                break;
            case 3:
                System.out.print("\t\t\t" + i);
                break;
            case 4:
                System.out.print("\t\t\t\t" + i);
                break;
            case 5:
                System.out.print("\t\t\t\t\t" + i);
                break;
            case 6:
                System.out.print("\t\t\t\t\t\t" + i);
                break;
            case 7:
                System.out.print("\t\t\t\t\t\t\t" + i);
                break;
        }
        //h indicates total number of days in first row
        h=8-a;
        //this loop prints first row 
        for(i=2;i<=h;i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        //this loop prints another rows, except 1st row
        for(i=h+1;i<=j;i++) {
            //this condition breaks the line after 7 days in one row 
            if(b==8) {
                System.out.println();
                b=1;
            }
            //prints date
            System.out.print("\t" + i);
            b++;
        }
    }
}
