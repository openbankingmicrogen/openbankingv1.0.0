package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListPayeesP;
import cds.model.ListPayeesResponseWrapper;
import cds.services.ListPayeesI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListPayeesImpl implements ListPayeesI {
 
    private static final Log logger = LogFactory.getLog(ListPayeesImpl.class);
   
    public ListPayeesResponseWrapper reliable(ListPayeesP pojo){ 
		//TODO
		return new ListPayeesResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListPayeesResponseWrapper execute(ListPayeesP requestParams){
        //TODO
        return new ListPayeesResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
