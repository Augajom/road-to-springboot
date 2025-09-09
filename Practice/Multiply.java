import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ตัวเลขแม่สูตรคูณตัวแรกของคุณคือ ");
        int first = sc.nextInt();

        System.out.print("ตัวเลขแม่สูตรคูณตัวสุดท้ายของคุณคือ ");
        int last = sc.nextInt();

        for(int i=first;i<=last;i++){
            System.out.println("แม่ที่ = " + i);
            for(int j = 1; j <= 12 ; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
