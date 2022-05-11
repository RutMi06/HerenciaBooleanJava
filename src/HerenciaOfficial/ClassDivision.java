package HerenciaOfficial;

public class ClassDivision extends ClassPadre {
    private int numero1;
    private int numero2;
    private int numero3;

    public ClassDivision(int numero1, int numero2, int numero3) {
        if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
            this.numero1 = 0;
            this.numero2 = 0;
            this.numero3 = 0;
        } else {
            this.numero1 = numero1;
            this.numero2 = numero2;
            this.numero3 = numero3;
        }
        this.evaluarOperadores();
    }

    @Override
    public void evaluarOperadores() {
        if (this.numero1 % this.numero2 == this.numero3 || this.numero2 % this.numero1 == this.numero3) {
            this.sonIguales = true;
        }  else {
            this.sonIguales = false;
        }
    }
}


