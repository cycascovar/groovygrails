package iter

class Educacion {
	
	Integer p8a14an
	Integer pM8a14an
	Integer pF8a14an
	Integer p15Maan
	Integer pF15Maan
	Integer p5Noae
	Integer pM5Noae
	Integer pF5Noae
	Integer p6a11Noa
	Integer p6a14Noa
	Integer pm6a14Noa
	Integer pf6a14Noa
	Integer p12a14Noa
	Integer p15a24a
	Integer pm15a24a
	Integer pf15a24a
	Integer p15YMase
	Integer pm15YMase
	Integer pf15YMase
	Integer p15ymebin
	Integer pm15ymebin
	Integer pf15ymebin
	Integer p15ymEbc
	Integer pm15ymEbc
	Integer pf15ymEbc
	Integer p15ymapb
	Integer pm15ymapb
	Integer pf15ymapb
	Integer graproes
	Integer gradoesM //
	Integer gradoesF

	static belongsTo = Localidad
	static mapping = {
		id column: 'id', generator: 'increment'
		version false
	}
	static constraints = {

	p8a14an nullable: false, minSize: 0, blank: false
	pM8a14an nullable: false, minSize: 0, blank: false
	pF8a14an nullable: false, minSize: 0, blank: false
	p15Maan nullable: false, minSize: 0, blank: false
	pF15Maan nullable: false, minSize: 0, blank: false
	p5Noae nullable: false, minSize: 0, blank: false
	pM5Noae nullable: false, minSize: 0, blank: false
	pF5Noae nullable: false, minSize: 0, blank: false
	p6a11Noa nullable: false, minSize: 0, blank: false
	p6a14Noa nullable: false, minSize: 0, blank: false
	pm6a14Noa nullable: false, minSize: 0, blank: false
	pf6a14Noa nullable: false, minSize: 0, blank: false
	p12a14Noa nullable: false, minSize: 0, blank: false
	p15a24a nullable: false, minSize: 0, blank: false
	pm15a24a nullable: false, minSize: 0, blank: false
	pf15a24a nullable: false, minSize: 0, blank: false
	p15YMase nullable: false, minSize: 0, blank: false
	pm15YMase nullable: false, minSize: 0, blank: false
	pf15YMase nullable: false, minSize: 0, blank: false
	p15ymebin nullable: false, minSize: 0, blank: false
	pm15ymebin nullable: false, minSize: 0, blank: false
	pf15ymebin nullable: false, minSize: 0, blank: false
	p15ymEbc nullable: false, minSize: 0, blank: false
	pm15ymEbc nullable: false, minSize: 0, blank: false
	pf15ymEbc nullable: false, minSize: 0, blank: false
	p15ymapb nullable: false, minSize: 0, blank: false
	pm15ymapb nullable: false, minSize: 0, blank: false
	pf15ymapb nullable: false, minSize: 0, blank: false
	graproes nullable: false, minSize: 0, blank: false
	gradoesM nullable: false, minSize: 0, blank: false

    }
}