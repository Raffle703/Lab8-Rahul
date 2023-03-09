package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import static java.security.AccessController.getContext;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    @Test
    void testAdd() {
        ArrayList<City> cityDataList = new ArrayList<>();
        CustomList cl = new CustomList(null, cityDataList);
        City city = new City("Regina", "SK");
        cl.addCity(city);
    }
}
