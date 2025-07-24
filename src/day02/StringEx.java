package day02;

public class StringEx {
    public static void main(String[] args) {
        String name = "신세계";
        String job = "프로그래머";

        System.out.println(name + "과장의 직무는" + job + "입니다.1");

        String str = "나는 \"자바\"를 배우고 있습니다.2";
        System.out.println(str);

        String str2 = """
                {
                    "id" : "" 
                    나는 자바를 배우고 있습니다.3
                }
                """;
        System.out.println(str2);

        String str4 = """
                    나는 자바프로그래밍 \
                    공부를 하고있습니다.
                    나는 자바개발자를 희망.
                """;
        System.out.println(str4);

        String str1 = "3나는 \r자바를 배우고 있습니다.4";
        System.out.println(str1);
    }
}
