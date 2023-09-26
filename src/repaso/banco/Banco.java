package repaso.banco;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<CuentaBancaria> cuentas;

    public Banco (){
        clientes = new ArrayList<Cliente>();
        cuentas = new ArrayList<CuentaBancaria>();
    }

    public Banco (ArrayList<Cliente> clientes, ArrayList<CuentaBancaria> cuentas){
        this.clientes = clientes;
        this.cuentas = cuentas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public void agregar_cliente (Cliente cliente){
        clientes.add(cliente);
    }
    public void eliminar_cliente (Cliente cliente){
        clientes.remove(cliente);
        for (CuentaBancaria cuenta : cuentas){
            if (cuenta.getTitular().equals(cliente)){
                cuentas.remove(cuenta);
            }
        }
    }
    public void modificar_cliente (Cliente cliente_viejo, Cliente cliente_nuevo){
        for (CuentaBancaria cuenta : cuentas){
            if (cuenta.getTitular().equals(cliente_viejo)){
                cuenta.setTitular(cliente_nuevo);
            }
        }
        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i).equals(cliente_viejo)){
                clientes.set(i, cliente_nuevo);
            }
        }
    }

    public void agregar_cuenta (CuentaBancaria cuenta){
        cuentas.add(cuenta);
        if (!clientes.contains(cuenta.getTitular())){
            clientes.add(cuenta.getTitular());
        }
    }
    public void eliminar_cuenta (CuentaBancaria cuenta){
        cuentas.remove(cuenta);
    }
    public void modificar_cuenta (CuentaBancaria cuenta_vieja, CuentaBancaria cuenta_nueva){
        for (int i = 0; i < cuentas.size(); i++){
            if (cuentas.get(i).equals(cuenta_vieja)){
                cuentas.set(i, cuenta_nueva);
            }
        }
    }

    public void cliente_cbu (String cuil){
        for (CuentaBancaria cuenta : cuentas){
            if (cuenta.getTitular().getCuil().equals(cuil)){
                System.out.println("CBU: " + cuenta.getCbu());
            }
        }
    }

}
