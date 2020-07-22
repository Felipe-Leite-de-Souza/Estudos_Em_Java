package exemploxml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LendoProduto {

	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		Produto produto = (Produto) xstream.fromXML(new FileInputStream("./produto2.xml"));
		System.out.println(produto.getCodigo());
		System.out.println(produto.getDescricao());
		System.out.println(produto.getValor());
	}

}
