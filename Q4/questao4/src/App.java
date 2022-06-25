import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class App {
    public static void main(String[] args) throws Exception {

        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        String string = "Raquel 14 01 2000";
        String stringData= "";
        String[] split = string.split(" ");
        String dia,mes,ano;
      

        for (int i = 0; i < split.length; i++) {
            
            dia = split[1];
            mes = split[2];
            ano = split[3];
            
            stringData = dia+"/"+mes+"/"+ano;   
        }
        
        Date date = df.parse(stringData);
        
        df.format(date);
        System.out.print (split[split.length-4] + " viveu até hoje ");
        calcularDias(date);
        System.out.print (" dias.");

}
 public static void calcularDias(Date date){
    Date dateAtual = new Date( ); 
    long dt = (dateAtual.getTime() - date.getTime()) + 3600000; // 1 hora para compensar horário de verão
    dt = dt / 86400000;

    System.out.print (dt);
 }
}