package mx.edu.utez.sda.practica_dave.controller;

import mx.edu.utez.sda.practica_dave.DTO.CaptchResponse;
import mx.edu.utez.sda.practica_dave.services.CaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import

@RestController
@CrossOrigin(origins = "*",methods = {
        RequestMethod.POST, RequestMethod.OPTIONS
})
@RequestMapping("/api/captcha")
public class CaptchController {

    @Autowired
    private CaptchaService captchaService;

    @PostMapping("/verificar-captcha")
    public CaptchResponse verificarCaptcha(
            @RequestParam("solution") String solution
    ){
        return captchaService.verificarCaptcha(solution);
    }

}
