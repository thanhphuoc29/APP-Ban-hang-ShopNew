/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APP.model;

import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Dell
 */
public class product implements Serializable{
    private String id,name,size;
    private int price,num;
    private String src;

    public product() {
    }

    public product(String id, String name,String size,int price,String src,int num) {
        this.id = id;
        this.name = name;
        this.src = src;
        this.size=size;
        this.price = price;
        this.num=num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public static product findProduct(List<product> a,String id){
        for(product i : a){
            if(i.getId().equals(id)) return i;
        }
        return null;
    }
    public Object[] toObject(){
        return new Object[]{
            id,name,size,price,num
        };
    }
}
