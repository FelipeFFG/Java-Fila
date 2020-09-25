public class Fila {
    private String fila[];
    private int primeiro = 0;
    private int ultimo  = -1;
    private int max = 0;
    private int tamanho = 0;

    public Fila(int max){
        this.max = max;
        fila = new String[max];
        for(int i =0;i<max;i++){
            fila[i] = null;
        }
    }

    public boolean vazia(){
        if(tamanho == 0){
            return false;
        }
        else{
           return true;
        }
    }

    public void cheia(){
        if(tamanho == max){
          if (fila[0] == null){
              System.out.println("fila esta completa, porem apresenta valores nulos");
          } else{
              System.out.println("fila esta cheia");
          }
        }
        else{
            if (fila[0] ==null){
                System.out.println("fila nao está cheia e apresenta valores nulos");
            }else{
                System.out.println("fila nao está cheia");
            }

        }
    }

    public void add_valor(int valor){
         fila[ultimo +1] = Integer.toString(valor);
         ultimo += 1;
         tamanho+=1;
        }


    public void retirar_valor(){
        if (fila[primeiro] == null){
            System.out.println("a fila esta vazia");
        }
        else{
            fila[primeiro] = null;
            primeiro += 1;
        }



    }

    public void print(){
        if (vazia()){
            for(int i =0;i<=max-1;i++){
                if (fila[i] ==null){
                    System.out.println("posição: " +i+" esta vazio");
                }else{
                    System.out.println("posição: " +i+ " esta com o valor "+ fila[i] );
                }

            }
        }

    }
}
