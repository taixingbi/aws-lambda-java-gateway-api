package com.hello;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Handler implements RequestHandler<Object, String>{
    private static final Logger logger = LoggerFactory.getLogger(Handler.class.getName());

    @Override
    public String handleRequest(Object object, Context context)
    {
        logger.debug("\n------------------start---------------------");
        logger.debug("------------------end---------------------\n");
        String response = new String("200 OK");
        return response;
    }
}







