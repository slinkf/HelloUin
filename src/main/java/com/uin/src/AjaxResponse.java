package com.uin.src;

public class AjaxResponse {
     private boolean isOk;
     private int code;
     private String message;
     private Object data;

     public static AjaxResponse success(Object data){
          AjaxResponse ajaxResponse = new AjaxResponse();
          ajaxResponse.code =200;
          ajaxResponse.isOk = true;
          ajaxResponse.data =data;
          return  ajaxResponse;
     }

     public static AjaxResponse success(){
          AjaxResponse ajaxResponse = new AjaxResponse();
          ajaxResponse.code =200;
          ajaxResponse.isOk = true;
          ajaxResponse.message ="请求成功";
          return  ajaxResponse;
     }
}
