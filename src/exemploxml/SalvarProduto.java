package exemploxml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvarProduto {

	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		
		//Adicionando um apelido
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		
		Produto panela = new Produto(1L, "panela", new BigDecimal("59.99"));
		
		String xml = xstream.toXML(panela);
		System.out.println(xml);
		
		//Mandando para um arquivo
		OutputStream outputStream = new FileOutputStream("./produto2.xml");
		xstream.toXML(panela, outputStream);
		
	}

}
