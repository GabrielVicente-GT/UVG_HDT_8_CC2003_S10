/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String enfermedad;
    private int urgencia;
    Tools herramienta = new Tools();

    /***
     * Constructor de paciente
     * @param nombre nombre del paciente
     * @param enfermedad enfermedad que padece
     * @param urgencia numero que indica la urgencia (1-5)
     */
    public Paciente(String nombre,String enfermedad,int urgencia){
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.urgencia = urgencia;
    }

    /***
     * Return de urgenca
     * @return urgencia value
     */
    public int getUrgencia(){
        return urgencia;
    }

    /***
     * dice si los valores son iguales, de ser ese el caso se dejan juntos
     * @param comparando instancia de Paciente
     * @return true si son iguales, false si son diferentes
     */
    public boolean igual(Paciente comparando){
        return this.getUrgencia() == comparando.getUrgencia();
    }

    /***
     * Sirve para comparar un Paciente con otro, al igual que sus valores.
     * @param other
     * @return
     */
    @Override
    public int compareTo(Paciente other){
        if (this.equals(other)){
            return 0;
        }else if (getUrgencia()>other.getUrgencia()){
            return 1;
        }else{
            return -1;
        }
    }

    /***
     * Impresion de los valores de un paciente
     * @return String con todos los datos del paciente
     */
    @Override
    public String toString() {
        return "    Paciente" + "   nombre='" + nombre + '\'' + ",  enfermedad='" + enfermedad + '\'' + ",  urgencia=" + herramienta.StringToNum(urgencia) ;
    }
}
