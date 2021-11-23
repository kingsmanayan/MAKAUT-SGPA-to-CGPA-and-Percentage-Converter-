import java.util.Scanner;

public class cgpa_to_percentage {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter Max Semister you have got Result SEM : ");
        int sem = sx.nextInt();
        float f = 0;
        for (int i = 1; i <= sem; i++) {
            System.out.println("Enter Your " + i + " Sem point:");
            float sems = sx.nextFloat();
            f = f + sems;
        }
        double s = f / sem;
        double n = (s - 0.75) * 10;
        System.out.printf("Your Current CGPA is = %.2f  out of 10 and  Percentage is = %.2f ", s, n);

    }

}
