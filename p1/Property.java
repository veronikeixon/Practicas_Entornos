/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertyshop;

/**
 *
 * @author VERONICA MARIBLANCA
 */
public class Property {
    String Name;
    String Address;
    double ConstructedSurface;
    double AvaliableSurface;
    String Owner; 
    String OwnerAddress;
    int Price;

    /**
     * MÃ©todo para guardar el nombre de la propiedad en minusculas
     * @param Name --> Guarda el nombre 
     */
    public void setName(String Name) {
        if (Name!=null){
            this.Name = Name.toLowerCase();    
        }
    }
    /**
     * MÃ©todo para guardar la direcciÃ³n de la propiedad en MAYUSCULAS
     * @param Address --> Guarda la direcciÃ³n
     */
    public void setAddress(String Address) {
        if (Address!=null){
            this.Address = Address.toUpperCase();
        }
    }
    /**
     * MÃ©todo para guardar el nÃºmero de metros contruidos, siempre que el dato 
     * introducido sea mayor de 0. Si no es asÃ­ no se actualizarÃ¡n los metros
     * construÃ­dos. 
     * @param ConstructedSurface --> Guarda el nÃºmero de metros construidos en
     * formato double
     */
    public void setConstructedSurface(double ConstructedSurface) {
        if (ConstructedSurface > 0) {
            this.ConstructedSurface = ConstructedSurface;
        }
    }
    /**
     * MÃ©todo para guardar los metros Ãºtiles de cada propiedad cuando el dato
     * introducido sea mayor que 0. Si no es asÃ­ el dato no se actualizarÃ¡.
     * @param AvaliableSurface 
     */
    public void setAvaliableSurface(double AvaliableSurface) {
        if (AvaliableSurface > 0) {
            this.AvaliableSurface = AvaliableSurface;
        }
    }
    /**
     * MÃ©todo para guardar el nombre de propietario de la propiedad.
     * @param Owner 
     */
    public void setOwner(String Owner) {
        if (Owner!=null){
            this.Owner = Owner;
        }
    }
    /**
     * MÃ©todo para guardar la direcciÃ³n del porpietario, no la de la propiedad. 
     * @param OwnerAddress 
     */
    public void setOwnerAddress(String OwnerAddress) {
        if (OwnerAddress!=null){
            this.OwnerAddress = OwnerAddress;
        }
    }
    /**
     * MÃ©todo para guardar el precio de venta la propiedad indicada. 
     * @param Price 
     */
    public void setPrice(int Price) {
        if (Price >=0) {
            this.Price = Price;
        }
    }

/**
 * MÃ©todo que lee el nombre de la propiedad. 
 * @return Name
 */
    public String getName() {
        return Name;
    }
    /**
     * MÃ©todo que lee la direcciÃ³n de la propiedad
     * @return Address
     */
    public String getAddress() {
        return Address;
    }
    /**
     * MÃ©todo que lee el valor de los metros contruÃ­dos de la propiedad
     * @return ConstrutedSurface
     */
    public double getConstructedSurface() {
        return ConstructedSurface;
    }
    /**
     * MÃ©todo que lee los metros Ãºtiles de la propiedad. 
     * @return AvaliableSurface
     */
    public double getAvaliableSurface() {
        return AvaliableSurface;
    }
    /**
     * MÃ©todo que lee el nombre del propietario de la propiedad indicada.
     * @return Owner
     */
    public String getOwner() {
        return Owner;
    }
    /**
     * MÃ©todo que lee la direcciÃ³n del propietario.
     * @return OwnerAddress.
     */
    public String getOwnerAddress() {
        return OwnerAddress;
    }
    /**
     * MÃ©todo que lee el precio de la propiedad.
     * @return Price
     */
    public int getPrice() {
        return Price;
    }
}
