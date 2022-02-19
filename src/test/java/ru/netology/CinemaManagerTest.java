package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaManagerTest {
    Main one = new Main(1, 22, "Next", "Comedy", 15, false, 250, 1);
    Main two = new Main(2, 433, "Boom", "Triller ", 18, true, 350, 1);
    Main three = new Main(3, 56, "Coocke", "Dramma", 16, false, 250, 1);
    Main four = new Main(4, 8, "Sum", "action movie", 12, true, 350, 4);
    Main five = new Main(5, 21, "Next", "Comedy", 15, false, 250, 1);
    Main six = new Main(6, 43, "Boom", "Triller ", 18, true, 350, 1);
    Main seven = new Main(7, 656, "Coocke", "Dramma", 16, false, 250, 1);
    Main eight = new Main(8, 80, "Sum", "action movie", 12, true, 350, 4);
    Main nine = new Main(9, 221, "Next", "Comedy", 15, false, 250, 1);
    Main ten = new Main(10, 4335, "Boom", "Triller ", 18, true, 350, 1);
    Main eleven = new Main(11, 536, "Coocke", "Dramma", 16, false, 250, 1);
    Main twelve = new Main(12, 89, "Sum", "action movie", 12, true, 350, 4);

    CinemaManager manager = new CinemaManager();

    @Test
    void shouldSave() {
        manager.save(one);
        manager.save(two);
        manager.save(four);

        Main[] expected = {one, two, four};
        Main[] actual = manager.findAll();

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

        Main[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Main[] actual = manager.findAll();

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

        Main[] expected = {twelve, eleven, ten, nine, eight, seven, six, five, four, three};
        Main[] actual = manager.findLast();

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

        Main[] expected = {twelve, eleven, ten, nine, eight};
        Main[] actual = man.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        manager.save(one);
        manager.save(two);
        manager.save(four);

        manager.removeById(2);

        Main[] expected = {one, four};
        Main[] actual = manager.findAll();

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
//        Main[] expected = {one, four};
//        Main[] actual = repo.findAll();
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
//        Main[] expected = {one, two, four};
//        Main[] actual = repo.findAll();
//
//        assertArrayEquals(expected, actual);
//    }
//}