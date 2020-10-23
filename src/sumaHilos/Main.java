package sumaHilos;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Programa principal");
        Sumador[] s;
        s=new Sumador[3];
        for(int i=0;i<3;i++){
            s[i]=new Sumador("Soy " + i,i);
            s[i].start();
        }

    }
}
