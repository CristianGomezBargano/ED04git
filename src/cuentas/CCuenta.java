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
	private double tipoInteres;

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
	
	/**
	 * metodo para devolver el nombre
	 * @return devuelve nombre del titular
	 */
	
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
	/**
	 * metodo para devolver numero de cuenta
	 * @return devuelve numero de cuenta
	 */

	public String obtenerCuenta() {
		return get_Cuenta();
	}
	/**
	 * metodo para devolver el nombre 
	 * @return devuelve el nombre
	 */

	public String getNombre() {
		return get_Nombre();
	}
	/**
	 * asigna el nombre del usuario
	 * @param nombre nombre del usuario
	 */

	public void setNombre(String nombre) {
		this.set_Nombre(nombre);
	}
	
	/**
	 * metodo para devolver el tipo de interes aplicable
	 * @return devuelve el tipo de interes
	 */

	public double getTipoInteres() {
		return get_TipoInteres();
	}
	
	/**
	 * asigna el tipo de interes de la cuenta
	 * @param tipoInteres tipo de interes de la cuenta
	 */

	public void setTipoInteres(double tipoInteres) {
		this.set_TipoInteres(tipoInteres);
	}

	/**
	 * resultado de encapsular atributo desde aquí hasta el final de la clase, son
	 * los métodos get y set de cada uno de los atributos mencionados al principio
	 * de la clase.
	 * el primero, metodo para devolver el nombre del usuario
	 * @return nombre del usuario
	 */

	public String get_Nombre() {
		return nombre;
	}
	
	/**
	 * metodo para asignar el nombre del usuario
	 * @param nombre referencia al nombre del usuario
	 */

	public void set_Nombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * metodo para devolver el numero de cuenta
	 * @return devuelve el numero de cuenta
	 */

	public String get_Cuenta() {
		return cuenta;
	}
	
	/**
	 * metodo para asignar el numero de cuenta
	 * @param cuenta referencia a la cuenta del usuario
	 */

	public void set_Cuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * metodo para devolver el saldo de la cuenta
	 * @return devuelve el saldo existente en la cuenta
	 */

	public double get_Saldo() {
		return saldo;
	}
	
	/**
	 * metodo para asignar el saldo
	 * @param saldo referencia al saldo existente en cuenta
	 */

	public void set_Saldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * metodo para devolver el tipo de interes
	 * @return devuelve el tipo de interes
	 */

	public double get_TipoInteres() {
		return tipoInteres;
	}
	
	/**
	 * metodo para asignar el tipo de interes
	 * @param tipoInteres referencia al tipo de interes de la cuenta
	 */

	public void set_TipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}