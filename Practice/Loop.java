public class Loop {
    public static void main(String[] args) {
        int count = 1;
        // while(count <= 10){
        //     System.out.println(count + ": Hello World");
        //     count++;
        //     // ทำจนกว่าจะไม่เป็นจริง
        // }

        // while(true){
        //     System.out.println(count + ": Hello World");
        //     count++;
            
        //     if(count==31){
        //         break;
        //     }
        // }

        // for(int i=1;i<=10;i++){
        //     System.out.println(i + ": Hello World");
        // }

        // do{
        //     System.out.println(count);
        //     count++;
        // }while(count <= 10);

        // For ใช้ในตอนที่รู้จำนวนรอบชัดเจน
        // While ใช้ในตอนที่ไม่รู้จำนวนรอบ
        // Do..While ใช้ในตอนที่อยากลองทำก่อน 1 รอบแล้วทำซ้ำเรื่อยๆเท่าที่เงื่อนไชเป็นจริง

        // break; หยุดทำงาน loop นั้นทันที
        // continue; ข้าม condition นั้นๆไป เช่น

        // for(int i=1;i<=10;i++){
        //     if(i%2 == 0){ continue; }
        //      System.out.println(i);
        //  }

         for(int i=1;i<=3;i++){
             System.out.println("รอบนอก"+i);
             for(int j=1;j<=5;j++){
                System.out.println("รอบใน"+j);
             }
         }
    }
}
