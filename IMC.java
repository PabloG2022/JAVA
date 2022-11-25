
public class IMC extends Pessoa{
	
	public double imc; 
	public IMC() {}

	public IMC(double peso, double altura, double imc) {
		super(peso, altura);
		this.imc = imc;
	}	
	
	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public double calculoIMC()  
	{ 
	this.imc = super.getPeso() / (super.getAltura() * super.getAltura()); 
	return imc; 
	}  

	 
	public void imprimirIMC()  
	{ 
	System.out.println("Seu imc �: " + imc); 
	} 
		public void classificar(double imc)  
		{ 
		if(imc >= 18.5 && imc <= 24.9)  
		{ 
	
		System.out.println("Normal");     
		} 
	
		else if(imc >= 25.0 && imc <= 29.9) 
		{ 
		System.out.println("Sobrepeso");     
		} 
	
		else if(imc >= 30.0 && imc <= 39.9) 
		{  
		System.out.println("Obesidade");     
		} 
		
		else if (imc >= 40.0) 
		{  
		System.out.println("Obesidade grave");     
		}
		}
}


