package edu.bjtu.sse.db.contract.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.util.Date;

public class HttpSender {
    public static String HttpRestClient(String url, HttpMethod method, JSONObject json) throws IOException {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(10 * 1000);
        requestFactory.setReadTimeout(10 * 1000);
        RestTemplate client = new RestTemplate(requestFactory);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON_UTF8);
        HttpEntity<String> requestEntity = new HttpEntity<String>(json.toString(), headers);
        //  执行HTTP请求
        ResponseEntity<String> response = client.exchange(url, method, requestEntity, String.class);
        return response.getBody();
    }

    public static void main(String args[]) {
        try {
            //api url地址
            String url = "http://127.0.0.1:8080/assignContractProcess";
            //post请求
            HttpMethod method = HttpMethod.POST;
            JSONObject json = new JSONObject();
            String str = "{\"data\": [\n" +
                    "     {\"counterSign\": [{\"uId\": 123456,\"cNum\": \"123457\",\"content\": \"countSign\"},\n" +
                    "\t\t{\"uId\": 123457,\"cNum\": \"123457\",\"content\": \"countSign\"}]},\n" +
                    "\n" +
                    "    {\"approval\": [{\"uId\": 123458,\"cNum\": \"123457\",\"content\": \"approval\"},\n" +
                    "    \t          {\"uId\": 123459,\"cNum\": \"123457\",\"content\": \"approval\"}]},\n" +
                    "     \n" +
                    "    {\"sign\": [{\"uId\": 123455,\"cNum\": \"123457\",\"content\": \"approval\"},\n" +
                    "\t{\"uId\": 123454,\"cNum\": \"123457\",\"content\": \"approval\"}]}\n" +
                    " ]\n" +
                    "}";
            json = JSON.parseObject(str);
            System.out.print("发送数据：" + json.toString());
            //发送http请求并返回结果
            String result = HttpSender.HttpRestClient(url, method, json);
            System.out.print("接收反馈：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}