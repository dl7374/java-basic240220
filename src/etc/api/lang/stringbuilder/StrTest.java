package etc.api.lang.stringbuilder;

public class StrTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String str = "a";
        for (int i = 0; i < 500000; i++) {
            str += "a";
        }


        long end = System.currentTimeMillis();

        System.out.println("실행결과: " + (end-start) * 0.001 + "초");



    }

}
