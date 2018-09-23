# MANUAL DE USUARIO
> El siguiente manual de usuario contiene la informacion de las clases, metodos y funciones utilizados en el proyecto final de Programacion Avanzada del curso de Java - Nabenik 2018 seccion C.
## INDICE
1. Interface Operadores.
2. Clase Nodo.
3. Clase Pila.
4. Clase IsNumber.
5. Clase Calculadora
    * Metodo calc()
    * Metodo sumar()
    * Metodo restar()
    * Metodo multiplicar()
    * Metodo dividir()
6. Clase Menu
7. Clase CalcPrincipal
8. Enlaces a recursos

## 1. Interface Operadores
Esta clase de tipo interface contiene los operadores principales que se utilizaran para poder realizar los calculos necesarios una vez la variable que contiene la notacion sea dividida en varios tokens dependiendo de la complejidad.

Esta interface sera aplicada a la clase calculadora y es ahi donde se podran implementar los metodos.

## 2. Clase Nodo

Esta clase contiene los metodos para generar el nodo que se ha de utilizar en la pila que guardara los datos a operar. As mismo, posee el constructor que inicializara el nodo y los metodos getter y setter para obtener los datos o agregarlos a la pila

## 3. Clase Pila

En esta clase se generan las condiciones necesarias a traves de los metodos push() y pop() para poder agregar los nodos creados con los datos ingresados por el usuario. Adicionalmente,esta clase contiene el metodo estaVacia() cuya funcion es la de verificar si la pila esta vacia, si esta vacia, el dato ingresado por el usuario sera el inicio de la pila, de lo contrario, el dato ingresado sera agregado como nueva cima de la pila

## 4. Clase IsNumber
En esta clase se incluye el metodo esNumero() el cual verificara que el token generado por el metodo split() sea un numero double o una palabra reservada (se consideraran palabras reservadas PLUS, LESS, TIMES, DIVIDE)

## 5. Clase Calculadora
Esta es la clase principal desde donde se ejecutaran todas las operaciones ingresadas por el usuario desde el menu principal.
* __Metodo calc()__
Este metodo recibe un String que contiene la notacion ingresada por el usuario y desde la cual se dividira en tokens para poder verificar si el toquen es un numero double o es un operador
* __Metodo sumar()__
Este metodo procedera a hacer la sumatoria de los datos una vez identificados como numeros
* __Metodo restar()__https://github.com/secaidastudio/ProyectoFinal
Este metodo procedera a hacer la substraccion de los datos una vez identificados como numeros
* __Metodo multiplicar()__
Este metodo procedera a hacer la multiplicacion de los datos una vez identificados como numeros
* __Metodo dividir()__
Este metodo procedera a hacer la division de los datos una vez identificados como numeros
* __Metodo historial()__
Metodo que desplegara en pantalla el listado de operaciones ingresadas por el usuario asi como su resultado
* __Metodo ordenAscendente()__
Metodo que reordena el listado y lo despliegua los resultados de menor a mayor
* __Metodo ordenDescendente()__
Metodo que reordena el listado y lo despliegua los resultados de mayor a menor
* __Metodo tiempoEspera()__
Metodo de caracter cosmetico que desplegara en la pantalla un tiempo de espera mientras se reordenan los datos
* __Metodo tiempoGuardado()__
Metodo de caracter cosmetico que desplegara en la pantalla un tiempo de guardado una vez que el usuario salga del programa y se genere el archivo de texto con el historial
* __Metodo guardar()__
Metodo que procedera a generar un archivo .txt que contendra el historial de operaciones ingresadas por el usuario. Se desplegaran en la forma en que fueron ingresados por el usuario o de la forma ascendente o descendente que el usuario eligio anteriormente

## Clase Menu
Esta clase contiene el menu de opciones para ejecutar la calculadora:
1. Ingreso de la notacion postfix: En esta opcion, el usuario ingresara la notacion polaca inversa (RPN) manteniendo siempre espacios entre los digitos a ingresar. Cada vez que se ingresa una notacion RPN y el usuario presiona Enter, el programa regresara al menu principal por lo tanto si el usuario desea ingresar otra RPN, debera nuevamente seleccionar la opcion 1.

2. Mostrar historial: Esta opcion desplegara en pantalla las notaciones que hayan sido ingresadas por el usuario
3. Mostrar orden ascendente de las operaciones: Esta opcion desplegara los resultados del menor al mayor
4. Mostrar orden descendente de las operaciones: Esta opcion desplegara los resultados del mayor al menor
5. Salida: Una vez seleccionada esta opcion, se procedera a cerrar el programa y a generar el archivo .txt

## Clase CalcPrincipal
Clase principal donde se creara un objeto de tipo Menu para asi poder ejecutar la calculadora

## Enlaces externos

1. Documentacion en [javadoc](https://github.com/secaidastudio/ProyectoFinal/tree/master/secaidaStudio/dist/javadoc) 
2. Diagrama [UML](https://drive.google.com/file/d/12g0jrZHN3NraNEtpvnwNdmPKEHpVoqMy/view?usp=sharing)
3. Enlace al repositorio de [GitHub](https://github.com/secaidastudio/ProyectoFinal)
 
