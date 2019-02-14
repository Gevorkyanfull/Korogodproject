package com.Korogod.view;

import com.Korogod.services.impl.ProductService;
import com.Korogod.services.impl.ProductServiceimpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class ClientMenu {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//Сделали глобальную переменную
    ProductService productService=new ProductServiceimpl();
        public void showMenu()throws IOException {
        boolean isRunning=true;
        while(isRunning){

            System.out.println("1.Create Order");
            System.out.println("2.Orders history");
            System.out.println("3.Edit personal data");
            System.out.println("0.Exit");
            switch (br.readLine()){
                case "1":
                    BuyProduct();
                    break;
                case "2":
                    System.out.println("Show clients orders");
                    break;
                case "3":
                    System.out.println("Change data");
                    break;
                case "0":
                    isRunning=false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
        }}
    }
    private void BuyProduct() throws IOException {
        System.out.println("Приятных покупок");

    }
}
