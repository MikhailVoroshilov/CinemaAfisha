package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaManagerTest {
    MoviePoster one = new MoviePoster(1, 22, "Next", "Comedy", 15, false, 250, 1);
    MoviePoster two = new MoviePoster(2, 433, "Boom", "Triller ", 18, true, 350, 1);
    MoviePoster three = new MoviePoster(3, 56, "Coocke", "Dramma", 16, false, 250, 1);
    MoviePoster four = new MoviePoster(4, 8, "Sum", "action movie", 12, true, 350, 4);
    MoviePoster five = new MoviePoster(5, 21, "Next", "Comedy", 15, false, 250, 1);
    MoviePoster six = new MoviePoster(6, 43, "Boom", "Triller ", 18, true, 350, 1);
    MoviePoster seven = new MoviePoster(7, 656, "Coocke", "Dramma", 16, false, 250, 1);
    MoviePoster eight = new MoviePoster(8, 80, "Sum", "action movie", 12, true, 350, 4);
    MoviePoster nine = new MoviePoster(9, 221, "Next", "Comedy", 15, false, 250, 1);
    MoviePoster ten = new MoviePoster(10, 4335, "Boom", "Triller ", 18, true, 350, 1);
    MoviePoster eleven = new MoviePoster(11, 536, "Coocke", "Dramma", 16, false, 250, 1);
    MoviePoster twelve = new MoviePoster(12, 89, "Sum", "action movie", 12, true, 350, 4);

    CinemaManager manager = new CinemaManager();

    @Test
    void shouldSave() {
        manager.save(one);
        manager.save(two);
        manager.save(four);

        MoviePoster[] expected = {one, two, four};
        MoviePoster[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);
        manager.save(five);
        manager.save(six);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);
        manager.save(ten);

        MoviePoster[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        MoviePoster[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAll() {
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);
        manager.save(five);
        manager.save(six);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);
        manager.save(ten);
        manager.save(eleven);
        manager.save(twelve);

        MoviePoster[] expected = {ten, nine, eight, seven, six, five, four, three, two, one};
        MoviePoster[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAllLimit() {
        CinemaManager man = new CinemaManager(5);
        man.save(one);
        man.save(two);
        man.save(three);
        man.save(four);
        man.save(five);
        man.save(six);
        man.save(seven);
        man.save(eight);
        man.save(nine);
        man.save(ten);
        man.save(eleven);
        man.save(twelve);

        MoviePoster[] expected = {five, four, three, two, one};
        MoviePoster[] actual = man.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        manager.save(one);
        manager.save(two);
        manager.save(four);

        manager.removeById(2);

        MoviePoster[] expected = {one, four};
        MoviePoster[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldCreateById() {
    }
}

//    CinemaRepository repo = new CinemaRepository();
//
//    @Test
//    void save() {
//        repo.save(one);
//        repo.save(two);
//        repo.save(four);
//
//        repo.removeById(2);
//
//        MoviePoster[] expected = {one, four};
//        MoviePoster[] actual = repo.findAll();
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    void getAll() {
//        repo.save(one);
//        repo.save(two);
//        repo.save(four);
//
//        MoviePoster[] expected = {one, two, four};
//        MoviePoster[] actual = repo.findAll();
//
//        assertArrayEquals(expected, actual);
//    }
//}