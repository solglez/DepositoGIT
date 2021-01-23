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
     * Contructor vac�o de la clase. 
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
     * @param tipo define el tipo de inter�s
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * M�todo para consultar el saldo de la cuenta
     * 
     * @return el valor del saldo en formato double
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * M�todo para ingresar dinero en la cuenta
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
     * M�todo para retirar dinero de la cuenta
     * 
     * @param cantidad define el dinero a retirar
     * @throws Exception si la cuenta tiene el saldo es 0 o menor, 
     * o m�s peque�o que la cantidad a retirar.
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
     * M�todo para consultar el nombre del propietario
     * 
     * @return el nombre en formato String
     */
	private String getNombre() {
		return nombre;
	}

	/**
	 * M�todo para definir el nombre del propietario
	 * 
	 * @param nombre en formato String
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo para consultar el idenificador de la cuenta
	 * 
	 * @return el identificador en formato String
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * M�todo para definir el identificador de la cuenta
	 * 
	 * @param cuenta en formato String
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * M�todo para consultar el saldo de la cuenta
	 * 
	 * @return saldo en formato double
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * M�todo para definir el saldo de la cuenta
	 * 
	 * @param saldo en formato double
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * M�todo para consultar el tipo de inter�s
	 * 
	 * @return su valor en formato double
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	
	/**
	 * M�todo para definir el tipo de inter�s
	 * 
	 * @param tipoInteres en formato double
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
