package javabasic_02.day07;

public class MovieTest {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.movietitle = "아바타";
        movie1.movieStartDay = "2022.12.14";
        movie1.mainActor = "제이크 설리";
        movie1.genre = "액션";
        movie1.runningTime = "192";
        movie1.movieLevel = "12세";

//        System.out.println("영화제목 " + movie1.movietitle);
        
        // Movie 클래스 타입으로 영화 3편을 배열 movieList에 저장하고
        // 저장한 영화의 제목을 iter방법으로 출력

        Movie movie2 = new Movie();
        movie2.movietitle = "아바타2";

        Movie movie3 = new Movie();
        movie3.movietitle = "아바타3";

        Movie[] movieList = new Movie[3];
        movieList[0] = movie1;
        movieList[1] = movie2;
        movieList[2] = movie3;

        for (Movie movie : movieList) {
            System.out.println(movie.movietitle);
        }


    }
}
