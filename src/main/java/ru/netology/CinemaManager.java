package ru.netology;

public class CinemaManager {
    private int limit = 10;
    public Main[] posters = new Main[0];

    public CinemaManager() {
    }

    public CinemaManager(int limit) {
        this.limit = limit;
    }

    public void save(Main poster) {
        int length = posters.length + 1;
        Main[] tmp = new Main[length];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public Main[] findAll() {
        return posters;
    }

    public Main[] findLast() {
        int chek = posters.length;
        if (chek > this.limit) {
            chek = this.limit;
        }
        Main[] result = new Main[chek];
        for (int i = 0; i < result.length; i++) {
            int index = result.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }

    public void removeById(int id) {
        int length = posters.length - 1;
        Main[] tmp = new Main[length];
        int index = 0;
        for (Main poster : posters) {
            if (poster.getId() != id) {
                tmp[index] = poster;
                index++;
            }
        }
        posters = tmp;
    }

    public void createById(int id) {
        int length = posters.length + 1;
        Main[] tmp = new Main[length];
        int index = 0;
        for (Main poster : posters) {
            tmp[index] = poster;
            index++;
        }
        posters = tmp;
    }
}
