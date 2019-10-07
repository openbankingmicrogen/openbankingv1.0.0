package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListBalancesBulkP;
import cds.model.ListBalancesBulkResponseWrapper;
import cds.services.ListBalancesBulkI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListBalancesBulkImpl implements ListBalancesBulkI {
 
    private static final Log logger = LogFactory.getLog(ListBalancesBulkImpl.class);
   
    public ListBalancesBulkResponseWrapper reliable(ListBalancesBulkP pojo){ 
		//TODO
		return new ListBalancesBulkResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListBalancesBulkResponseWrapper execute(ListBalancesBulkP requestParams){
        //TODO
        return new ListBalancesBulkResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
