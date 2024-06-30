
public class Conexao {
	
	String tipoPorta;
	int idProtocolo;
	int taxaTransmissao;
	
	Conexao()
	{
		
	}
	
	Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao)
	{
		this.tipoPorta = tipoPorta;
		this.idProtocolo = idProtocolo;
		this.taxaTransmissao = taxaTransmissao;
	}
	
	String getProtocoloString()
	{
		String protocol = "";
		
		switch(this.idProtocolo)
		{
			case 1:
				protocol = "Rotoscope";
				break;
			case 2:
				protocol = "Acustico";
				break;
			case 3:
				protocol = "Radio";
				break;
			default:
				protocol = "Outros";
		}
		return protocol;
	}
	
	double getTaxaMBps()
	{
		return this.taxaTransmissao / 1024.0;
	}
	
	String getDescricao()
	{
		return String.format("Conexao: tipoPorta=%s, protocolo=%s, taxaTransmissao=%.1fMBps.", 
								this.tipoPorta, this.getProtocoloString(), this.getTaxaMBps());
	}
	
	
}
