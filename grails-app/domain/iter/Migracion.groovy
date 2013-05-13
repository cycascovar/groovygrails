package iter

class Migracion {
	Integer pRe2000 //5 a 130 años
	Integer pOe2000
	Integer pMOe2000
	Integer pFOe2000
	Integer pEU2000 //5 a 130 años de edad


	static belongsTo = Localidad
		static mapping = {
		id column: 'id', generator: 'increment'
		version false
	}
    static constraints = {
    	pRe2000 nullable: false, minSize: 0, blank: false
    	pOe2000 nullable: false, minSize: 0, blank: false
    	pMOe2000 nullable: false, minSize: 0, blank: false
    	pFOe2000 nullable: false, minSize: 0, blank: false
    	pEU2000 nullable: false, minSize: 0, blank: false
    }
}
