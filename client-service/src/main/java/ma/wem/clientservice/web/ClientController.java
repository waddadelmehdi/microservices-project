package ma.wem.clientservice.web;

import ma.wem.clientservice.dao.entities.Client;
import ma.wem.clientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clients/")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping("/add")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PostMapping("/update")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @DeleteMapping("/delete")
    public boolean deleteClient(@RequestBody Client client) {
        clientService.deleteClient(client);
        return true;
    }

}
