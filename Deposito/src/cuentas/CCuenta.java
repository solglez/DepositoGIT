package cuentas;

/**
 * Esta clase simula comportamiento de una cuenta bancaria.
 * 
 * @author SolGlez
 * @version 2.0
 * @since 0.1
 * 
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Contructor vacío de la clase. 
     */
    public CCuenta()
    {
    }

    /**
     * Constructor completo de la clase
     * 
     * @param nom define el nombre del propietario
     * @param cue define el identificador de la cuenta
     * @param sal define el saldo de la cuenta
     * @param tipo define el tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método para consultar el saldo de la cuenta
     * 
     * @return el valor del saldo en formato double
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar dinero en la cuenta
     * 
     * @param cantidad define el dinero a ingresar
     * @throws Exception si se intenta ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta
     * 
     * @param cantidad define el dinero a retirar
     * @throws Exception si la cuenta tiene el saldo es 0 o menor, 
     * o más pequeño que la cantidad a retirar.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método para consultar el nombre del propietario
     * 
     * @return el nombre en formato String
     */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Método para definir el nombre del propietario
	 * 
	 * @param nombre en formato String
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para consultar el idenificador de la cuenta
	 * 
	 * @return el identificador en formato String
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Método para definir el identificador de la cuenta
	 * 
	 * @param cuenta en formato String
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método para consultar el saldo de la cuenta
	 * 
	 * @return saldo en formato double
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Método para definir el saldo de la cuenta
	 * 
	 * @param saldo en formato double
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método para consultar el tipo de interés
	 * 
	 * @return su valor en formato double
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	
	/**
	 * Método para definir el tipo de interés
	 * 
	 * @param tipoInteres en formato double
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
