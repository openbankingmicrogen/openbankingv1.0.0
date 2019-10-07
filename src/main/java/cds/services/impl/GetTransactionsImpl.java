package cds.services.impl;
 
import java.util.*;
 
import cds.model.GetTransactionsP;
import cds.model.GetTransactionsResponseWrapper;
import cds.services.GetTransactionsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetTransactionsImpl implements GetTransactionsI {
 
    private static final Log logger = LogFactory.getLog(GetTransactionsImpl.class);
   
    public GetTransactionsResponseWrapper reliable(GetTransactionsP pojo){ 
		//TODO
		return new GetTransactionsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetTransactionsResponseWrapper execute(GetTransactionsP requestParams){
        //TODO
        return new GetTransactionsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
