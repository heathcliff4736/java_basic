package teammission;

import java.io.*;
import java.util.*;

public class StudentOutput {
    private HashMap<String, Student> studentInfo = new HashMap<>();
    private ArrayList<Student> datas = new ArrayList<>();
    private String[] names = null;

    Set<String> keys = studentInfo.keySet();

    public void loadObjectFromFile(){
        // 직렬화 -> 객체를 >> 바이트단위로
        // 역직렬화 이것이
        File file = new File("C:/Temp/student.dat");
        if(file.exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                HashMap loaded = (HashMap<String, Student>) ois.readObject();
                studentInfo.putAll(loaded);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No Data");
        }
    }

    public void rerangeData(){
        datas.clear();
        datas.addAll(studentInfo.values());
        Collections.sort(datas, Comparator.comparingDouble(Student::getAverage));
    }

    public void printInfo(){
        System.out.println("[평균 오름차순 성적표]");
        for (int i = 0; i < datas.size(); i++) {
            Student s = datas.get(i);
            System.out.printf("%d) %s%n", i + 1, s.getName());
            System.out.printf("   점수: %s%n", s.getRecord());
            System.out.printf("   총점: %d, 평균: %.1f, 학점: %s%n%n",
                    s.getTotal(),
                    s.getAverage(),
                    s.getGrade());
        }
    }

    public static void main(String[] args) {
        StudentOutput output = new StudentOutput();
        output.loadObjectFromFile();
        output.rerangeData();
        output.printInfo();
    }

}
