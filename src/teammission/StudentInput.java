package teammission;

import java.io.*;
import java.util.HashMap;

public class StudentInput {
    public static void main(String[] args) {
        File file = new File("C:/Temp/student.dat");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Student> studentInfo = new HashMap<>();
        String line = null;

        printUsage();

        while(line!="exit"){
            System.out.print("이름 : ");
            try {
                line = br.readLine();
//                studentInfo.put("s1", new Student(line, line, line, line));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
//            oos.writeObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void loadCheck(){}

    public static void printUsage(){
        System.out.println("[학생 성적 입력 프로그램]");
        System.out.println("- 종료하려면 이름에 ^^ 를 입력하세요.");
        System.out.println("- 점수는 0~100 사이의 정수만 허용됩니다.\n");
    }

    public void checkKeyAndInputData(){}

    public void saveData(){}

}
