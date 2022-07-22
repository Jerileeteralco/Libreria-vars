def mostrar (Array parametros){
   sh $(parametros.Hola) | sh $(parametros.Esesto)
}

def otracosa (Map cosas) {
    sh ping ${cosas.Adios}
}
