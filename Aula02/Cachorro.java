import javax.swing.JOptionPane;
public class Cachorro{
	private String nome;

	public Cachorro(String nome){
	this.nome = nome;
}

	public void setNome(String nome){
	this.nome =nome;
}
	public String getNome(){
	return this.nome;
}

	public void latir(){
	JOptionPane.showMessageDialog(null, this.nome+" latiu.");
	//System.out.println(this.nome + " latiu.");
   }
	public void lamber(){
	JOptionPane.showMessageDialog(null, this.nome+" lambeu.");
	//System.out.println(this.nome + " lambeu");
}


}