package com.konehai.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by HP on 13-02-2017.
 */
@Entity
@Table(name="city")
public class City implements Serializable {

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="city_id")
    private int id;

    @NotNull
    @Column(name="city_name")
    private String cityName;


    public City()
    {}

    public City(int id,String cityName)
    {
        this.id=id;
        this.cityName=cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName) {

        this.cityName = cityName;
    }
}
