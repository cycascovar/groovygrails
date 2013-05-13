package iter

class Localidad {
	Double latitud
	Double altitud
	Double longitud
	String localidad
	Integer claveLoc
	//Integer claveMpio
	Municipio mpio
	//String claveMpioLoc/*Llave a concatenar | Llave primaria */

	static belongsTo = Municipio
	static hasMany = [viviendas:Vivienda, 
					  hogares:Hogares,
					  ed:Educacion,
					  lenguas:Lenguaind,
					  migraciones:Migracion,
					  fecundidads:Fecundidad,
					  derechoHab:Derechohabencia,
					  datosPob:Poblacion]
	/*static hasMany = [hogares:Hogares]
	static hasMany = [ed:Educacion]
	static hasMany = [lenguas:Lenguaind]
	static hasMany = [migraciones:Migracion]
	static hasMany = [fecundidads:Fecundidad]
	static hasMany = [derechoHab:Derechohabencia]
	static hasMany = [datosPob:Poblacion]*/
	static mapping = {
		id column: 'claveLoc' generator: 'increment'
		version false
	}

    static constraints = {
    	latitud nullable: false, maxSize: 6, blank: false
    	longitud nullable: false, maxSize: 7, blank: false
    	altitud nullable: false, maxSize: 4, blank: false
    	localidad nullable: false, maxSize:80, blank: false
    	mpio nullable: false, maxSize:120
    }
}
