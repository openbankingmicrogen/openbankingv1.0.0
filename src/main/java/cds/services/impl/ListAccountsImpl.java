package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListAccountsP;
import cds.model.ListAccountsResponseWrapper;
import cds.services.ListAccountsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListAccountsImpl implements ListAccountsI {
 
    private static final Log logger = LogFactory.getLog(ListAccountsImpl.class);
   
    public ListAccountsResponseWrapper reliable(ListAccountsP pojo){ 
		//TODO
		return new ListAccountsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListAccountsResponseWrapper execute(ListAccountsP requestParams){
        //TODO
        return new ListAccountsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
