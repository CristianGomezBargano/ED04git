package cuentas;


public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        set_Nombre(nom);
        set_Cuenta(cue);
        set_Saldo(sal);
    }

    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }


    public double estado()
    {
        return get_Saldo();
    }


    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        set_Saldo(get_Saldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        set_Saldo(get_Saldo() - cantidad);
    }


    public String obtenerCuenta()
    {
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