class Rectangulo: Forma() {
    protected var lado1:Double=0.1
        get():Double{
            return field
        }
        set(valor:Double){
            if (valor>0){
                field=valor
            }
        }

    protected var lado2:Double=0.1
        get():Double{
            return field
        }
        set(valor:Double){
            if (valor>0){
                field=valor
            }
        }


    override fun calculaArea(): Double {
        return lado1*lado2
    }
}