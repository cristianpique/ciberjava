package barcelona.activa.cibernarium.java;

class Persona2{

    final int ANY_ACTUAL=2017;

    private Double pes;
    private Double altura;
    private Integer anynaixement;
    private Double pes3;
    private Double altura3;
    private Double pes4;
    private Double altura4;

    public double getpes(){

        return pes;
    }

    public void setpes(double pes){

        this.pes=pes;
    }

    public double getaltura(){

        return altura;
    }

    public void setaltura(double altura){

        this.altura=altura;
    }

    public double getanynaixement(){

        return anynaixement;
    }

    public void setanynaixement(int anynaixement){

        this.anynaixement=anynaixement;
    }

    public double getpes3(){

        return pes3;
    }

    public void setpes3(double pes3){

        this.pes3=pes3;
    }

    public double getaltura3(){

        return altura3;
    }

    public void setaltura3(double altura3){

        this.altura3=altura3;
    }

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

    public Persona2(){

    }

    public Persona2(double pes,double altura,int anynaixement){

        this.pes=pes;
        this.altura=altura;
        this.anynaixement=anynaixement;
    }

    public Persona2(double pes4,double altura4){

        this.pes4=pes4;
        this.altura4=altura4;
    }
}

public class E4 {

    public static void main(String[]args){

        Persona2 p1 = new Persona2();
        Persona2 p2 = new Persona2(60.3,1.90,1994);
        Persona2 p3 = new Persona2();
        Persona2 p4 = new Persona2(80.5,2.25);

        p1.setpes(48.5);
        p1.setaltura(1.60);
        p1.setanynaixement(1992);
        p3.setpes3(63.4);
        p3.setaltura3(1.99);
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