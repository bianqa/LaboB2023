public class MainExcepciones {
    public static int metodoLength (String nombre) throws NullPointerException{
        return nombre.length();
    }
    public static void main(String[] args) {
        String nombre = null;

        // Try/Catch
        try{
            System.out.println("El largo del nombre es:"+ nombre.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        // Throw
        try{
            if (nombre == null){
                throw new NullPointerException("No se puede saber el largo del nombre si es null");
            }
            System.out.println("El largo del nombre es:"+ nombre.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // Throws
        try{
            System.out.println("El largo del nombre es:"+ metodoLength(nombre));
        } catch (NullPointerException e) {
            System.out.println("error string vacio");
        }

        // Clase personalizada
        try{
            if (nombre == null){
                throw new StringVacioExcepcion("No se puede saber el largo del nombre si es null");
            }
            System.out.println("El largo del nombre es:"+ nombre.length());
        } catch (StringVacioExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
