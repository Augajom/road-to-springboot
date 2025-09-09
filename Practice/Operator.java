import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ตัวเลขที่ 1 = ");
        int a = sc.nextInt();
        System.out.print("ตัวเลขที่ 2 = ");
        int b = sc.nextInt();

        System.out.println("บวก " + (a+b)); // a+=b
        System.out.println("ลบ " + (a-b)); // a-=b
        System.out.println("คูณ " + (a*b)); // a*=b
        System.out.println("หาร " + (a/b)); // a/=b
        System.out.println("หารเอาเศษ " + (a%b)); // a%=b

        // == เท่ากับ
        // != ไม่เท่ากับ
        // > มากกว่า
        // < น้อยกว่า
        // >= มากกว่าหรือเท่ากับ
        // <= น้อยกว่าหรือเท่ากับ
        // && และ
        // || หรือ
        // ! ไม่
    }
}
