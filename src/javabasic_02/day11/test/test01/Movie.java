package javabasic_02.day11.test.test01;

public class Movie {

    private String title;
    private String genre;

    public String setTitle(String title) {
        this.title = title;
        return title;
    }

    public String setGenre(String genre){
        this.genre = genre;
        return genre;
    }

    void play(){
        System.out.printf("%s (%s) 상영중입니다.\n", title, genre);
    }

}
