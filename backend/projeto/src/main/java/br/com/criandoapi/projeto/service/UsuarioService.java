package br.com.criandoapi.projeto.service;

import br.com.criandoapi.projeto.Repository.IUsuario;
import br.com.criandoapi.projeto.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private IUsuario repository;

    public UsuarioService(IUsuario repository) {
        this.repository = repository;
    }

    public List<Usuario> listarUsuario() {
        List<Usuario> lista = repository.findAll();
        return lista;
    }

    public Usuario criarUsuario(Usuario usuario) {
        Usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    public Usuario editarUsuario(Usuario usuario) {
        Usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    public boolean excluirUsuario(Integer id) {
        repository.deleteById(id);
        return true;
    }
}