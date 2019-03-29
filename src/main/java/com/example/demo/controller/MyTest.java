package com.example.demo.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import  java.util.Properties;
import  java.util.concurrent.ConcurrentLinkedQueue;

@Component
@Configuration
@EnableAutoConfiguration
@EnableScheduling
public class MyTest {

    public static void main(String[] args) {


        System.out.println("hello world");
        String jsonStr = "{\"id\":\"3\",\"name\":\"bobaaaaass\",\"pass\":\"123\"}";

        JSONObject jsonObject =     new JSONObject(jsonStr);
        System.out.println(jsonObject.get("name"));

       /* String jsonStr = "{\"id\":\"3\",\"name\":\"bob\",\"pass\":\"123\"}";
        JSONObject jsonObj = JSONObject.fromObject(jsonStr);
        System.out.println(jsonObj.get("name"));
        String arrStr = "[{\"id\":\"3\",\"name\":\"bob\",\"pass\":\"123\"},{\"id\":\"4\",\"name\":\"lancy\",\"pass\":\"134\"}]";
        JSONArray jsonArr = JSONArray.fromObject(arrStr);
        System.out.println(jsonArr.getJSONObject(1).get("name"));
        Iterator<Object> it = jsonArr.iterator();		while(it.hasNext()){
            JSONObject obj = (JSONObject)it.next();
            System.out.println("name:"+obj.get("name")+" pass:"+obj.get("pass"));
        }*/


    }

/*    public void sendEmail(){




    }
    */


}
