package com.company;
import java.util.Random;
import java.util.GregorianCalendar;

public class Lucky {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        int y = today.get(GregorianCalendar.YEAR);
        int m = today.get(GregorianCalendar.MONTH)+1;
        int d = today.get(GregorianCalendar.DATE);
        System.out.printf("오늘은 %04d년 %02d월 %02d일 입니다", y, m, d); // % = 시작 d = 정수 f = 실수

        Random random = new Random();
        int a = random.nextInt(10); // 0부터 9까지
        switch (a){
            case 0: System.out.println("대박행운날 대길"); break;
            case 1: case 2: case 3: System.out.println("행운날 중박"); break;
            case 4: case 5:  case 6: System.out.println("쏘쏘 소길"); break;
            case 7: case 8: System.out.println("조심해야되는날"); break;
            case 9: System.out.println("이불밖은 위험햇."); break;
        }
    }
}