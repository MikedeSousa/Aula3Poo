package implementacao;

import beans.Produto;
import tools.Input;

public class ImplementarProdutoTool {

	public static void main(String[] args) {

		Produto p1 = new Produto(Input.texto("Descri��o"),
				                 Input.texto("Marca"),
				                 Input.decimal("Valor: "),
				                 Input.logico("Promo��o ?"));

		System.out.println(p1.Detalhes() + p1.isPromocao());

	}

}
