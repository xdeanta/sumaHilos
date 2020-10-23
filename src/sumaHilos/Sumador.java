package sumaHilos;

public class Sumador extends Thread{
    private int hid;
    public Sumador(String nomb,int tid){
        super(nomb);
        hid=tid;
    }

    public int getHid(){
        return hid;
    }

    public void suma(int mod){
        int suma=0;
        switch (mod){
            case 0:
                for(int i=1;i<1000;i++){
                    if(i%2==0){
                        suma=suma+i;
                    }
                }
            break;
            case 1:
                for(int i=1;i<1000;i++){
                    if(i%2!=0){
                        suma=suma+i;
                    }
                }
            break;
            default:
                String numb=null;
                for(int i=1;i<1000;i++) {
                    numb = Integer.toString(i);
                    if (numb.charAt(numb.length()-1) == '2' || numb.charAt(numb.length()-1) == '3'){
                        suma=suma+i;
                    }
                }
            break;
        }
        System.out.println("Suma del hilo " + getHid() + ": " + suma);
    }

    @Override
    public void run() {
        //System.out.println("Hilo: " + getName());
        suma(hid);
    }
}
