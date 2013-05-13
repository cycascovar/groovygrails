package iter

class Vivienda {
	Integer tvivhab
	Integer vivparha
	Integer ovivpar
	Integer provipa
	Integer procvp
	Integer vphpidt
	Integer vphconpt
	Integer vph1dor
	Integer vph2ymasd
	Integer vph1cua
	Integer vph2cua
	Integer vph3ymasc
	Integer vphexcsa
	Integer vphagdv
	Integer vphnoag
	Integer vphdren
	Integer vphnodren
	Integer vphenel
	Integer vphdree
	Integer vphnade
	Integer vphsbie
	Integer vphtv
	Integer vphrefr
	Integer vphlava
	Integer vphpc 

	//static belongsTo = Localidad

	static mapping = {
		id column: 'id', generator: 'increment'
		version false
	}

    static constraints = {
    	tvivhab nullable: true
		vivparha nullable: true
		ovivpar nullable: true
		provipa nullable: true
		procvp nullable: true
		vphpidt nullable: true
		vphconpt nullable: true
		vph1dor nullable: true
		vph2ymasd nullable: true
		vph1cua nullable: false
		vph2cua nullable: false
		vph3ymasc nullable: false
		vphexcsa nullable: false
		vphagdv nullable: false
		vphnoag nullable: false
		vphdren nullable: false
		vphnodren nullable: false 
		vphenel nullable: false
		vphdree nullable: false
		vphnade nullable: false
		vphsbie nullable: false
		vphtv nullable: false
		vphrefr nullable: false
		vphlava nullable: false
		vphpc nullable: false
    }
}
