package ma.wem.clientservice.service;

import ma.wem.clientservice.dao.entities.Client;
import ma.wem.clientservice.dao.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements ClientManager{
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public boolean deleteClient(Client client) {
        try {
            clientRepository.delete(client);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.getClientsById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
