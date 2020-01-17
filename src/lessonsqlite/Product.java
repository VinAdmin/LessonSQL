/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonsqlite;

/**
 *
 * @author 7-2-0
 */
public class Product {
    public int id;
    public String good;
    public double price;
    public String category_name;
    
    // Конструктор
    public Product(int id, String good, double price, String category_name)
    {
        this.id = id;
        this.good = good;
        this.price = price;
        this.category_name = category_name;
    }

    Product(String good, int price, String category_name) {
        this.id = id;
        this.good = good;
        this.price = price;
        this.category_name = category_name;
    }
    
    // Выводим информацию по продукту
    @Override
    public String toString() {
        return String.format("ID: %s | Товар: %s | Цена: %s | Категория: %s",
                this.id, this.good, this.price, this.category_name);
    }
}
