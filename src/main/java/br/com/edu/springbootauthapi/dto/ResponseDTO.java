package br.com.edu.springbootauthapi.dto;

import java.time.LocalDateTime;

public record ResponseDTO(String message, LocalDateTime date) {
}
