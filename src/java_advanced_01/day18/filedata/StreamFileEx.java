package java_advanced_01.day18.filedata;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// data.txt 파일에 대해 한행씩 읽고 상품정보를 출력
public class StreamFileEx {
    public static void main(String[] args) throws Exception {
        
        // data.txt 파일의 경로(Path)객체 얻기
//        Path path1 = Paths.get(StreamFileEx.class.getResource("data.txt").getPath());
        Path path = Paths.get(StreamFileEx.class.getResource("data.txt").toURI());

        // Path로 부터 파일을 열어 한 행씩 읽으면서 문자열 스트림 생성,
        // 기본 UTF-8 문자셋으로 읽기 실행
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
//        stream.forEach(System.out::println);
        stream.forEach(line -> System.out.println(line));
        stream.close();
    }
}
