package nums;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Calculadora extends JFrame implements ActionListener {
	
	//Creamos nuestra ventana
	
	JPanel base = (JPanel) this.getContentPane();
	
	//Creamos la pantalla de la calculadora
	
	TextField Pantalla = new TextField();
	
	//Creamos los botones
	
	JButton Buno = new JButton("1");
	JButton Bdos = new JButton("2");
	JButton Btres = new JButton("3");
	JButton Borrar = new JButton("Borrar");
	JButton Bcuatro = new JButton("4");
	JButton Bcinco = new JButton("5");
	JButton Bseis = new JButton("6");
	JButton Bsiete = new JButton("7");
	JButton Bocho = new JButton("8");
	JButton Bnueve = new JButton("9");
	JButton Bcero = new JButton("0");
	JButton Igual = new JButton("=");
	JButton Suma = new JButton("+");
	JButton Resta = new JButton("-");
	JButton Division = new JButton("/");
	JButton Multiplicacion = new JButton("*");
	JButton Coma = new JButton(".");
	
	
	
	
	public Calculadora() {
		//Propiedades de la calculadora
		base.setLayout(null);  //Creamos manualmente los elementos
		setSize(350,450);  //Tama�o de nuestra ventana
		setTitle("Calculadora Estandar");  //Titulo
		setVisible(true);  //Hacemos visible nuestra ventana
		
		//Propiedades de la pantalla
		
		Pantalla.setBounds(22, 8, 290, 70);
		add(Pantalla);
		
		//Propiedades de los botones
		
		Buno.setBounds(22, 83, 60, 60);
		add(Buno);
		
		Bdos.setBounds(87, 83, 60, 60);
		add(Bdos);
		
		Btres.setBounds(152, 83, 60, 60);
		add(Btres);
		
		Borrar.setBounds(217, 83, 90, 60);
		add(Borrar);
		
		Igual.setBounds(22, 343, 288, 60);
		add(Igual);
		
		Bcuatro.setBounds(22, 147, 60, 60);
		add(Bcuatro);
		
		Bcinco.setBounds(87, 147, 60, 60);
		add(Bcinco);
		
		Bseis.setBounds(152, 147, 60, 60);
		add(Bseis);
		
		Bsiete.setBounds(22, 211, 60, 60);
		add(Bsiete);
		
		Bocho.setBounds(87, 211, 60, 60);
		add(Bocho);
		
		Bnueve.setBounds(152, 211, 60, 60);
		add(Bnueve);
		
		Bcero.setBounds(87, 275, 60, 60);
		add(Bcero);
		
		Suma.setBounds(217, 147, 90, 60);
		add(Suma);
		
		Resta.setBounds(217, 211, 90, 60);
		add(Resta);
		
		Division.setBounds(152, 275, 60, 60);
		add(Division);
		
		Multiplicacion.setBounds(22, 275, 60, 60);
		add(Multiplicacion);
		
		Coma.setBounds(217, 275, 90, 60);
		add(Coma);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new Calculadora();
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
}