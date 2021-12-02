package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ImplementarProduto3 {

		
		public static String texto(String msg) {
			return JOptionPane.showInputDialog(msg);
		}
		
		public static float decimal(String msg) {
			return Float.parseFloat(JOptionPane.showInputDialog(msg));
			
		}
		
		public static boolean logico(String msg) {
			if (JOptionPane.showConfirmDialog(null, msg, "Pergunta ", JOptionPane.YES_NO_OPTION) == 0 ) {
				return true;
			}
			return false;
		}
		

		public static void main(String[] args) {
			
			
		Produto p1 = new Produto(texto("Descrição"),
                                texto("Marca"), 
                                decimal("Valor: "),
                                logico("Promoção ?"));
		
		System.out.println(p1.Detalhes() + p1.isPromocao());
        
		
	}

}
