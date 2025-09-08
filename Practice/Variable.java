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
    }
}
