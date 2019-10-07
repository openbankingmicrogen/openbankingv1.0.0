package cds.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import cds.model.CommonDiscoveryStatus;

@Repository
public interface CommonDiscoveryStatusRepo extends MongoRepository<CommonDiscoveryStatus,String>{

}
