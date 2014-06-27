/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 *
 * @author Gabriel
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleados> ListEmpleados = new ArrayList<>();
       ListEmpleados.add(new Empleados ("Gabriel Mantuano",22,"1413194639",1500,"Quito","Gerente"));
       ListEmpleados.add(new Empleados ("Andreina Farfan",20,"0989635478",1500,"Guayaquil","Gerente"));
       ListEmpleados.add(new Empleados ("Sabel Mantuano",56,"131311109",900,"Manta","Sub-Gerente"));
       ListEmpleados.add(new Empleados ("Zoila Piloso",65,"131020557",900,"Manta","Recursos Humanos"));
       ListEmpleados.add(new Empleados ("Veronica Ochoa",31,"1614194624",600,"Latacunga","Departamento de Contabilidad"));
       ListEmpleados.add(new Empleados ("Ramon Delgado",22,"141211104",850,"Quito","Departamento de Marketing"));
       ListEmpleados.add(new Empleados ("Jessica Alava",23,"141145896",850,"Quito","Departamento de Marketing"));
       ListEmpleados.add(new Empleados ("Jacinto Mantuano",70,"134758962",800,"Chone","Departamento de Administracion"));
       ListEmpleados.add(new Empleados ("Tamara Bello",25,"131785963",550,"Portoviejo","Departamento de Diseño Grafico"));
       ListEmpleados.add(new Empleados ("Jenifer Bello",27,"15895623480",620,"Cuenca","Departamento de Comercio"));
       ListEmpleados.add(new Empleados ("Bladimir Solorzano",30,"1110258961",380,"Babahoyo","Departamento de Mantenimiento"));
       ListEmpleados.add(new Empleados ("Marcos Saltos",24,"0925968741",1000,"Guayaquil","Departamento de Sistema"));
       ListEmpleados.add(new Empleados ("Feliz Lopez",23,"1378965423",1000,"Manta","Departamento de Sistema"));
       ListEmpleados.add(new Empleados ("Erick Mantuano",55,"0974185296",220,"Guayaquil","Departamento de Produccion"));
       ListEmpleados.add(new Empleados ("Ambar Rodriguez",36,"1358961235",340,"Portoviejo","Departamento de Costo"));
       ListEmpleados.add(new Empleados ("Romina Dueñas",22,"1423654987",500,"Quito","Departamento de Administracion"));
       ListEmpleados.add(new Empleados ("Henry Macias",23,"0913184639",500,"Guayaquil","Departamento de Administracion"));
       ListEmpleados.add(new Empleados ("Jimmy Solorzano",26,"1313194255",380,"Manta","Departamento de Transporte"));
       ListEmpleados.add(new Empleados ("Alexis Vivas",25,"1387963124",500,"Chone","Departamento de Administracion"));
       ListEmpleados.add(new Empleados ("Eduardo Lopez",26,"1431946856",380,"Quito","Departamento de Trasporte"));
       ListEmpleados.add(new Empleados ("Gary Delgado",39,"1110254689",380,"Babahoyo","Departamento de Mantenimiento"));
       ListEmpleados.add(new Empleados ("Helen Corrales",38,"1310258977",420,"Montecristi","Departamento de Costo"));
       ListEmpleados.add(new Empleados ("Yalitza Demera",30,"1210258961",380,"Vinces","Departamento de Compras"));
       ListEmpleados.add(new Empleados ("Miriam Delgado",75,"1310258953",550,"Portoviejo","Departamento de Franquicias"));
       ListEmpleados.add(new Empleados ("Darwin Quiroz",22,"1310258974",1000,"Manta","Departamento de Sistema"));
       
       //Empleado mayor edad
       Collections.sort(ListEmpleados,(p1,p2)-> (p2.getEdad()-p1.getEdad()));
       ListEmpleados.stream().limit(1).forEach(p->{System.out.println(p.getNombre());System.out.println(p.getEdad());});
       
       //Empleado menor sueldo
       Predicate<Empleados> SueldoMenor=(p->p.getSueldo()<= 220);
       ListEmpleados.stream().filter(SueldoMenor).forEach(p->{System.out.println(p.getNombre());System.out.println(p.getSueldo());});
       
       //Empleados ciudad Manta departamento Sistema
       Predicate<Empleados> SisMan=(p->p.getCiudad()== "Manta" && p.getDepartamento()=="Departamento de Sistema");
       ListEmpleados.stream().filter(SisMan).forEach(p->{System.out.println(p.getNombre());System.out.println(p.getDepartamento());});
       
       
       //Empleados cedula Manabi y Empleados Mayor a 500
       Predicate<Empleados> CeduSuelEmple = (p->"13".equals(p.getCedula().substring(0, 2)) && p.getSueldo() > 500);
       ListEmpleados.stream().filter(SisMan).forEach(p->{System.out.println(p.getNombre());System.out.println(p.getSueldo());System.out.println(p.getCiudad());System.out.println(p.getDepartamento());});
       
       //Proemdio empleados mayor Salario
       Predicate<Empleados> SueldoPromedio =(p->p.getSueldo()>500);
       double cincoempleado=ListEmpleados.stream().filter(SueldoPromedio).limit(5).mapToDouble(p->p.getSueldo()).average().getAsDouble();
       System.out.println(cincoempleado);
       
       //Suma sueldo empelados no ciudad Manta
       Predicate<Empleados> SueldoEmpleadosNoManta =(p->p.getCiudad()!="Manta");
       double sumasueldo=ListEmpleados.stream().filter(SueldoEmpleadosNoManta).mapToDouble(p->p.getSueldo()).sum();
       System.out.println(sumasueldo);
       
       //Promedio edades empleados menores a 25
       Predicate<Empleados> EdadMenorResultante = (p->p.getEdad()<25);
       int PromedioEdad=(int)ListEmpleados.stream().filter(EdadMenorResultante).mapToDouble(p->p.getEdad()).average().getAsDouble();
       System.out.println(PromedioEdad);
       
       //Promedio edades empleados sueldo basico
       Predicate<Empleados> PromedioSueldoBasico = (p->p.getSueldo()==340);
       int BasicoPromedio=(int)ListEmpleados.stream().filter(PromedioSueldoBasico).mapToDouble(p->p.getEdad()).average().getAsDouble();
       System.out.println(BasicoPromedio);
       
       //Numero empleados por departamentos        
       Predicate<Empleados>Deprtamento_Sistemas=(p->p.getDepartamento().startsWith("Departamento de Sistema"));
       int DepartSist=(int)ListEmpleados.stream().filter(Deprtamento_Sistemas).count();
       System.out.println("Empleados departamento de Sistemas \n "+DepartSist);
       Predicate<Empleados>Gernte=(p->p.getDepartamento().startsWith("Gerente"));
       int DepartGernte=(int)ListEmpleados.stream().filter(Gernte).count();
       System.out.println("Empleados departamento de Gerencia \n "+DepartGernte); 
       Predicate<Empleados>SuGerte=(p->p.getDepartamento().startsWith("Sub-Gerente"));
       int DepartSubGernte=(int)ListEmpleados.stream().filter(SuGerte).count();
       System.out.println("Empleados departamento de Sub-Gerencia \n "+DepartSubGernte); 
       Predicate<Empleados>RecuHumano=(p->p.getDepartamento().startsWith("Recursos Humanos"));
       int DepartRHumano=(int)ListEmpleados.stream().filter(RecuHumano).count();
       System.out.println("Empleados departamento de Recursos Humanos \n "+DepartRHumano); 
       Predicate<Empleados>Departamento_Contabilidad=(p->p.getDepartamento().startsWith("Departamento de Contabilidad"));
       int DepartConta=(int)ListEmpleados.stream().filter(Departamento_Contabilidad).count();
       System.out.println("Empleados departamento de Contabilidad \n "+DepartConta);
       Predicate<Empleados>Departamento_Marketing=(p->p.getDepartamento().startsWith("Departamento de Marketing"));
       int DepartMarketing=(int)ListEmpleados.stream().filter(Departamento_Marketing).count();
       System.out.println("Empleados departamento de Marketing\n "+DepartMarketing);
       Predicate<Empleados>Departamento_Administracion=(p->p.getDepartamento().startsWith("Departamento de Administracion"));
       int DepartAdministracion=(int)ListEmpleados.stream().filter(Departamento_Administracion).count();
       System.out.println("Empleados departamento de Administracion\n "+DepartAdministracion);
       Predicate<Empleados>Departamento_Diseño=(p->p.getDepartamento().startsWith("Departamento de Diseño Grafico"));
       int DepartDiseGrafico=(int)ListEmpleados.stream().filter(Departamento_Diseño).count();
       System.out.println("Empleados departamento de Diseño Grafico\n "+DepartDiseGrafico);
       Predicate<Empleados>Departamento_Comercio=(p->p.getDepartamento().startsWith("Departamento de Comercio"));
       int DepartComen=(int)ListEmpleados.stream().filter(Departamento_Comercio).count();
       System.out.println("Empleados departamento de Comercio\n "+DepartComen);
       Predicate<Empleados>Departamento_Mantenimiento=(p->p.getDepartamento().startsWith("Departamento de Mantenimiento"));
       int DepartMante=(int)ListEmpleados.stream().filter(Departamento_Mantenimiento).count();
       System.out.println("Empleados departamento de Mantenimiento\n "+DepartMante);
       Predicate<Empleados>Departamento_Produccion=(p->p.getDepartamento().startsWith("Departamento de Produccion"));
       int DepartProdu=(int)ListEmpleados.stream().filter(Departamento_Produccion).count();
       System.out.println("Empleados departamento de Produccion\n "+DepartProdu);
       Predicate<Empleados>Departamento_Costo=(p->p.getDepartamento().startsWith("Departamento de Costo"));
       int DepartCosto=(int)ListEmpleados.stream().filter(Departamento_Costo).count();
       System.out.println("Empleados departamento de Costo\n "+DepartCosto);
       Predicate<Empleados>Departamento_Transporte=(p->p.getDepartamento().startsWith("Departamento de Transporte"));
       int DepartTrans=(int)ListEmpleados.stream().filter(Departamento_Transporte).count();
       System.out.println("Empleados departamento de Transporte\n "+DepartTrans);
       Predicate<Empleados>Departamento_Compras=(p->p.getDepartamento().startsWith("Departamento de Compras"));
       int DepartComp=(int)ListEmpleados.stream().filter(Departamento_Compras).count();
       System.out.println("Empleados departamento de Compras\n "+DepartComp);
       Predicate<Empleados>Departamento_Franquisias=(p->p.getDepartamento().startsWith("Departamento de Franquicias"));
       int DepartFranq=(int)ListEmpleados.stream().filter(Departamento_Franquisias).count();
       System.out.println("Empleados departamento de Franquisias\n "+DepartFranq);


    //Numero Empleados por ciudad
     Predicate<Empleados>Ciudad_Quito=(p->p.getCiudad().startsWith("Quito"));
     int CuiQuit=(int)ListEmpleados.stream().filter(Ciudad_Quito).count();
     System.out.println("Empleados De La Ciudad de Quito\n "+CuiQuit);
      Predicate<Empleados>Ciudad_Guayaquil=(p->p.getCiudad().startsWith("Guayaquil"));
     int CuiGuayas=(int)ListEmpleados.stream().filter(Ciudad_Guayaquil).count();
     System.out.println("Empleados De La Ciudad de Guayquil\n "+CuiGuayas);
     Predicate<Empleados>Ciudad_Manta=(p->p.getCiudad().startsWith("Manta"));
     int CuiMnat=(int)ListEmpleados.stream().filter(Ciudad_Manta).count();
     System.out.println("Empleados De La Ciudad de Manta\n "+CuiMnat);
     Predicate<Empleados>Ciudad_Latacunga=(p->p.getCiudad().startsWith("Latacunga"));
     int CuiLataga=(int)ListEmpleados.stream().filter(Ciudad_Latacunga).count();
     System.out.println("Empleados De La Ciudad de Latacunga\n "+CuiLataga);
     Predicate<Empleados>Ciudad_Chone=(p->p.getCiudad().startsWith("Chone"));
     int CuiChone=(int)ListEmpleados.stream().filter(Ciudad_Chone).count();
     System.out.println("Empleados De La Ciudad de Chone\n "+CuiChone);
     Predicate<Empleados>Ciudad_Portoviejo=(p->p.getCiudad().startsWith("Portoviejo"));
     int CuiPorvi=(int)ListEmpleados.stream().filter(Ciudad_Portoviejo).count();
     System.out.println("Empleados De La Ciudad de Portoviejo\n "+CuiPorvi); 
     Predicate<Empleados>Ciudad_Cuenca=(p->p.getCiudad().startsWith("Cuenca"));
     int CuiCuen=(int)ListEmpleados.stream().filter(Ciudad_Cuenca).count();
     System.out.println("Empleados De La Ciudad de Cuenca\n "+CuiCuen); 
     Predicate<Empleados>Ciudad_Babahoyo=(p->p.getCiudad().startsWith("Babahoyo"));
     int CuiHoyo=(int)ListEmpleados.stream().filter(Ciudad_Babahoyo).count();
     System.out.println("Empleados De La Ciudad de Babahoyo\n "+CuiHoyo);   
     Predicate<Empleados>Ciudad_Montecristi=(p->p.getCiudad().startsWith("Montecristi"));
     int CuiMonte=(int)ListEmpleados.stream().filter(Ciudad_Montecristi).count();
     System.out.println("Empleados De La Ciudad de Montecristi\n "+CuiMonte);
     Predicate<Empleados>Ciudad_Vinces=(p->p.getCiudad().startsWith("Vinces"));
     int CuiParisChikito=(int)ListEmpleados.stream().filter(Ciudad_Vinces).count();
     System.out.println("Empleados De La Ciudad de Vinces\n "+CuiParisChikito);
    }  
}

