
package crewmanagement;

import java.util.Scanner;

/**
 * Clase Turn para guardar los turnos de los empleados
 *
 * @author VERONICA MARIBLANCA
 */
public class Turn {
    String Day;
    int InitHour;
    int FinishHour;

    Scanner keyboard = new Scanner(System.in);

    /* Constructor de clase por defecto*/
    public Turn() {
    }

    /*Constructor sobrecargado para una cadena de caráteres para almacenar el día de la semana*/
    public Turn(String aDay) {
        this.Day = aDay;
    }

    /*Constructor sobrecargado para el día y las horas de inicio y fin del turno*/
    public Turn(String aDay, int aInitHour, int aFinishHour) {
        this.Day = aDay;
        this.InitHour = aInitHour;
        this.FinishHour = aFinishHour;
    }

    /**
     * Método para guardar el día del turno. Comprueba que coincide con uno de
     * los días de la semana
     *
     * @param Day
     */
    public void setDay(String Day) {
        if (Day !=null){
            this.Day = Day.toUpperCase();
            switch (this.Day) {
                case "MONDAY":
                case "TUESDAY":
                case "WEDNESDAY":
                case "THURSDAY":
                case "FRIDAY":
                case "SATURDAY":
                case "SUNDAY": {
                    break;
                }
                default: {
                    this.Day=null;
                }
            }
        }
        
    }

    /**
     * Método para guardar hora de inicio del turno
     *
     * @param InitHour
     */
    public void setInitHour(int InitHour) {
        if (InitHour >= 0 && InitHour < 24) {
            this.InitHour = InitHour;
        }
    }

    /**
     * Método para guardar hora final del turno
     *
     * @param FinishHour
     */
    public void setFinishHour(int FinishHour) {
        if (FinishHour >= 0 && FinishHour < 24){
            this.FinishHour = HoraMayor(InitHour, FinishHour);
        }       
    }

    /**
     * Métodos para retornar los valores --> GETTER
     *
     * @return Day, InitHour, FinishHour
     */
    public String getDay() {
        return Day.toUpperCase();
    }

    public int getInitHour() {
        return InitHour;
    }

    public int getFinishHour() {
        return FinishHour;
    }


    /* Función para comprobar que la hora de finalización de turno sea mayor que la de inicio*/
    int HoraMayor(int I_Hour, int F_Hour) {
        if (F_Hour > I_Hour){
            return F_Hour;
        }
        else{
            return 0;
        }
    }
}
