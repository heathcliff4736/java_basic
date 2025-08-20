package leaderboard;

import java.text.SimpleDateFormat;
import java.util.*;

public class BoardExample {

    //    List<Board> boardList = new ArrayList<Board>();
    static Scanner sc = new Scanner(System.in);
    private static final String menuNumberRegex = "[1-4]";
    private static final String checkNumber = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int bno = 1;    // 공용변수

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

    BoardManager boardManager;

    // 생성자를 통해서 주입 (인젝션)
    public BoardExample(BoardManager boardManager) {
        this.boardManager = boardManager;
    }

    public void list() {

        /*String list = """
                [게시물 목록]
                ----------------------------------------------------------
                no\t\s\s\swriter\t\tdate\t\t\t\stitle
                ----------------------------------------------------------
                """;
        System.out.println(list);*/

        // 게시판은 매니저가 담당하고 있으므로, 매니저 받아온다.
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println("[게시물 목록]");
        System.out.println("-".repeat(60));
        System.out.printf("%-5s %-10s %-15s %-20s\n", "no", "writer", "date", "title");
        System.out.println("-".repeat(60));

        // Manager에게 전체 게시물목록을 요청
        List<Map.Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            System.out.printf("%-5s %-10s %-15s %-20s\n",
                    value.getBno(),
                    value.getBWriter(),
                    dateFormat.format(value.getBDate()),
                    value.getBTitle());
        });
        System.out.println();

        /*
        for (Board b : boardList) {
            System.out.printf("%-5d %-10s %-15s %-20s%n",
                    b.getBno(),
                    b.getBWriter(),
                    dateFormat.format(b.getBDate()),
                    b.getBTitle());
        }
        */

        mainMenu();
    }

    public void mainMenu() {
        String menuMain =
                """
                        ------------------------------------------------------------
                        메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit
                        메뉴 선택:\s""";

        System.out.print(menuMain);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            list();
            String n = input.nextLine();

            if (n.matches(menuNumberRegex)) {
                switch (Integer.parseInt(n)) {
                    case 1 -> creat();
                    case 2 -> read();
                    case 3 -> clear();
                    case 4 -> {
                        exit();
                        quit = true;
                    }
                }
            } else {
                System.out.println("1부터 4까지의 숫자를 입력하세요.");
            }
        }
    }

    // checkMenu() : 보조메뉴 확인, 선택 메서드
    public boolean checkMenu() {
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        while (true) {
            String input = sc.nextLine();
            if (input.matches(checkNumber)) {
                return input.equals("1");
            } else {
                System.out.println("[1 or 2]번을 입력하세요.");
            }
        }
    }

    public void creat() {
        System.out.println("\n[새 게시물 입력]");
        System.out.print("제목: ");
        String title = sc.nextLine();
        System.out.print("내용: ");
        String content = sc.nextLine();
        System.out.print("작성자: ");
        String writer = sc.nextLine();
        System.out.println("-".repeat(60));

        if (checkMenu()) {
            // BoardBuiler를 이용하여 새 글 생성
            Board board = Board.builder()
                    .bno(bno)
                    .bWriter(writer)
                    .bTitle(title)
                    .bContent(content)
                    .bDate(new Date())
                    .build();
            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(bno), board);
            boardManager.setBoardMap(boardMap);
            bno++;
        }
        System.out.println();
    }

    public void read() {
        System.out.println("\n[게시물 읽기]");
        int numberInput = 0;
        while (true) {
            System.out.print("bno: ");
            numberInput = sc.nextInt();
            try {
                if (numberInput < 0 || numberInput > boardManager.getBoardMap().size()) {
                    throw new IllegalArgumentException("해당 게시물은 존재하지 않습니다.");
                } else {
                    Map<String, Board> boardMap = boardManager.getBoardMap();
                    System.out.println("#".repeat(30));
                    Board boardOne = boardMap.get(String.valueOf(numberInput));
                    System.out.println("번호: " + boardOne.getBno());
                    System.out.println("제목: " + boardOne.getBTitle());
                    System.out.println("내용: " + boardOne.getBContent());
                    System.out.println("작성자: " + boardOne.getBWriter());
                    System.out.println("날짜: " + dateFormat.format(boardOne.getBDate()));
                    System.out.println("#".repeat(30));
                    readOption(numberInput);
                    break;
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                throw new RuntimeException(e);
            }
        }

        /*
        // 게시판은 매니저가 담당하고 있으므로, 매니저 받아온다.
        Map<String, Board> boardMap = boardManager.getBoardMap();
        // Manager에게 전체 게시물목록을 요청
        List<Map.Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        for (Map.Entry<String, Board> entry : entryList) {
            Board value = entry.getValue();
            if (value.getBno() == inputBno) {
                System.out.println("제목: " +value.getBTitle());
                System.out.println("내용: " +value.getBContent());
                System.out.println("작성자: " +value.getBWriter());
                System.out.println("날짜: " +value.getBDate());
                break; // 찾았으면 멈춤
            }
        }*/

        run();
    }

    public void readOption(int numberInput) {}


    public void clear() {
        list();
//        list.remove();
    }

    public void exit() {
        System.out.println("\n** 게시판 종료 **");
    }

    public void update() {
        list();
//        list.set();
    }

    public void delete() {
        list();
        //        list.remove();
    }
}
