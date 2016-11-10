
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //guarda el valor del atributo hora
    private NumberDisplay horas;
    //guarda el valor del atributo minutos
    private NumberDisplay minutos;
    
    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
    }
    public void fijarHora(int hour,int minutes)
    {
        horas.setValue(hour);
        minutos.setValue(minutes);
    }
    public void increment()
    {
        minutos.increment();
        if(minutos.getValue() == 0){
            //Si estamos aqui es que hay que hacer avanzar las horas
            horas.increment();
        }
    }
    public String mostrarHora()
    {
        return horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
}
