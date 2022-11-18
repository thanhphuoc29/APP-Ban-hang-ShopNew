/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APP.model;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class Order implements Serializable{
    private String id,name;
    private int price,num;

    public Order() {
    }

    public Order(String id, String name, int price,int num) {
        this.id = id;
        this.name = name;
        this.price=price;
        this.num = num;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+price+" "+num;
    }
    public Object[] toObject(){
        return new Object[]{
            id,name,price,num
        };
    }
}
