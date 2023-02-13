import kotlin.math.*
class Circulo:Forma() {
    protected var radio:Double=0.1
        get():Double{
            return field
        }
        set(valor:Double){
            if (valor>0){
                field=valor
            }
        }
    override fun calculaArea():Double{
        return PI*(radio.pow(2))
    }
}