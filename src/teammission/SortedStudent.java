package teammission;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class SortedStudent {
    private HashMap<String, Student> studentInfo = new HashMap<>();
    private TreeSet<Student> sorted = new TreeSet<>();

    public void loadObjectFromFile(){
        File file = new File("C:/Temp/student.dat");
        if(file.exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                HashMap loaded = (HashMap<String, Student>) ois.readObject();
                studentInfo.putAll(loaded);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                System.out.println("파일을 찾을 수 없습니다: " + file.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No Data");
        }
    }

    public void createTreeSet(){
        Comparator<Student> comparator = Comparator
                .comparingDouble(Student::getAverage)
                .thenComparing(Student::getName);
        sorted = new TreeSet<>(comparator);
        sorted.addAll(studentInfo.values());
    }

    public void printResult(){
        System.out.println("[정렬 및 저장: 평균 오름차순]");
        System.out.println("불러온 학생 수: "+studentInfo.size());
        System.out.println("정렬 규칙: 평균 ASC, 평균 동률이면 이름 사전순 ASC\n");
        System.out.println("저장 대상(미리보기 상위 10명):");
        int count = 0;
        for (Student s : sorted) {
            System.out.printf("- %s (평균 %.1f)%n", s.getName(), s.getAverage());
            count++;
            if (count >= 10) break;
        }
        System.out.println("\n결과 파일: ./orderByAvg.dat");
    }
    

    public void outputObject(){
        File file = new File("C:/Temp/orderByAvg.dat");
        // 파일로 만드는것 >> 직렬화
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
//            oos.writeObject(sorted);
            oos.writeObject(new ArrayList<>(sorted));
            System.out.println("[완료] 정렬된 결과를 파일로 저장했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SortedStudent sortedStudent = new SortedStudent();
        sortedStudent.loadObjectFromFile();
        sortedStudent.createTreeSet();
        sortedStudent.printResult();
        sortedStudent.outputObject();
    }

}
