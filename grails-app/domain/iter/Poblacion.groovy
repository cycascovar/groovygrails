package iter

class Poblacion {
	Integer pTotal
	Integer pMas
	Integer pFem
	Integer p0a4An
	Integer p0a4AMa
	Integer p0a4Fe
	Integer p0a14A
	Integer p0a14MA
	Integer p0a14FE
	Integer p5An
	Integer p5ymas
	Integer p5ymasm
	Integer p5ymasf
	Integer p6a11an
	Integer p6a14an
	Integer p6a14m
	Integer p6a14f
	Integer p12a14an
	Integer p12ymas
	Integer p15ymas
	Integer p15ymasm
	Integer p15ymasf
	Integer p15a24
	Integer pf15a49
	Integer p15a59
	Integer p15a59m
	Integer p15a59f
	Integer p18ymas
	Integer pm18ymas
	Integer pf18ymas
	Integer pm60ymas
	Integer pf60ymas
	Integer p65ymas
	Integer p65ymasm
	Integer p65ymasf
	Double relhm
	

	static belongsTo = Localidad
	static mapping = {
		id column: 'id', generator: 'increment'
		version false
	}	
    static constraints = {
	pTotal nullable: false
	pMas nullable: false
	pFem nullable: false
	p0a4An nullable: false
	p0a4AMa nullable: false
	p0a4Fe nullable: false
	p0a14A nullable: false
	p0a14MA nullable: false
	p0a14FE nullable: false
	p5An nullable: false
	p5ymas nullable: false
	p5ymasm nullable: false
	p5ymasf nullable: false
	p6a11an nullable: false
	p6a14an nullable: false
	p6a14m nullable: false
	p6a14f nullable: false
	p12a14an nullable: false
	p12ymas nullable: false
	p15ymas nullable: false
	p15ymasm nullable: false
	p15ymasf nullable: false
	p15a24 nullable: false
	pf15a49 nullable: false
	p15a59 nullable: false
	p15a59m nullable: false
	p15a59f nullable: false
	p18ymas nullable: false
	pm18ymas nullable: false
	pf18ymas nullable: false
	pm60ymas nullable: false
	pf60ymas nullable: false
	p65ymas nullable: false
	p65ymasm nullable: false
	p65ymasf nullable: false
	relhm nullable: false

    }
}
