package cn.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname Car
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 23:47
 * @Version V1.0.0
 * @Since 1.0
 */
@Component
public class Car {

    private String brand;
    private Color color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{\"Car\":{"
                + "\"brand\":\"" + brand + "\""
                + ", \"color\":" + color
                + "}}";
    }
}
