package ex04;




public class Entities {
    double vect[];
    double soma;
    double media;

    public Entities(double[] vect, double soma, double media) {
        this.vect = vect;
        this.soma = soma;
        this.media = media;
    }

    public Entities(){

    }

    public double[] getVect() {
        return vect;
    }

    public void setVect(double[] vect) {
        this.vect = vect;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double somaValores(double vect[]){
        double soma = 0;
        for(int i = 0; i < vect.length; i++){
            soma += vect[i] ;

        }
        return soma;
    }

    public double mediaValores(double soma, double vect[]){
         media = soma / vect.length;
        return media;
    }

    public static void acimaDaMedia(double media, double[] vect){
        System.out.println("Notas acima da media: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] > media){
                System.out.println(vect[i]);
            }
        }


    }
}
