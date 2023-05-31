import java.util.HashSet;

public class AlturaPeso {
    private HashSet<Paciente> pacientes;

    public AlturaPeso (){
        pacientes = new HashSet<Paciente>();
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(HashSet<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void agregar_paciente (Paciente paciente){
        pacientes.add(paciente);
    }

    public void medirse_pesarse (Paciente paciente_ingresado, double altura, double peso, Fecha fecha){
        if (pacientes.contains(paciente_ingresado)){
            for (Paciente paciente : pacientes){
                if (paciente.equals(paciente_ingresado)){
                    paciente.agregar_altura(altura, fecha);
                    paciente.agregar_peso(peso, fecha);
                }
            }
        }
    }

    public void consultar_peso_altura (Paciente paciente_ingresado, Fecha fecha){
        for (Paciente paciente : pacientes){
            if (paciente.equals(paciente_ingresado)){
                System.out.println("Paciente " + paciente.getNombre() + " " + paciente.getApellido() + " " + fecha.mostrar() + ":");
                System.out.println(paciente.getAltura().get(fecha));
                System.out.println(paciente.getPeso().get(fecha) + "kg.");
            }
        }
    }

    public double porcentaje_altura (Paciente paciente_ingresado, int anio1, int anio2){
        Fecha menor, mayor;
        double porcentaje = 0;
        for (Paciente paciente : pacientes){
            if (paciente.equals(paciente_ingresado)){
                menor = new Fecha(0,0,0);
                mayor = new Fecha(0,0,0);
                for (Fecha fecha : paciente.getAltura().keySet()){
                    if (fecha.getAnio() == anio1){
                        if (fecha.menor_que(menor)){
                            menor = fecha;
                        }
                    } else if (fecha.getAnio() == anio2){
                        if (!fecha.menor_que(mayor)){
                            mayor = fecha;
                        }
                    }
                }
                porcentaje = paciente.getAltura().get(mayor) - paciente.getAltura().get(menor);
                porcentaje = porcentaje * 100 / paciente.getAltura().get(mayor);
            }
        }
        return porcentaje;
    }
}
