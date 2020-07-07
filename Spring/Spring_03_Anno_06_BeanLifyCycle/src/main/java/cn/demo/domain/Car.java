package cn.demo.domain;

/**
 * @Classname Car
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 18:20
 * @Version V1.0.0
 * @Since 1.0
 */
public class Car {

    private String brand;
    private String color;
    private Double price;

    public Car(String brand, String color, Double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{\"Car\":{"
                + "\"brand\":\"" + brand + "\""
                + ", \"color\":\"" + color + "\""
                + ", \"price\":\"" + price + "\""
                + "}}";
    }

    public void init(){
        System.out.println("Car init......");
    }

    public void destory(){
        System.out.println("Car destory......");
    }
}
