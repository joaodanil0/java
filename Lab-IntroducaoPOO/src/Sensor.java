
public class Sensor {
	
	String cor;
	double resolucao;
	int framesPorSegundo;
	
	Sensor()
	{
		
	}
	
	Sensor(String cor, double resolucao, int framesPorSegundo)
	{
		this.cor = cor;
		this.resolucao = resolucao;
		this.framesPorSegundo = framesPorSegundo;
	}
	
	double getMPixelsPorSegundo()
	{
		return this.resolucao * this.framesPorSegundo;
	}
	
	String getDescricao()
	{
		return String.format("Sensor: cor=%s, resolucao=%.1fMp, framesPorSegundo=%dfps, mPixelsPorSegundo=%.1fMpps.",
							  this.cor, this.resolucao, this.framesPorSegundo, this.getMPixelsPorSegundo());
	}
}
