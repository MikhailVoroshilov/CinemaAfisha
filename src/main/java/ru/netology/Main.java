package ru.netology;

public class Main {

    public static void main(String[] args) {
        MoviePoster one = new MoviePoster(1, 22, "Next", "Comedy", 15, false, 250, 1);
        MoviePoster two = new MoviePoster(2, 433, "Boom", "Triller ", 18, true, 350, 1);
        MoviePoster three = new MoviePoster(3, 56, "Coocke", "Dramma", 16, false, 250, 1);
        MoviePoster four = new MoviePoster(4, 8, "Sum", "action movie", 12, true, 350, 4);

//        CinemaRepository rep = new CinemaRepository();
//        rep.save(one);
//        rep.save(two);
//        rep.save(three);
//        rep.removeById(2);
    }
}
