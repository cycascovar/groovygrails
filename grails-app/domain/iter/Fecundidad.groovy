package iter

class Fecundidad {

	Double promHnv
	Double pRe2000
	Double pOe2000
	Double pMOE2000
	Double pFOE2000
	Double pEU2000


	static belongsTo = Localidad

	static mapping = {
		id column: 'id', generator: 'increment'
		version false
	}	

    static constraints = {
    	promHnv nullable: false
 		pRe2000 nullable: false
		pOe2000 nullable: false
		pMOE2000 nullable: false
		pFOE2000 nullable: false
		pEU2000 nullable: false
    }
}
