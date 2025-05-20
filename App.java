import javax.swing.JOptionPane;

public class App{
    public static int x3;

    public static void main (String [] args) throws Exception {
        
        String x1 = JOptionPane.showInputDialog("Dame el primer promedio");
        String x2 = JOptionPane.showInputDialog("Dame el segundo promedio");
        String x3 = JOptionPane.showInputDialog("Dame el tercer promedio");
        float total=(Integer.parseInt(x1)+ Integer.parseInt(x2)+ Integer.parseInt(x3))/3;
        System.out.println("Tu promedio es:"+total);
    } 
 }