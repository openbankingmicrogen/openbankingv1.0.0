package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListBalanceP;
import cds.model.ListBalanceResponseWrapper;
import cds.services.ListBalanceI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListBalanceImpl implements ListBalanceI {
 
    private static final Log logger = LogFactory.getLog(ListBalanceImpl.class);
   
    public ListBalanceResponseWrapper reliable(ListBalanceP pojo){ 
		//TODO
		return new ListBalanceResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListBalanceResponseWrapper execute(ListBalanceP requestParams){
        //TODO
        return new ListBalanceResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
