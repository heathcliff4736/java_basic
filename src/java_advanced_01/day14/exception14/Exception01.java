package java_advanced_01.day14.exception14;

public class Exception01 {
    public static void main(String[] args) {
        try {
            String[] array = {"100", "lOO"};
            for (int i = 0; i < array.length; i++) {
                String string = array[i];
                Integer number = Integer.parseInt(string);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        } catch (NumberFormatException e1) {
            e1.getMessage();
        }
        System.out.println("프로그램 종료");
    }
}
