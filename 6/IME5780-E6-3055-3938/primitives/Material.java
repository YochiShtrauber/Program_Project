/**
 * 
 */
package primitives;

/**
 * Material class defines the kind of material that the geometry is made of it 
 * 
 * @author Yochi Shtrauber 204023055 & Rachel Stone 315353938 email:
 *         yochishtrauber@gmail.com rachelstone1996@gmail.com
 */
public class Material {
	
/**
 * the diffuse of the material
 */
	double _kD;
	
	/**
	 * the specular 
	 */
	double _kS;
	
	/**
	 * the shininess
	 */
	int _nShininess;
	
	/**
	 * constructor initialized the fields of the class
	 * 
	 * @param _kD diffuse 
	 * @param _kS specular
	 * @param _nShininess shininess
	 */
	public Material(double kD, double kS, int nShininess) {
	      _kD = kD;
	      _kS = kS;
	      _nShininess = nShininess;     
	}

	/**
	 * @return the _kD
	 */
	public double get_kD() {
		return _kD;
	}

	/**
	 * @return the _kS
	 */
	public double get_kS() {
		return _kS;
	}

	/**
	 * @return the _nShininess
	 */
	public int get_nShininess() {
		return _nShininess;
	}
     
}
