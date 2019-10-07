package cds.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import cds.model.ResponseCommonCustomer;

@Repository
public interface ResponseCommonCustomerRepo extends MongoRepository<ResponseCommonCustomer,String>{

}
