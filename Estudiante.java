public class Estudiante
{
    private String nombre="";
    private int clave;
    public Estudiante(String nombreIni, int claveIni)
    {
        nombre=nombreIni;
        clave=claveIni;
    }
    /**
     * Permite aceder a la clave unica del estudiante
     * @return regresa la clave del estudiatne
     */
    public int dimeClave()
    {
        return clave;
    }
    /**
     * Muestra los dellates sobre el estudiante
     */
    public String dimeDetalles()
    {
        return "Clave: "+clave+" Nombre: "+nombre;
    }
}