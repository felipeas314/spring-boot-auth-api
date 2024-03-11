package br.com.edu.springbootauthapi.controller;

import br.com.edu.springbootauthapi.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequestMapping("/open")
@RestController
public class OpenController {

    public ResponseEntity<ResponseDTO> openResource() {
        ResponseDTO response = new ResponseDTO("Endpoint aberto acessado com sucesso", LocalDateTime.now());
        return ResponseEntity.ok(response);
    }
}
