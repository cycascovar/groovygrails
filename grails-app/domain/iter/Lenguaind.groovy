package iter

class Lenguaind {
	Integer p5ymahli
	Integer p5ymahlim
	Integer p5ymahlif
	Integer p5ymaline
	Integer pm5ymaline
	Integer pf5ymaline
	Integer p5ymalies
	Integer pmymalies
	Integer pfymalies
	Integer phogind

	static belongsTo = Localidad

	static mapping = {
		id column: 'id', generator: 'assignment'
		version false
	}

    static constraints = {
		p5ymahli nullable: false
		p5ymahlim nullable: false
		p5ymahlif nullable: false
		p5ymaline nullable: false
		pm5ymaline nullable: false
		pf5ymaline nullable: false
		p5ymalies nullable: false
		pmymalies nullable: false
		pfymalies nullable: false
		phogind nullable: false
    }
}
