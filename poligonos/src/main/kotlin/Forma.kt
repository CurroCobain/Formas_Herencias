abstract class Forma(){
    open var color:String="Indeterminado"
        get():String{
            return field
        }
        set(valor:String){
            if(valor.length<20){
                field=valor
            }
        }
    abstract fun calculaArea():Double
}