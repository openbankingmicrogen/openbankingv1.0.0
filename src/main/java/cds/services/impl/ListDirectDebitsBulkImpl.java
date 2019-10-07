package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListDirectDebitsBulkP;
import cds.model.ListDirectDebitsBulkResponseWrapper;
import cds.services.ListDirectDebitsBulkI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListDirectDebitsBulkImpl implements ListDirectDebitsBulkI {
 
    private static final Log logger = LogFactory.getLog(ListDirectDebitsBulkImpl.class);
   
    public ListDirectDebitsBulkResponseWrapper reliable(ListDirectDebitsBulkP pojo){ 
		//TODO
		return new ListDirectDebitsBulkResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListDirectDebitsBulkResponseWrapper execute(ListDirectDebitsBulkP requestParams){
        //TODO
        return new ListDirectDebitsBulkResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
