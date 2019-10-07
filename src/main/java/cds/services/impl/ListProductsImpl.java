package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListProductsP;
import cds.model.ListProductsResponseWrapper;
import cds.services.ListProductsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListProductsImpl implements ListProductsI {
 
    private static final Log logger = LogFactory.getLog(ListProductsImpl.class);
   
    public ListProductsResponseWrapper reliable(ListProductsP pojo){ 
		//TODO
		return new ListProductsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListProductsResponseWrapper execute(ListProductsP requestParams){
        //TODO
        return new ListProductsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
