package exemploxml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class CarrinhoDeCompras {

	public static void main(String[] args) throws FileNotFoundException {
		
		List<Produto> carrinho = new ArrayList<>();
		carrinho.add(new Produto(1L, "panela", new BigDecimal("59.99")));
		carrinho.add(new Produto(2L, "coifa", new BigDecimal("699.00")));
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto",  Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		xstream.alias("carrinho", List.class);
		
		OutputStream outputStream = new FileOutputStream("./carrinho.xml");
		xstream.toXML(carrinho, outputStream);
		
	}

}
