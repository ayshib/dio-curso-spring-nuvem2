package ays.dio.servico;

import ays.dio.domain.model.Usuario;

public interface UsuarioServico {

    Usuario procurarPorId(Long id);
    Usuario create(Usuario usuario);
}
