import java.util.Scanner;
public class BMI {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("น้ำหนักของคุณคือ(kg) ");
    double weight = sc.nextDouble();
    System.out.print("ส่วนสูงของคุณคือ(cm) ");
    double heightCm = sc.nextDouble();

    double heightM = heightCm / 100;

    double bmi = weight / (heightM * heightM);

    System.out.println("ดัชนีมวลกายของคุณคือ" + bmi);
   } 
}
