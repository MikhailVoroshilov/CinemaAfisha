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

        Main[] result = new Main[chek];
        for (int i = 0; i < result.length; i++) {
            int index = result.length - i - 1;
            result[i] = posters[index];
        }
        int go = result.length;
        if (go > this.limit) {
            go = this.limit;
        }
        int ind = 0;
        Main[] tmp = new Main[go];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = result[ind];
            ind++;
        }
        return tmp;
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
