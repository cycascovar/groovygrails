package iter

class Derechohabencia {
	Integer pSinder
	Integer pDere
	Integer pIMSS
	Integer pISSTE
	Integer pSegPop

    static constraints = {
    	pSinder nullable: false, minSize: 0, blank: false
    	pDere nullable: false, minSize: 0, blank: false
    	pIMSS nullable: false, minSize: 0, blank: false
    	pISSTE nullable: false, minSize: 0, blank: false
    	pSegPop nullable: false, minSize: 0, blank: false
    }
}