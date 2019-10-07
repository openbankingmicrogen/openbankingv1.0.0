package cds.services.impl;
 
import java.util.*;
 
import cds.model.GetProductDetailP;
import cds.model.GetProductDetailResponseWrapper;
import cds.services.GetProductDetailI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetProductDetailImpl implements GetProductDetailI {
 
    private static final Log logger = LogFactory.getLog(GetProductDetailImpl.class);
   
    public GetProductDetailResponseWrapper reliable(GetProductDetailP pojo){ 
		//TODO
		return new GetProductDetailResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetProductDetailResponseWrapper execute(GetProductDetailP requestParams){
        //TODO
        return new GetProductDetailResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
