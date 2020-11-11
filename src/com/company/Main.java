package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// hello tocayo

    Nomina nomina=new Nomina();
    ArrayList<Empleado> empleados=new ArrayList<>();
    Empleado juan=new Directo("Juan",4840000);
    Empleado julian=new Vendedor("Julian",2050000,45510000);
    Empleado johanna=new Freelancer("Johanna",71000,89);
    Empleado carolina=new Vendedor("Carolina",980000,35989000);
    Empleado david=new Directo("David",3975000);
    Empleado gustavo=new Freelancer("Gustavo",42500,65);
    Empleado pedro=new Promotor("Pedro",1200,300,62);
    nomina.getEmpleados().add(juan);
    nomina.getEmpleados().add(julian);
    nomina.getEmpleados().add(johanna);
    nomina.getEmpleados().add(carolina);
    nomina.getEmpleados().add(david);
    nomina.getEmpleados().add(gustavo);
    nomina.getEmpleados().add(pedro);

    nomina.getEmpleados().forEach(nominaactual->{StringBuilder vistaso = new StringBuilder();
            vistaso.append(nominaactual.getNombre()).append("  el salario es  : ").append(nominaactual.calcularSalario());
            System.out.println(vistaso);
        });
    }
}
