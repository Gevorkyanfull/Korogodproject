package com.Korogod.view;

import com.Korogod.services.ClientService;
import com.Korogod.services.impl.ClientServiceimpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdminMenu {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
    private final ClientService clientService=new ClientServiceimpl();
//    private final MainMenu mainMenu=new MainMenu();
    public void show() throws IOException {
        boolean isRunning=true;
        while(isRunning) {
            this.showMenu();
        switch(br.readLine()){
            case "1":
                createClient();
                break;
            case "2":
                editClient();
                break;
            case "3":
                deleteClient();
                break;

            case "0":
                isRunning=false;
//               mainMenu.showMenu();
                return ;

        }}
     }

    private void createClient() throws IOException {
        System.out.println("Input name");
        String name=br2.readLine();
        System.out.println("Input surname");
        String surname=br2.readLine();
        System.out.println("Age");
        int age=br2.read();
        clientService.createClient(name,surname,age);
    }

    private void editClient() throws IOException {
        System.out.println("Change name");
        String name=br2.readLine();
        System.out.println("Change surname");
        String surname=br2.readLine();
        System.out.println("Change date of birth");
        int age=br2.read();
        clientService.editClient(name,surname,age);
    }
    private void deleteClient() throws IOException {
        System.out.println("Ваш аккаунт удален");
        clientService.deleteClient();

    }

    private void showMenu() {
        System.out.println("1.Add client");
        System.out.println("2.Modify client");
        System.out.println("3.Remove client");
        System.out.println("4.Add product");
        System.out.println("0.Exit");
    }
}
