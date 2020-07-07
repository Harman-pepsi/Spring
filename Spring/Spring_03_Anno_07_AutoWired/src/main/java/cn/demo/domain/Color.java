package cn.demo.domain;

import org.springframework.stereotype.Component;

/**
 * @Classname Color
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 23:48
 * @Version V1.0.0
 * @Since 1.0
 */
@Component
public class Color {

    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "{\"Color\":{"
                + "\"colour\":\"" + colour + "\""
                + "}}";
    }
}
