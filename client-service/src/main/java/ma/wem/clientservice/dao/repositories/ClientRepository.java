package ma.wem.clientservice.dao.repositories;

import ma.wem.clientservice.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    public Client getClientsById(Long id);
}
