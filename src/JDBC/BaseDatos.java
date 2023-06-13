package JDBC;

import java.sql.*;
//meter la carpeta adentro de src

//antes d ejecutar el codigo hay q ir a File, Project Structure, Modules, el +, 1 JARs or Directories,
// seleccionan el archivo .jar q esta en la carpeta y ponen OK, seleccionan el archivo y ponen apply
public class BaseDatos {
    private Connection conexion;
    private String url;
    private String username;
    private String password;

    public BaseDatos (String nombreBase, String username, String password){
        url = "jdbc:mysql://localhost:3306/" + nombreBase;
        this.username = username;
        this.password = password;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void conectarBase (){
        try {
            conexion = DriverManager.getConnection(url, username, password);
            if (conexion != null) {
                System.out.println("Se ha conectado exitosamente con la base de datos");
            } else {
                System.out.println("No se ha podido conectar con la base de datos");
            }
        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    public void consultarBase (String consulta){
        conectarBase();
        try{
            Statement statement = conexion.createStatement(); // nose q es pero es necesario para hacer una consulta
            ResultSet resultado = statement.executeQuery(consulta);
            while (resultado.next()){ // para mostrar varios resultados 1 por 1
                String name = resultado.getString("nombre"); // "nombre" es el nombre del atributo d la tabla en la base
                System.out.println(name);
            }
            resultado.close();
            statement.close();
            conexion.close();
        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BaseDatos base = new BaseDatos("prueba", "alumno", "alumnoipm");
        base.consultarBase("SELECT * FROM tabla");
    }
}