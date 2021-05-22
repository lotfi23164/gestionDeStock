package com.SIP.ams.repositories;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.SIP.ams.entities.Provider;


@Repository

public interface ProviderRepository extends CrudRepository<Provider, Long> {

}

