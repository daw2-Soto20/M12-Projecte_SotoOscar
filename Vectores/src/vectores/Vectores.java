package vectores;

public class Vectores {

    public static void main(String[] args) {
        
        Operaciones v = new Operaciones();
        int x[] = new int[]{55,7,8,15,5,1540,6,10,25,37548};
        
        v.setVector(x);
        v.ordenaVector();
        v.imprimeVector();
        v.hexadecimal();
    }
    
}
