package com.Korogod.dao.impl;

import com.Korogod.domain.Client;

public interface ClientDao {
    boolean saveClient(Client client);
    boolean deleteClient(Client client);
    boolean editClient(Client client);

}
