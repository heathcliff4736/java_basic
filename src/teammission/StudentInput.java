package teammission;

import java.io.*;
import java.util.HashMap;
import java.util.List;

public class StudentInput {
    public static void main(String[] args) {
        File file = new File("C:/Temp/student.dat");
        HashMap<String, Student> studentInfo = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StudentInput app = new StudentInput();
        app.loadCheck(file, studentInfo);
        printUsage();

        String line = "";
        while (true) {
            try {
                Student st = app.checkKeyAndInputData(br, studentInfo);
                if (st == null) {
                    System.out.println("입력을 종료합니다.");
                    break;
                }

                studentInfo.put(st.getName(), st);//                app.saveData(file, studentInfo);
                System.out.printf("=> 저장됨: %s (총점=%d, 평균=%.1f, 학점=%s)%n\n",
                        st.getName(), st.getTotal(), st.getAverage(), st.getGrade());
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
        app.saveData(file, studentInfo);
        System.out.println("[완료] " + studentInfo.size() + "명의 정보가 " + file.getName() + " 에 저장되었습니다.");
    }

    public void loadCheck(File file, HashMap<String, Student> studentInfo) {

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                HashMap<String, Student> loaded = (HashMap<String, Student>) ois.readObject();
                studentInfo.putAll(loaded);
//                System.out.println("111 " + studentInfo.size() + "명 로드됨.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No Data");
        }
    }

    public static void printUsage() {
        System.out.println("[학생 성적 입력 프로그램]");
        System.out.println("- 종료하려면 이름에 ^^ 를 입력하세요.");
        System.out.println("- 점수는 0~100 사이의 정수만 허용됩니다.\n");
    }

    public Student checkKeyAndInputData(BufferedReader br, HashMap<String, Student> studentInfo) throws IOException {
        System.out.print("이름: ");
        String name = br.readLine();
        if ("^^".equals(name)) return null;

        if (studentInfo.containsKey(name)) {
            System.out.println("[오류] 이미 존재하는 이름입니다. 다른 이름을 입력하세요.\n");
            return checkKeyAndInputData(br, studentInfo);
        }

        int[] scores = new int[4];
        String[] subjects = {"국어", "영어", "수학", "과학"};
        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.print(subjects[i] + ": ");
                try {
                    int score = Integer.parseInt(br.readLine());
                    if (score < 0 || score > 100) throw new IllegalArgumentException();
                    scores[i] = score;
                    break;
                } catch (Exception e) {
                    System.out.println("0~100 사이의 정수를 입력하세요.\n");
                }
            }
        }

        int total = scores[0] + scores[1] + scores[2] + scores[3];
        double avg = total / 4.0;
        String grade;
        if (avg >= 90) grade = "A";
        else if (avg >= 80) grade = "B";
        else if (avg >= 70) grade = "C";
        else if (avg >= 60) grade = "D";
        else grade = "F";

        List<Integer> scoreList = List.of(scores[0], scores[1], scores[2], scores[3]);
        return new Student(name, scoreList, total, avg, grade);
    }

    public void saveData(File file, HashMap<String, Student> studentInfo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(studentInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
