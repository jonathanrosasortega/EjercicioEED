/**
        * Ejemplo: NumComplejo.
        *
        * @author Alguien
        * @version 1.0
        */
package ejemplos.entornos;


public class NumComplejo {
	private double pReal;
	private double pImaginaria;

	/**
     * Constructor.
     * Sin par�metros
     */
	public NumComplejo(){

	}

	/**
     * Constructor.
     * @param pReal: parte real.
     * @param pImaginaria: parte imaginaria.
     */
	public NumComplejo(double pReal, double pImaginaria){
		this.pReal=pReal;
		this.pImaginaria=pImaginaria;
	}

	/**
     * Getter.
     * @return pReal: parte real.
     */
	public double getpReal() {
		return pReal;
	}

	/**
     * Setter.
     * @set pReal: parte real.
     */
	public void setpReal(double pReal) {
		this.pReal = pReal;
	}

	/**
     * Getter.
     * @return pImaginaria: parte imaginaria.
     */
	public double getpImaginaria() {
		return pImaginaria;
	}

	/**
     * Setter.
     * @set pImaginaria: parte imaginaria.
     */
	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}

	/**
     * Suma 2 n�meros complejos.
     * @param c1 N�mero complejo 1.
     * @param c2 N�mero complejo 2.
     * @return result: resultado.
     */
	public static NumComplejo sumarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()+c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());

		return result;
	}

	/**
     * Resta 2 n�meros complejos.
     * @param c1 N�mero complejo 1.
     * @param c2 N�mero complejo 2.
     * @return result: resultado.
     */
	public static NumComplejo restarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()-c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());

		return result;
	}

	/**
     * Multiplica 2 n�meros complejos.
     * @param c1 N�mero complejo 1.
     * @param c2 N�mero complejo 2.
     * @return result: resultado.
     */
	public static NumComplejo multiplicarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		result.setpReal((a*c)-(b*d));
		result.setpImaginaria((a*d)+(b*c));

		return result;
	}

	/**
     * Divide 2 n�meros complejos.
     * @param c1 N�mero complejo 1.
     * @param c2 N�mero complejo 2.
     * @return result: resultado.
     */
	public  static NumComplejo dividirComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		double dividendoReal = (a*c)+(b*d);
		double dividendoImaginario = (b*c)-(a*d);
		double divisor = (Math.pow(c, 2)+Math.pow(d, 2));

		result.setpReal(dividendoReal/divisor);
		result.setpImaginaria(dividendoImaginario/divisor);

		return result;
	}

	/**
     * Calcula el resto de dividir 2 n�meros complejos(M�dulo).
     * @param c1 N�mero complejo 1.
     * @param c2 N�mero complejo 2.
     * @return resultado de la operaci�n.
     */
	public static double modulo (NumComplejo numComplejo){
		double real =  numComplejo.getpReal();
		double imaginaria = numComplejo.getpImaginaria();

		return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
	}

	/**
     * Override. Sobrescribe el metodo toString
     * @return mostrar: N�mero complejo.
     */
	@Override
	public String toString(){
		
		String mostrar="";
		if (pReal!=0){
			mostrar+=pReal;
		}
		if (pImaginaria>=0){
			mostrar=mostrar+"+"+pImaginaria+"i";
		}else {
			mostrar=mostrar+"-"+(pImaginaria*(-1))+"i";
		}
		return mostrar;
	}
}
