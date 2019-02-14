package com.Korogod.dao.impl;

import com.Korogod.domain.Client;

public class ClientDaoimpl implements ClientDao {

    @Override
    public boolean saveClient(Client client) {
        System.out.println("Saving...Please wait");
        return true;
    }

    @Override
    public boolean deleteClient(Client client) {
        System.out.println("You're deletinggggggggggggg");
        return true;
    }

    @Override
    public boolean editClient(Client client) {
        System.out.println("Data is updated");
        return true;
    }
}
