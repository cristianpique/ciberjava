package barcelona.activa.cibernarium.java;

class Persona{

    final int ANY_ACTUAL=2017;

    Double pes;
    Double altura;
    Integer anynaixement;
    Double pes3;
    Double altura3;
    Double pes4;
    Double altura4;

    double calcularIMC(){

        return pes /(altura*altura);
    }

    double calcularIMC4(){

        return pes4 /(altura4*altura4);
    }

    double calcularIMC3(){

        return pes3 /(altura3*altura3);
    }

    int calcularEdad(){

        return ANY_ACTUAL-anynaixement;
    }

    public Persona(){

    }

    public Persona(double pes,double altura,int anynaixement){

        this.pes=pes;
        this.altura=altura;
        this.anynaixement=anynaixement;
    }

    public Persona(double pes4,double altura4){

        this.pes4=pes4;
        this.altura4=altura4;
    }
}

public class E3 {

    public static void main(String[]args){

        Persona p1 = new Persona();
        Persona p2 = new Persona(60.3,1.90,1994);
        Persona p3 = new Persona();
        Persona p4 = new Persona(80.5,2.25);

        p1.pes=48.5;
        p1.altura=1.60;
        p1.anynaixement=1992;
        p3.pes3=63.4;
        p3.altura3=1.99;
        System.out.print("\n L' index de Masa Corporal de la Persona 1 es : "+p1.calcularIMC());
        System.out.print("\n ");
        System.out.print("\n L' index de Masa Corporal de la Persona 2 es: "+p2.calcularIMC());
        System.out.print("\n ");
        System.out.print("\n L' index de Masa Corporal de la Persona 3 es: "+p3.calcularIMC3());
        System.out.print("\n ");
        System.out.print("\n L' index de Masa Corporal de la Persona 4 es: "+p4.calcularIMC4());
        System.out.print("\n ");
        System.out.print("\n L' edat de la Persona 1 es: "+p1.calcularEdad());
        System.out.print("\n");
        System.out.print("\n L'edat de la Persona 2 es: "+p2.calcularEdad());
        System.out.print("\n");
    }
}
