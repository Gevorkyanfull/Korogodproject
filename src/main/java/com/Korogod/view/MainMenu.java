package com.Korogod.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainMenu {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//Сделали глобальную переменную
    private final AdminMenu adminMenu=new AdminMenu();//композиция
    private final ClientMenu clientMenu=new ClientMenu();
    public void showMenu() throws IOException {
        boolean isRunning=true;
        while(isRunning){
            //первое,что появляется в консоле
        System.out.println("1.Admin");
        System.out.println("2.Customer");
            System.out.println("0.Exit");
        //считывание введенных данных
                switch (br.readLine()){
            case "1":
//                isRunning=false;
                adminMenu.show();
                break;
            case "2":
                clientMenu.showMenu();
                break;
            case "0":
                isRunning=false;
                break;
            default:
                System.out.println("Wrong input");
                break;
      }
    }
  }
}
