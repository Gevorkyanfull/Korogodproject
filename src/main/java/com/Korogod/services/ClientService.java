package com.Korogod.services;

import com.Korogod.domain.Client;

public interface ClientService {

    /**
     * Дз написать описание методов
     */
    void createClient(String name, String surname, int age);
    void deleteClient();
    void editClient(String name, String surname, int age);


}
