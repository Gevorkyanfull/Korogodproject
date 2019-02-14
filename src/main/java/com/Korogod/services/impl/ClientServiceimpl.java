package com.Korogod.services.impl;

import com.Korogod.dao.impl.ClientDao;
import com.Korogod.dao.impl.ClientDaoimpl;
import com.Korogod.domain.Client;
import com.Korogod.services.ClientService;


public class ClientServiceimpl implements ClientService{

    private ClientDao clientDao=new ClientDaoimpl() {
        @Override
        public boolean saveClient(Client client) {
            return true;
        }
        @Override
        public boolean deleteClient(Client client) {
            return true;

        }
        @Override
        public boolean editClient(Client client) {
            return true;
    }};
    @Override
    public void createClient(String name, String surname, int age) {
        Client client = new Client();
        boolean result = clientDao.saveClient(client);
        if (result) {
            System.out.println("Client Saved: " + client);
        }
    }
    @Override
    public void deleteClient() {
        Client client=new Client();
        boolean result=clientDao.deleteClient(client);
        if (result) {
            System.out.println("Client Deleted: " + client);

        }}
    @Override
    public void editClient(String name, String surname, int age){
            Client client=new Client();
            boolean result=clientDao.editClient(client);
            if (result){
                System.out.println("Client Edited: "+ client);
        }

    }
}
