package cds.services.impl;
 
import java.util.*;
 
import cds.model.GetOutagesP;
import cds.model.GetOutagesResponseWrapper;
import cds.services.GetOutagesI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetOutagesImpl implements GetOutagesI {
 
    private static final Log logger = LogFactory.getLog(GetOutagesImpl.class);
   
    public GetOutagesResponseWrapper reliable(GetOutagesP pojo){ 
		//TODO
		return new GetOutagesResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetOutagesResponseWrapper execute(GetOutagesP requestParams){
        //TODO
        return new GetOutagesResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
