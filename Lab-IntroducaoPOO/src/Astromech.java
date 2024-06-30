
public class Astromech {
	
	String modelo;
	Mestre mestre;
	Sensor sensor;
	Conexao conexao;
	
	public Astromech(String modelo, Mestre mestre, Sensor sensor, Conexao conexao)
	{
		this.modelo = modelo;
		this.mestre = mestre;
		this.sensor = sensor;
		this.conexao = conexao;
	}
	
	String getDescricao()
	{
		return String.format("Astromech modelo %s. %s %s %s", 
								this.modelo, this.mestre.getDescricao(), this.sensor.getDescricao(),
								this.conexao.getDescricao());
	}
	
}
