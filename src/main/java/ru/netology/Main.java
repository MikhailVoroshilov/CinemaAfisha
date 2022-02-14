package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Main {
    private int id;
    private int cinemaId;
    private String cinemaName;
    private String genre;
    private int ageLimit;
    private boolean premiere;
    private int price;
    private int count;
}
