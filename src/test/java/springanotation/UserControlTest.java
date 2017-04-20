package springanotation;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.test.controller.HttpClientUtil;

public class UserControlTest {
	@Test
	public void userTest(){
		/*HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("userName", "123");
		map.put("email", "123");
		HttpEntity<String> requestEntity = new HttpEntity<String>(JSONObject.toJSONString(map), headers);
		RestTemplate rest=new RestTemplate();
		ResponseEntity<String> exchange =rest.exchange("http://localhost:8081/san/userupdate", HttpMethod.POST, requestEntity, String.class,map);
		JSONObject json=JSONObject.parseObject(exchange.getBody());*/
		try {
			/*String s1=HttpClientUtil.httpGetRequest("http://localhost:8081/san/getUser/1234");
			System.out.println("--"+s1);*/
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("userName", "123");
			map.put("email", "123");
			JSONObject jsonObject=new JSONObject();
			jsonObject.putAll(map);
			String	s = HttpClientUtil.httpPostRequest("http://localhost:8081/san/userupdate",jsonObject);
			System.out.println("----#$%---"+s);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
