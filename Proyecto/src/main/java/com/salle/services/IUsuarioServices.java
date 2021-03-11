package com.salle.services;
import java.util.List;
import com.salle.entities.Usuario;
public interface IUsuarioServices {
	public List<Usuario> findAll();
	public Usuario create(Usuario usuario);
}
