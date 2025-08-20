package leaderboard;

import java.text.SimpleDateFormat;
import java.util.*;

public class BoardExample {

    List<Board> boardList = new ArrayList<Board>();
    static Scanner sc = new Scanner(System.in);
    private static final String menuNumberRegex = "[1-4]";
    private static final String checkNumber = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    BoardManager boardManager;

    public BoardExample(BoardManager boardManager) {
        this.boardManager = boardManager;
    }

    int boardCount = 1;
    SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd");

    public void list() {
        String list =
                """
                        [게시물 목록]
                        ----------------------------------------------------------
                        no\t\s\s\swriter\t\tdate\t\t\t\stitle
                        ----------------------------------------------------------
                        """;
        Map<String, Board> board = null;
        System.out.println(list);
        for (Board b : boardList) {
            System.out.printf("%-6d %-12s %-16s %-20s%n",
                    b.getBno(),
                    b.getBwriter(),
                    sd.format(b.getBdate()),
                    b.getBtitle());
        }
        System.out.println();
        // 게시물 목록 출력
        mainMenu();
    }

    public void mainMenu() {
        String menuMain =
                """
                        ----------------------------------------------------------
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

    public void creat() {
        System.out.println();
        System.out.println("[새 게시물 입력]");
        System.out.print("제목: ");
        String title = sc.nextLine();
        System.out.print("내용: ");
        String content = sc.nextLine();
        System.out.print("작성자: ");
        String writer = sc.nextLine();
        System.out.println("----------------------------------------------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        int yn = sc.nextInt();
        if (yn == 1) {
            Board newBoard = new Board();
            newBoard.setBno(boardCount++);
            newBoard.setBtitle(title);
            newBoard.setBcontent(content);
            newBoard.setBwriter(writer);
            Date date = new Date();
            newBoard.setBdate(date);
            boardList.add(newBoard);
        }
        System.out.println();
        list();
    }

    public void read() {
        System.out.println();
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int inputBno = sc.nextInt();
        System.out.println("#############");
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).equals(inputBno)) {
                System.out.println("123");
//                System.out.println(boardList.get(i));
//                Board newBoard = new Board();
//                System.out.println(newBoard.getBno());
//                System.out.println(newBoard.getBwriter());
//                System.out.println(newBoard.getBdate());
//                System.out.println(newBoard.getBtitle());
            }
        }
        System.out.println("#############");
        list();
    }

    public void clear() {
        list();
//        list.remove();
    }

    public void exit() {
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
