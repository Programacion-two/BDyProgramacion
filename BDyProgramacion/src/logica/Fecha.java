package logica;

	public class Fecha {
		private int dia;
		private int mes;
		private int anio;
			
			public Fecha ()	{
				
			}
			
			public Fecha(int dia, int mes, int anio) {
				super();
				this.dia = dia;
				this.mes = mes;
				this.anio = anio;
			}
			
			
			public int getDia() {
				return dia;
			}
			public void setDia(int dia) {
				this.dia = dia;
			}
			public int getMes() {
				return mes;
			}
			public void setMes(int mes) {
				this.mes = mes;
			}
			public int getAnio() {
				return anio;

			}
			public void setAnio(int anio) {
				this.anio = anio;
			}







			@Override
			public String toString (){
						
				return dia+ "/" + mes+ "/" + anio;
			}
			
			////////////////////////////////////////////
			
			
			private boolean esBisiesto ()	{
				
				return ((anio % 4 == 0) && (anio % 100 != 0) || (anio %400 == 0));		
			}

			public boolean fechaCorrecta ()	{

				boolean diaCorrecto, mesCorrecto, anyoCorrecto;

				anyoCorrecto = (anio > 0);
				mesCorrecto = (mes >= 1) && (mes <= 12);

				switch (mes)	{

					case 2:

						if (esBisiesto ())	{

							diaCorrecto = (dia >= 1 && dia <= 29);

						} else	{

							diaCorrecto = (dia >= 1 && dia <= 28);
				}
					break;

					case 4:
					case 6:
					case 9:
					case 11:
							
						diaCorrecto = (dia >= 1 && dia <= 30);
						
						break;
				default:

					diaCorrecto = (dia >= 1 && dia <= 31);
				}

				return diaCorrecto && mesCorrecto && anyoCorrecto;

			}
			
		public void diaSiguiente2 ()	{

				
				switch (mes)	{

					case 2:

						if (esBisiesto ()&& dia < 29)	{

							dia = dia+1;

						} else	{

							dia=1;
							mes=3;
						}
						break;

					case 4:
					case 6:
					case 9:
					case 11:
							
						if(dia < 30)
							dia=dia+1;
						else{

							dia=1;
							mes=mes+1;
						}
							
						
						break;
				default:

					if(dia < 31)
						dia=dia+1;
					else{

						dia=1;
						mes=mes+1;
					}
						
				}
				if (mes == 13) {
			        mes = 1;
			        anio++;
			      }

				

			}
			
	}
			
			
			
	

