package etc.generic.basic2;

public class Main {

    public static void main(String[] args) {

        Box<Integer, String> box = new Box<>(1, "홍길동");
        String s = box.get(1);
        box.put(10, "김메롱");
        System.out.println(box);


    }

}


