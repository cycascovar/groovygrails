package iter

class Municipio {
	String municipio
	//Integer claveMpio

	//static hasMany = [localidades:Localidad]

	static mapping = {
		id column: 'claveMpio', generator: 'increment'
		version false
	}

    static constraints = {
    	municipio nullable: false, blank: false
    	claveMpio nullable: false, blank: false
    }
}
