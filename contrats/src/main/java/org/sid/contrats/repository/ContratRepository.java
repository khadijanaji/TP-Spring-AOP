package org.sid.contrats.repository;

import org.sid.contrats.model.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;


@RepositoryRestController
public interface ContratRepository extends JpaRepository<Contrat,Long> {
    Contrat findByCinClient(String cin);
}
