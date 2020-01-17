/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonsqlite;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author 7-2-0
 */
public class Table {
    static JPanel p1 = new JPanel();
    static JFrame f1 = new JFrame("Работа с БД");
    // Данные для таблиц
    private Object[][] array = new String[][] {{ "Сахар" , "кг", "1.5" },
                                                { "Мука"  , "кг", "4.0" },
                                                { "Молоко", "л" , "2.2" }};
    // Заголовки столбцов
    private Object[] columnsHeader = new String[] {"Наименование", "Ед.измерения", 
                                                   "Количество"};
    
    public JFrame GUI() {
        f1.setSize(500, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        try {
            // Создаем экземпляр по работе с БД
            DbHandler dbHandler = DbHandler.getInstance();
            // Добавляем запись
            //dbHandler.addProduct(new Product("Музей", 200, "Развлечения"));
            // Получаем все записи и выводим их на консоль
            List<Product> products = dbHandler.getAllProducts();
            for (Product product : products) {
                System.out.println(product.toString());
                array[0][0] = product.toString();
            }
            // Удаление записи с id = 8
            //dbHandler.deleteProduct(8);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        JTable t1 = new JTable(array, columnsHeader);
        p1.add(new JScrollPane(t1));
        f1.add(p1);
	f1.setVisible(true);
        return f1;
    }
}
