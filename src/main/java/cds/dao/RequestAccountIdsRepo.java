package cds.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import cds.model.RequestAccountIds;

@Repository
public interface RequestAccountIdsRepo extends MongoRepository<RequestAccountIds,String>{

}
