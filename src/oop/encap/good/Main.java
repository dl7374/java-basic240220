package oop.encap.good;

public class Main {

    public static void main(String[] args) {

        MyBirth my = new MyBirth();
//        my.year = 1992; (x)
        my.setYear(1952);
        my.setMonth(4);
        my.setDay(31);

        System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n"
                , my.getYear("aaa1111!"), my.getMonth(), my.getDay());



    }

}
