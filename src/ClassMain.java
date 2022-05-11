import HerenciaOfficial. *;

public class ClassMain {
    public static void main (String[] args){

        // clase hija Suma
        ClassSuma classSuma = new ClassSuma(100, 245, 346);
        System.out.println(classSuma.getSonIguales());
        System.out.println(" ");

        // clase hija Resta
        ClassResta classResta = new ClassResta (100, 245, 146);
        System.out.println(classResta.getSonIguales());
        System.out.println(" ");

        // clase hija Division
        ClassDivision classDivision= new ClassDivision(100, 245, 45);
        System.out.println(classDivision.getSonIguales());
        System.out.println(" ");
        }
    }

