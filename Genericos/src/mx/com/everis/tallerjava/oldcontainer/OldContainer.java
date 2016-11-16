package mx.com.everis.tallerjava.oldcontainer;

import java.util.Vector;

public class OldContainer {

	public static void main(String[] args) {
		Vector elementos = new Vector();
		elementos.add(10.5f);
		elementos.add(11.5d);
		for (int i = 0; i<elementos.size();i++){
			System.out.println(elementos.get(i));
		}

	}

}
