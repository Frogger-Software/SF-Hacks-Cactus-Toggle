import java.util.Scanner;

public class sensCalc {
    public static double findSensitivity(double currentSensitivity, double angleCovered){
        double oldRatio = currentSensitivity/angleCovered;
        return oldRatio * 360;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current sensitivity?");
        double sens = input.nextDouble();
        System.out.println("What angle of view did you cover?");
        double angle = input.nextDouble();
        System.out.println("Your new sensitivity should be " + findSensitivity(sens, angle));
    }
}
