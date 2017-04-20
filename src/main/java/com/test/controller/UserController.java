package com.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.test.model.User;


@RestController
public class UserController {
/*	@ApiImplicitParams({
		        @ApiImplicitParam(paramType="header",name="username",dataType="String",required=true,value="用户的姓名",defaultValue="zhaojigang"),
		         @ApiImplicitParam(paramType="query",name="password",dataType="String",required=true,value="用户的密码",defaultValue="wangna")
		     })*/
		     @RequestMapping(value="/getUser/{username}",method=RequestMethod.GET)
		     public JSONObject getUser(@PathVariable("username") String username) {
		    	 JSONObject j=new JSONObject();
		    	 j.put("username", username);
		    	 return j;
		     }
		     
		     @RequestMapping(value="/userupdate",method=RequestMethod.POST)
		     public String getUser(@RequestBody User user) {
		        return "--------hello world----";
		     }
}
