import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CalculadoraSoma extends JFrame{  
	
	
	JLabel titulo = new JLabel("Calculadora");
		
	JLabel labelNum1 = new JLabel("número 1");
	JLabel labelNum2 = new JLabel("número 2");
		
	JTextField numero1 = new JTextField();
	JTextField numero2 = new JTextField();
	
	JLabel resultado = new JLabel("Resultado soma = ");
	JButton soma = new JButton("somar"); 
	
	Font fonte = new Font("Arial",Font.BOLD,20);
	
	JPanel frameNum1 = new JPanel();
	JPanel frameNum2 = new JPanel();
	
  
	
CalculadoraSoma(){
		
	soma.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			int n1 = Integer.parseInt(numero1.getText());
			int n2 = Integer.parseInt(numero2.getText());
			int soma = n1+n2;
				  resultado.setText("Resultado soma = "+soma);
			}
		});
		
				
		setLayout(new GridLayout(5,4));
		add(titulo);
		add(frameNum1);
		add(frameNum2);
		frameNum1.add(labelNum1);
		frameNum2.add(labelNum2);
		frameNum1.add(numero1);
		frameNum2.add(numero2);
		
		add(soma);
		add(resultado);
		
		titulo.setFont(fonte);
		numero1.setFont(fonte);
		numero2.setFont(fonte);
		labelNum1.setFont(fonte);
		labelNum2.setFont(fonte);
		soma.setFont(fonte);
		resultado.setFont(fonte);
		numero1.setPreferredSize(new Dimension(300, 40));
		numero2.setPreferredSize(new Dimension(300, 40));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		setSize(700,400); //Tamanho janela
		setTitle("Calculadora de Somar"); 
		setLocationRelativeTo(null); 
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new CalculadoraSoma();
	}

}
