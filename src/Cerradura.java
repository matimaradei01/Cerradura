
public class Cerradura {

	private Integer claveDeApertura;
	private Integer cantidadFallosConsecutivosQueLaBloquean;
	private Integer cantidadFallos = 0;
	private Integer cantidadAperturas = 0;
	private boolean estadoCerradura;
	private boolean estadoBloqueo;

	public Cerradura(Integer claveDeApertura, Integer cantidadFallosConsecutivosQueLaBloquean) {

		this.claveDeApertura = claveDeApertura;
		this.cantidadFallosConsecutivosQueLaBloquean = cantidadFallosConsecutivosQueLaBloquean;

	}

	public boolean abrir(Integer clave) {

		while (this.estadoBloqueo != true) {

			if (clave.equals(claveDeApertura)) {

				this.estadoCerradura = true;
				estadoBloqueo = false;
				cantidadAperturas++;

			} else {

				cantidadFallos++;
				this.estadoCerradura = false;
				if (cantidadFallos >= cantidadFallosConsecutivosQueLaBloquean) {
					this.estadoBloqueo = true;

				}
			}
		}

		return this.estadoCerradura;

	}

	public void cerrar() {

		this.estadoCerradura = false;

	}

	public Boolean estaAbierta() {

		return this.estadoCerradura;

	}

	public Boolean estaCerrada() {

		return this.estadoCerradura;

	}

	public Boolean fueBloqueada() {

		return this.estadoBloqueo;
	}

	public Integer contarAperturarExitosas() {

		return cantidadAperturas;

	}

	public Integer contarAperturasFallidas() {

		return cantidadFallos;

	}

}