public class Grupo
{
    private String nombreMateria;
    private Estudiante[] estudiantes;
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nombreMateria=nomMateria;
    }
    public void inscribir(Estudiante unEstudiante)
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i] == null)
            {
                estudiantes[i] =unEstudiante;
            }
        }
    }
    public void baja(int claveUnica)
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i].dimeClave() == claveUnica)
            {
                estudiantes[i] = null;
            }
        }
    }
}