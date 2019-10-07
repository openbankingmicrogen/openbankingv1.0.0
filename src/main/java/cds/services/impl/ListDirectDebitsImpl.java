package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListDirectDebitsP;
import cds.model.ListDirectDebitsResponseWrapper;
import cds.services.ListDirectDebitsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListDirectDebitsImpl implements ListDirectDebitsI {
 
    private static final Log logger = LogFactory.getLog(ListDirectDebitsImpl.class);
   
    public ListDirectDebitsResponseWrapper reliable(ListDirectDebitsP pojo){ 
		//TODO
		return new ListDirectDebitsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListDirectDebitsResponseWrapper execute(ListDirectDebitsP requestParams){
        //TODO
        return new ListDirectDebitsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
