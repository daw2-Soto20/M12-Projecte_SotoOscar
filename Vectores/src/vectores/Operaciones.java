package vectores;

public class Operaciones {
    
    int [] vector = new int[10];
    int i,j;
    int aux;
    
    //metodos set y get
    void setVector(int v[]){
        this.vector = v;
    }
    
    int[] getVector(){
        return(this.vector);
    }
    
    //metodo para ordenar el vector de mayor a menor (metodo burbuja)
    void ordenaVector(){
        for (i=0; i<9; i++){
            for (j=i+1; j<10; j++){
                if (this.vector[j]>this.vector[i]){
                   this.aux=this.vector[i];
                   this.vector[i]=this.vector[j];
                   this.vector[j]=this.aux;
                }
            }
        }  
    }
    
    //metodo pera imprimir el vector
    void imprimeVector(){
        System.out.println("El vector ordenado: ");
        for (i=0; i<9; i++){
            System.out.print(this.vector[i] + " ");
        }
        System.out.println();
    }
    
    void hexadecimal(){
        int num = this.vector[0];
        int cociente, resto;
        int cont=0;
        char letra[] = new char[]{'A','B','C','D','E','F'}; 
        int vector_num[] = new int[4];
        
        while (num>0){
            cociente = num/16;
            resto = num%16;
            vector_num[cont] = resto;
            num = cociente;
            cont++;
        }
        System.out.print("\nEl numero mayor es " + this.vector[0] + " y en Hexadecimal es: ");
        //System.out.println(cont);
        
        for (i=cont-1; i>=0; i--){
            if (vector_num[i]>=10){
                j = vector_num[i]%10;
                System.out.print(letra[j] + "");
            }
            else{
                System.out.print(vector_num[i] + "");
            }       
        }
        System.out.println();
    }
}
