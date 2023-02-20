package Unidad6.ArrayList;

public class Contacto {
    private String name;
    private String phoneNumber;

    public Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto getName(String nombre, String numero){
        Contacto contacto = new Contacto(nombre, numero);
        return contacto;
    }


}
