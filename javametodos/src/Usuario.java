public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv smartTv = new SmartTv();

        


        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.aumentarVolume();
        
        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        System.out.println("Tv está no Canal " + smartTv.canal);

        System.out.println("TV ligada ?" + smartTv.ligada);
        System.out.println("Tv está no Canal " + smartTv.canal);
        System.out.println("Tv está no volume " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status desligada?" + smartTv.ligada);
    }
}
