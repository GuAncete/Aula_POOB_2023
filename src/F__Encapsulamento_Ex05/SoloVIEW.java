package F__Encapsulamento_Ex05;
import javax.swing.JOptionPane;
public class SoloVIEW {
    public static void main(String args[]){
          try{
            SoloDTO soloDTO = new SoloDTO();
            SoloCTR soloCTR = new SoloCTR();
                    soloDTO.setPontos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pontos d'agua: ")));

                    JOptionPane.showMessageDialog(null, soloCTR.verifica(soloDTO));
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
    }
           
                
    }
}
