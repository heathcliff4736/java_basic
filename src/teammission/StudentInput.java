package teammission;

import java.io.*;

public class StudentInput {
    public static void main(String[] args) {
        File file = new File("C:/Temp/student.dat");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("이름 : ");
        try {
            String mode = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Student student = new Student();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
//            oos.writeObject();
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

    public void loadCheck(){}

    public void printUsage(){}

    public void checkKeyAndInputData(){}

    public void saveData(){}

}
