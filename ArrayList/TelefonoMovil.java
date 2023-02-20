package Unidad6.ArrayList;

import java.util.ArrayList;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }


    public int findContact(Contacto contacto){
        for (int i = 0; i < myContacts.size(); i++) {
            if (contacto.getName() == myContacts.get(i).getName()){
                return -1;
            }
        }
        return 0;
    }

    public int findContact(String contacto){
        for (int i = 0; i < myContacts.size(); i++) {
            if (contacto == myContacts.get(i).getName()){
                return -1;
            }
        }
        return 0;
    }

    public boolean addNewContact(Contacto contacto){
        int buscar = findContact(contacto);
        if (buscar == 0){
            myContacts.add(contacto);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contacto antiguo, Contacto nuevo){
        int buscar = findContact(antiguo);
        for (int i = 0; i < myContacts.size() ; i++) {
            if (buscar == -1){
                myContacts.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TelefonoMovil a = new TelefonoMovil("6565454");
        Contacto c = new Contacto("Antonio", "64545564");
        Contacto c2 = new Contacto("Antonio", "254665");
        System.out.println(a.addNewContact(c));
    }
}
