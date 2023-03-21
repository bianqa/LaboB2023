import java.text.DateFormatSymbols;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        this.dia = 21;
        this.mes = 3;
        this.anio = 2023;
    }

    public Fecha (int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean anio_bisciesto(){
        return anio % 4 == 0;
    }

    public void valida(){
        if (dia > 31){
            dia = 1;
        }
        if (mes > 12){
            mes =1;
        }
        if (anio > 2023){
            anio = 1900;
        }
        if ( (mes==4 || mes==6 || mes==9 || mes==11) && dia > 30){
            dia = 1;
            mes = 1;
        }
        if (mes==2) {
            if (anio_bisciesto() && dia > 29) {
                dia = 1;
                mes = 1;
            } else if (!anio_bisciesto() && dia > 28) {
                dia = 1;
                mes = 1;
            }
        }
    }

    public int diasMes (int mes){
        if (mes==1 ||  mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            return 31;
        } else if(mes==4 || mes==6 || mes==9 || mes ==11){
            return 30;
        } else{
            return 28;
        }
    }

    public void corta(){
        if (dia > 9 && mes > 9){
            System.out.println(dia + "-" + mes + "-" + anio);
        } else if (dia < 10 && mes < 10){
            System.out.println("0" + dia + "-0" + mes + "-" + anio);
        } else if (dia > 9){
            System.out.println(dia + "-0" + mes + "-" + anio);
        } else {
            System.out.println("0" + dia + "-" + mes + "-" + anio);
        }
    }

    public String getMonth() {
        return new DateFormatSymbols().getMonths()[mes-1];
    }

    public void largo(){
        Date date = new Date(anio-1900,mes-1,dia);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Format f = new SimpleDateFormat("EEEE");
        String str = f.format(date);
        System.out.println(str + " " + dia + " de " + getMonth() + " de " + anio);
    }


}
