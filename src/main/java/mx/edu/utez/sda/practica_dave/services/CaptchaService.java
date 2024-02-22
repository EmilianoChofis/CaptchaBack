package mx.edu.utez.sda.practica_dave.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class CaptchaService {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${FRIENDLYCAPTCHA.CAPTCHAKEY}")
    private String captchaKey;
    @Value("${FRIENDLYCAPTCH.SITKEY}")
    private String siteKey;

    //construccion de la solicitud
    Map<String, String> requestBody = new HashMap<>();
    requestBody.put("solution", solution);
    requestBody.put("secret", secret);
    requestBody.put("sitekey", sitekey);

    HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(requestBody, headers);

    ResponseEntity<CaptchaResponse> responseEntity = restTemplate.postForEntity(url,requestEntity, CaptchaResponse )

}
