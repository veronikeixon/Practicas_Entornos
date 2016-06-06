
package crewmanagement;

import java.util.Scanner;
/**
 * Clase Empleados, donde se guardarán los datos de estos.
 * @author VMARIBL
 */
public class Employee {
    String Name, Surname, Fullname, DNI; 
    Turn[] asig_turn = new Turn[7];
    int cont=0;
    Scanner keyboard = new Scanner(System.in);

/*Creamos constructores de clase, por defecto y sobrecargados*/   
    public Employee (){
    }
    public Employee (String aName, String aSurname){
        this.Name=aName;
        this.Surname=aSurname;
    }
    public Employee (String aDNI, String aName, String aSurname){
        this.DNI=Val_DNI(aDNI);
        this.Name=aName;
        this.Surname=aSurname;        
    }
    
    
/***********Métodos SETTER para recoger los datos del usuario***************/
    
    /**
     * Método para calcular la letra del DNI y comprar que es un num válido.
     * @param DNI
     */
    public void setDNI(String DNI) {
        this.DNI=Val_DNI (DNI);
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }   
    
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }
    
    public void addTurn(Turn asig_turn){
        if (cont <= 6 && asig_turn!=null){
            this.asig_turn[cont] = asig_turn;
            cont++;
            if (cont>=7){
                cont=7;
            }
        }
    }
    
    public void removeTurn (String aDay){
        boolean borrarOk=false; 
        if (aDay != null){
            for (int pos=0; pos<=6; pos++){
                if (asig_turn [pos]!=null){
                    if (aDay.equals(asig_turn[pos].Day) == true){
                        borrar(asig_turn, pos);
                        borrarOk=true;  
                    }
                }
            }   
        } 
    }

/*********Métodos GETTER para obtener los datos del usuario***************/

    /**
     * Método para mostrar el DNI
     * @return DNI
     */
    public String getDNI() {
        return DNI;
    }
    
    /**
     * Método para mostrar el nombre
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Método para mostrar el Apellido
     * @return Surname
     */
    public String getSurname() {
        return Surname;
    }

    public String getFullName(boolean namelnUpperCase, boolean surnamelnUpperCase) {
        if (Name!=null && Surname!=null){
            Fullname=Name + ", " + Surname;
            if (namelnUpperCase==true){
                Fullname= Name.toUpperCase() + ", " + Surname;
            }
            if (surnamelnUpperCase==true){
                Fullname= Name + ", " + Surname.toUpperCase();
            }
            if (namelnUpperCase==true && surnamelnUpperCase==true){
                Fullname=Fullname.toUpperCase();
            }
        }
        if (Name==null && Surname!=null){
            Fullname=Surname;
                if (surnamelnUpperCase==true){
                    Fullname=Surname.toUpperCase();
                }
        }
        if (Surname==null && Name!=null){
            Fullname=Name;
            if (namelnUpperCase==true){
                Fullname=Name.toUpperCase();
            }  
        }
        if (Name==null && Surname==null){
            Fullname="";
        }
        return Fullname;
    }
    
    int getTurnCount(){
        return cont;
    }    
    
    public Turn getTurnAt (int anIndex){ 
        try{
            if (asig_turn[anIndex]!=null && anIndex <= 6 && anIndex >=0 ){
                return asig_turn [anIndex];                
            }
            else
            {
            return null;                
            }
        }
        catch (Exception e){
            return null;
        }
    }
    
    public Turn[] getTurns(){

        Turn[] turnos=new Turn[cont];
        for (int pos = 0; pos<cont; pos++){
            if (asig_turn[pos]!=null){
                turnos[pos]=this.asig_turn[pos];
            }
        }
        return turnos;    
    }


    
/*********Métodos de validación de datos introducidos***************/
    
    /*Válida que el DNI tenga la longitud correcta*/
    String Val_DNI (String DNI){
    
        char letrasDNI []={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int numDNI, mod23;
        char letraOK, letra;
        
        if (DNI!=null){
            this.DNI=DNI.toUpperCase();
            if (this.DNI.length() == 9){
                try {
                /*pasamos los numeros del DNI a int y la letra a char*/    
                    numDNI= Integer.parseInt (this.DNI.substring(0, 8));
                    mod23=numDNI%23;
                    letraOK=letrasDNI[mod23];
                    letra=this.DNI.charAt(8);
                                        
                /*comparador de la letra final con la letra correcta*/
                    if (letra == letraOK){
                        return this.DNI;
                    } 
                    else{
                        return null;                        
                    }
                }
                catch(Exception e){
                    return null;
                }
            }
            else{
                return null;
            }
        }
        else {
            return null;
        }
    }  
  
    Turn [] borrar (Turn [] borrado, int num){
       
        for(int i=num; i<6; i++){
            borrado[i]= borrado[i+1];
        }
        borrado[6]=null;
        cont--;
        return borrado; 
    }   
}


