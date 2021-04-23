public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String enfermedad;
    private int urgencia;
    Tools herramienta = new Tools();

    public Paciente(String nombre,String enfermedad,int urgencia){
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.urgencia = urgencia;
    }

    public int getUrgencia(){
        return urgencia;
    }

    public boolean igual(Paciente comparando){
        return this.getUrgencia() == comparando.getUrgencia();
    }

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

    @Override
    public String toString() {
        return "    Paciente" + "   nombre='" + nombre + '\'' + ",  enfermedad='" + enfermedad + '\'' + ",  urgencia=" + herramienta.StringToNum(urgencia) ;
    }
}
