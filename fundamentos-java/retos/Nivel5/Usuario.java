package Nivel5;

public class Usuario {
    //datos del usuario
    private String nombre;
    private String login; 
    private String password;

    //Constructor 
    public Usuario(String nombre, String login, String password){
        this.nombre = nombre; 
        this.login = login; 
        this.password = password;
    };

    

    public Usuario() {
    }



    //getters and setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login; 
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return nombre + " (login: " + login + ")";
    }
}
