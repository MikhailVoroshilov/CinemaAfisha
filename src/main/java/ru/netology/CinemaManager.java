package ru.netology;

public class CinemaManager {
    private int limit = 10;
    public MoviePoster[] posters = new MoviePoster[0];

    public CinemaManager() {
    }

    public CinemaManager(int limit) {
        this.limit = limit;
    }

    public void save(MoviePoster poster) {
        int length = posters.length + 1;
        MoviePoster[] tmp = new MoviePoster[length];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public MoviePoster[] findAll() {
        return posters;
    }
//
//    public void add(MoviePoster poster) {
//        this.repository.save(poster);
//    }

    public MoviePoster[] getAll() {
        int chek = posters.length;
        if (chek > this.limit) {
            chek = this.limit;
        }
//        MoviePoster[] posters = findAll();
        MoviePoster[] result = new MoviePoster[chek];
        for (int i = 0; i < result.length; i++) {
            int index = result.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }

//    public void removeById(int id) {
//        this.repository.removeById(id);
//    }

    public void removeById(int id) {
        int length = posters.length - 1;
        MoviePoster[] tmp = new MoviePoster[length];
        int index = 0;
        for (MoviePoster poster : posters) {
            if (poster.getId() != id) {
                tmp[index] = poster;
                index++;
            }
        }
        posters = tmp;
    }

    public void createById(int id) {
        int length = posters.length + 1;
        MoviePoster[] tmp = new MoviePoster[length];
        int index = 0;
        for (MoviePoster poster : posters) {
//            if (poster.getId() != id) {
            tmp[index] = poster;
            index++;
//            }
        }
        posters = tmp;
    }
//    public int sum() {
//        int result = 0;
//        for (MoviePoster poster : findAll()) {
//            result = result + poster.getPrice() * poster.getCount();
//        }
//        return result;
//    }
}
