package modelo;

public class Entity_Usuarios {
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrase�a;
	private String perfil_usuario;
	private int ID_Usuarios;
	
	public int getID_Usuarios() {
		return ID_Usuarios;
	}
	public void setID_Usuarios(int iD_Usuarios) {
		ID_Usuarios = iD_Usuarios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public String getPerfil_usuario() {
		return perfil_usuario;
	}
	public void setPerfil_usuario(String perfil_usuario) {
		this.perfil_usuario = perfil_usuario;
	}
	

}
