package ays.dio.servico.impl;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import ays.dio.domain.model.Usuario;
import ays.dio.domain.repositorio.UsuarioRepositorio;
import ays.dio.servico.UsuarioServico;

@Service
public class UsuarioServicoImpl implements UsuarioServico {

    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicoImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario create(Usuario usuario) {
        
        if(usuario.getId() != null && usuarioRepositorio.existsById(usuario.getId()))
            throw new IllegalArgumentException("usuario ja existe");

        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario procurarPorId(Long id) {
        
        return usuarioRepositorio.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
