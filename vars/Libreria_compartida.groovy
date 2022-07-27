def mostrar (Map parametros){
   sh echo $(parametros.Hola),
   sh echo $(parametros.Esesto)
}

def otracosa (Map cosas) {
    sh echo ping ${cosas.Adios}
}
