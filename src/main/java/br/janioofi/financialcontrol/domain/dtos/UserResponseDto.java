package br.janioofi.financialcontrol.domain.dtos;

public record UserResponseDto(
        Long idUser,
        String email,
        String password
) {
}