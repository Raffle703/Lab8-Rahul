package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<City> {

    private final ArrayList<City> cities;
    private final Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    public int getCount(){
        return cities.size();
    }

    /**
     * this adds a city object to the list
     * @param city city to add
     */
    public void addCity(City city){
        cities.add(city);
    }

    /**
     * determines if a specified city is in a list or not
     * @param city specified city
     * @return true if city is in list else false
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * deletes a specified city from the list
     * @param city city to be deleted
     */
    public void deleteCity(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * counts the size of the city list
     * @return number of cities
     */
    public int countCities() {
        return cities.size();
    }

}
