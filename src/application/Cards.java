package application;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.Scene;

//Esta clase la creamos porque se usar� tanto en Cards como en el Controller.
public class Cards
{
	//Crear una lista para traer las cartas de los n�meros para desabilitarlos si no se ha iniciado el juego.
	private List<Node> cards = new ArrayList<Node>();
	//Funci�n para desactivar o activar las cartas dependiendo si se ha iniciado el juego o no.
	public void setDisabledCards(Scene scene, Boolean disable)
	{
		for (int i = 1; i <= 10; i++) {
			//Establecimos las cartas de cada n�mero con el siguiente id = #number(n�mero).
			Node card = scene.lookup(MessageFormat.format("#number{0}", i));
			//a�adimos cada carta a la lista de cartas
			cards.add(card);
		}
		System.out.println(cards);
		//Cada una de las cartas ser� desabilitada o habilitada con el m�todo setDisable
		for (Node card : cards) {
			card.setDisable(disable);
		}
	}
}
