class Variable {
    public static void main(String[] args) {
        //นิยามตัวแปรแบบไม่ระบุค่า
        // int number1;
        // boolean status;
        // char alphabet;
        // float number2;
        // double number3;

        //นิยามตัวแปรแบบระบุค่า
        // int number1 = 10;
        // boolean status = true;
        // char alphabet = 'A';
        // float number2 = 20.5f;
        // double number3 = 20.5;

        //หลายบรรทัดในครั้งเดียว
        // int a = 0, b = 1, c = 3;

        //ทำให้อ่านไทยออกใน terminal : chcp 65001

        //Global valiable
        final int num = 10;
        // num = 20; ไม่สามารถเปลี่ยนค่าได้เพราะ num มี final (น่าจะคล้ายๆ const)
        System.out.println(num);
        System.out.println("ค่าคัวเลขคือ " + num);

        {
            // Local valiable
            int c = 300;
            System.out.println(c);
        }
        // System.out.println(c); ทำงานไม่ได้เพราะไม่อยู่ในขอบเขตของ Local

        // แปลง byte น้อยไปมาก
        // int numInt = 10;
        // double numDouble = numInt;
        // System.out.println(numInt);
        // System.out.println(numDouble);

        // แปลง byte มากไปน้อย
        double numDouble = 10.0;
        int numInt = (int)numDouble;
        System.out.println(numDouble);
        System.out.println(numInt);

        // String / Char
        char name = 'A'; // char ต้องใช้ single quotes เก็บได้ 1 ตัวเท่านั้น ถ้าเอา char มาต่อๆกันจะคือ String
        String a = "100", b = "200";
        a = a + 50; // 50 ถูกมองเป็น String
        String c = a + b;

        // int d = (int)a+50; แปลงตรงๆไม่ได้
        int d = Integer.parseInt(a);
        d = d + 50;

        double e = Double.parseDouble(a);
        e = e + 30.12;

        String age = String.valueOf(a);

        System.out.println("name คือ " + name);
        System.out.println("a คือ " + a);
        System.out.println("c คือ " + c);
        System.out.println("d คือ " + d);
        System.out.println("e คือ " + e);
        System.out.println("age คือ " + age);

        // วิธีเช็คชนิดข้อมูล
        boolean result = a instanceof String;
        System.out.println("a คือ String ใช่ไหม: " + result);
    }
}
