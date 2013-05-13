package iter

class Hogares {

	Integer hogarjm
	Integer hogarjf
	Integer phogar
	Integer phogjm
	Integer phogjf
	Integer tothog

	static belongsTo = Localidad
	static mapping = {
		id column: 'id', generator: 'increment'
		version false
	}
    static constraints = {
    	tothog nullable:false, blank: false
    	hogarjf nullable:false, blank: false
    	hogarjm nullable:false
    	phogar nullable:false
    	phogjf nullable:false
    	phogjm nullable:false
    }
}