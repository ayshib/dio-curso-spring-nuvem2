package ays.dio.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import ays.dio.domain.model.Usuario;
import ays.dio.servico.UsuarioServico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.net.URI;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    private final UsuarioServico usuarioServico;

    public UsuarioControlador(UsuarioServico usuarioServico) {

        this.usuarioServico = usuarioServico;
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> procurarPorId(@PathVariable Long id) {

        var u = usuarioServico.procurarPorId(id);
        return ResponseEntity.ok(u);
    }
 
    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario) {

        var ret = usuarioServico.create(usuario);
        try {
            URI loc = new URI(ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/id")
                .buildAndExpand(ret.getId())
                .toUriString());
            return ResponseEntity.created(loc).body(ret);
        } catch(Exception e) {}
        
        //Expondo endpoints rest testando api 10:50
        
        return ResponseEntity.ok(ret);
    }
}
