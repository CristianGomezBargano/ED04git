package cuentas;

/**
 * 
 * @author cristian
 *
 */

public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	public CCuenta() {
	}

	/**
	 * 
	 * @param nom  nombre del usuario propietario de la cuenta
	 * @param cue  numero de la cuenta
	 * @param sal  saldo de la cuenta
	 * @param tipo tipo de interes de la cuenta
	 */

	public CCuenta(String nom, String cue, double sal, double tipo) {
		set_Nombre(nom);
		set_Cuenta(cue);
		set_Saldo(sal);
	}

	/**
	 * 
	 * @param nom asigna nombre del titular
	 */
	
	public void asignarNombre(String nom) {
		setNombre(nom);
	}
	
	
	public String obtenerNombre() {
		return getNombre();
	}
	
	/**
	 * 
	 * @return devuelve el saldo de la cuenta
	 */
	
	public double estado() {
		return get_Saldo();
	}

	/**
	 * este método comprueba la cantidad a ingresar, y devuelve un error si la
	 * cantidad es menor a 0
	 * 
	 * @param cantidad recoge valor de lo que se desea ingresar
	 * @throws Exception se devuelve si la cantidad es negativa
	 */

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		set_Saldo(get_Saldo() + cantidad);
	}

	/**
	 * este método comprueba la cantidad a retirar, y devuelve error si ésta es
	 * menor a 0 ó si es mayor que el saldo existente.
	 * 
	 * @param cantidad recoge valor de lo que se desea retirar
	 * @throws Exception se devuelve si la cantidad es negativa o mayor al saldo
	 *                   existente
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		set_Saldo(get_Saldo() - cantidad);
	}

	public String obtenerCuenta() {
		return get_Cuenta();
	}

	public String getNombre() {
		return get_Nombre();
	}

	public void setNombre(String nombre) {
		this.set_Nombre(nombre);
	}

	public double getTipoInterés() {
		return get_TipoInterés();
	}

	public void setTipoInterés(double tipoInterés) {
		this.set_TipoInterés(tipoInterés);
	}

	/**
	 * resultado de encapsular atributos. Desde aquí hasta el final de la clase, son
	 * los métodos get y set de cada uno de los atributos mencionados al principio
	 * de la clase.
	 * 
	 * @return nombre del usuario, numero de cuenta, saldo y tipo de interes
	 */

	public String get_Nombre() {
		return nombre;
	}

	public void set_Nombre(String nombre) {
		this.nombre = nombre;
	}

	public String get_Cuenta() {
		return cuenta;
	}

	public void set_Cuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double get_Saldo() {
		return saldo;
	}

	public void set_Saldo(double saldo) {
		this.saldo = saldo;
	}

	public double get_TipoInterés() {
		return tipoInterés;
	}

	public void set_TipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}