import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("ป้อนชื่อของคุณ: ");
        // String name = sc.nextLine(); // รับค่า string จากแป้นพิมพ์

        // System.out.print("ป้อนอายุ: ");
        // int age = sc.nextInt(); // รับค่า int จากแป้นพิมพ์

        // System.out.println("ชื่อของคุณคือ " + name);
        // System.out.println("อายุของคุณคือ " + age);

        // next vs nextLine
        System.out.print("ป้อนชื่อของคุณ: ");
        String name1 = sc.next(); // next

        // System.out.print("ป้อนชื่อของคุณ: ");
        // String name2 = sc.nextLine(); // nextLine

        System.out.println("ชื่อของคุณคือ " + name1);
        // System.out.println("ชื่อของคุณคือ " + name2);
        // next คือเมื่อมีช่องว่างระหว่างชื่อจะเก็บค่าแค่ก่อนช่องว่าง เช่น Suphamethee Au จะเก็บแค่ Suphamethee
        // nextLine จะเก็บทั้งหมดAU
    }
}
