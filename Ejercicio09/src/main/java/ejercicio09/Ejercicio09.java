/*
Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?

        class C {

            void metodoC() throws TuException {
                sentencia_c1;
                try {
                    sentencia_c2;
                    sentencia_c3;
                } catch (MioException e) {                    
                    sentencia_c4;
                } catch (TuException e) {
                    sentencia_c5;
                    throw (e)
                } finally sentencia_c6
                }
            }
        }
RESPUESTAS:
a)El orden de ejecución completo del método metodoC de la clase C si se produce la excepción MioException es el siguiente:

    1- Ejecución de sentencia_c1.
    2- Inicio del bloque try.
    3- Ejecución de sentencia_c2 (ocurre MioException).
    4- Salto a la sentencia catch correspondiente y ejecución de sentencia_c4.
    5- Ejecución de sentencia_c6 (siempre se ejecuta, independientemente de si ocurre una excepción o no).
    6- Fin del bloque try-catch-finally.
    7- Fin del método.

b)El orden de ejecución completo del método metodoC de la clase C si NO se produce la excepción MioException es el siguiente:

    1- Ejecución de sentencia_c1.
    2- Inicio del bloque try.
    3- Ejecución de sentencia_c2.
    4- Ejecución de sentencia_c3.
    5- Ejecución de sentencia_c6 (siempre se ejecuta, independientemente de si ocurre una excepción o no).
    6- Fin del bloque try-catch-finally.
    7- Fin del método.

c)El orden de ejecución completo del método metodoC de la clase C si se produce la excepción TuException es el siguiente:

    1- Ejecución de sentencia_c1.
    2- Inicio del bloque try.
    3- Ejecución de sentencia_c2 (ocurre TuException).
    4- Salto a la sentencia catch correspondiente y ejecución de sentencia_c5.
    5- Throw e (que relanza la excepcion capturada).
    5- Ejecución de sentencia_c6 (siempre se ejecuta, independientemente de si ocurre una excepción o no).
    6- Fin del bloque try-catch-finally.
    7- Fin del método.

En el punto 4 se relanza la excepción TuException que fue capturada en el bloque catch correspondiente.
La sentencia throw se utiliza para lanzar una excepción en el lugar donde se encuentra la sentencia. 
En este caso, se utiliza throw e para lanzar la excepción capturada e (que es del tipo TuException) de 
vuelta al llamador del método metodoC.
Esto significa que, si el método metodoC es llamado desde otro método o clase, la excepción TuException 
será relanzada hacia arriba en la pila de llamadas hasta que se capture en algún otro bloque catch o hasta
que llegue al nivel más alto de la pila de llamadas y se produzca una interrupción no controlada en la ejecución
del programa. Si no se captura la excepción TuException en ningún lugar, el programa se detendrá abruptamente
y se mostrará un mensaje de error.
 */

