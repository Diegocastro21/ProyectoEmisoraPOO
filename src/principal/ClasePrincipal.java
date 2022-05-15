package principal;

import logica.*;
import java.util.Date;
public class ClasePrincipal {
    public static void main(String[] args) {

        //consorcios
        Consorcios consorcios1 = new Consorcios("Republicano", "El dormio", "Tropicana");
        Consorcios consorcios2 = new Consorcios("Cucayo", "Sol", "DC mar");
        System.out.println(consorcios1 +"\n"+ consorcios2 );
        //companiesProductoras
        CompaniesProductoras co1 = new CompaniesProductoras("Tropicana", "345", "57575757575");
        CompaniesProductoras co2 = new CompaniesProductoras("La Reina", "102", "31212312");
        CompaniesProductoras co3 = new CompaniesProductoras("Policia Nacional", "789", "35553");
        System.out.println(co1 +"\n"+ co2 +"\n"+ co3);
        //radios con emisiones
        Radios ra1 = new Radios("Sin Tapujos", "12", TipoTransmision.AM
                , new Emisiones("12 de mayo", "12:30 pm", "2 Horas", true));
        Radios ra2 = new Radios("Terror House", "56.6", TipoTransmision.FM
                , new Emisiones("10 de mayo", "10:10 pm", "5 Horas", false));
        System.out.println(ra1 +"\n"+ ra2 );
        //trabajadores
        Trabajadores ta1 = new Trabajadores("Petro", "1234313", TipoTrabajador.CONDUCTOR);
        Trabajadores ta2 = new Trabajadores("Petro", "1234313", TipoTrabajador.OPERADOR);
        Trabajadores ta3 = new Trabajadores("Petro", "1234313", TipoTrabajador.PRODUCTOR);
        System.out.println(ta1 +"\n"+ ta2 +"\n"+ ta3);
        //Programa
        Programas pro1 = new Programas("Fuente", GeneroRadial.CULTURAL, ta1, ta3, ta2);
        System.out.println(pro1);



    }
}
