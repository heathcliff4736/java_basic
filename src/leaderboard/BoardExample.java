package leaderboard;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardExample {

    List<Board> board = new ArrayList<Board>();
    static Scanner sc = new Scanner(System.in);
    int boardCount = 1;
    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        BoardExample board = new BoardExample();
        board.list();
    }

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------");
        System.out.println("no\t\twriter\t\t\sdate\t\t\t\stitle");
        System.out.println("----------------------------------------------------------");
        for (Board b : board) {
            System.out.printf("%d\t\t", b.getBno());
            System.out.printf("%s\t\t\s", b.getBwriter());
//            System.out.printf("%s\t\t\t\s", b.getBdate());
            System.out.printf("%s\t\t\t\s", sd.format(b.getBdate()));
            System.out.printf("%s", b.getBtitle());
        }
        System.out.println();
        // 게시물 목록 출력
        mainMenu();
    }

    public void mainMenu() {
        Scanner input = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("----------------------------------------------------------");
            System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
            System.out.print("메뉴 선택: ");
            int n = input.nextInt();

            if (n < 1 || n > 9) {
                System.out.println("1부터 4까지의 숫자를 입력하세요.");
            } else {
                switch (n) {
                    case 1 -> creat();
                    case 2 -> read();
                    case 3 -> clear();
                    case 4 -> {
                        exit();
                        quit = true;
                    }
                }
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
            board.add(newBoard);
        }
        System.out.println();
        list();
    }

    public void read() {
        System.out.println();
        System.out.println("[게시물 읽기]");
        System.out.println("bno: ");
        int inputBno = sc.nextInt();
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).equals(inputBno)) {
                board.get(i);
            }
        }
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
