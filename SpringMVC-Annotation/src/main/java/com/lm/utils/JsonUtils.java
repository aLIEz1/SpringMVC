package com.lm.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author super
 */
public class JsonUtils {
    public static String getJson(Object object){
        return getJson(object,"");
    }
    public static String getJson(Object object,String sdf) {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS,false);
        final SimpleDateFormat format = new SimpleDateFormat(sdf);
        mapper.setDateFormat(format);
        try {
            return mapper.writeValueAsString(object);
        }catch (JsonProcessingException e){
            e.printStackTrace();

        }
        return null;

    }
}
